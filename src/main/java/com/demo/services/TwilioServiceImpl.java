package com.demo.services;

import com.twilio.sdk.TwilioRestClient;
import com.twilio.sdk.TwilioRestException;
import com.twilio.sdk.resource.factory.CallFactory;
import com.twilio.sdk.resource.instance.Call;
import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.inject.Singleton;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


/**
 * @author Miguel Reyes
 *         Date: 10/9/15
 *         Time: 3:40 PM
 */
@Singleton
public class TwilioServiceImpl implements TwilioService {

    private static final Logger LOG = LoggerFactory.getLogger(TwilioServiceImpl.class);

    public static final String ACCOUNT_SID = "ACbe930b1493894647f69ac1c37d5a04f8";
    public static final String AUTH_TOKEN = "79fe06940d832b56db8eaf859e425bfc";
    private TwilioRestClient client;

    public TwilioServiceImpl() {
        client = new TwilioRestClient(ACCOUNT_SID, AUTH_TOKEN);
    }

    public void makeCall() {

        // Build a filter for the CallList
        List<NameValuePair> params = new ArrayList<>();
        params.add(new BasicNameValuePair("Url", "http://localhost:8080/twilio-demo-1.0/api/twilio/welcome"));
        params.add(new BasicNameValuePair("To", "+16179531637"));
        params.add(new BasicNameValuePair("From", "+16175130992"));

        CallFactory callFactory = client.getAccount().getCallFactory();
        try {
            Call call = callFactory.create(params);
            LOG.debug("Call made successfully {} at {}", call.getSid(), LocalDate.now());
        } catch (TwilioRestException e) {
            LOG.error("Error making the call.", e);
        }
    }
}
