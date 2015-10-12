package com.demo;

import com.twilio.sdk.TwilioRestClient;
import com.twilio.sdk.TwilioRestException;
import com.twilio.sdk.resource.factory.CallFactory;
import com.twilio.sdk.resource.instance.Call;
import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Miguel Reyes
 *         Date: 10/9/15
 *         Time: 5:13 PM
 */
public class Example {

    // Find your Account Sid and Token at twilio.com/user/account
    public static final String ACCOUNT_SID = "ACbe930b1493894647f69ac1c37d5a04f8";
    public static final String AUTH_TOKEN = "79fe06940d832b56db8eaf859e425bfc";

    public static void main(String[] args) throws TwilioRestException {
        TwilioRestClient client = new TwilioRestClient(ACCOUNT_SID, AUTH_TOKEN);

        // Build a filter for the CallList
        List<NameValuePair> params = new ArrayList<>();
        params.add(new BasicNameValuePair("Url", "http://ec2-54-236-190-91.compute-1.amazonaws.com:8080/twilio-demo-1.0/api/twilio/welcome"));
//        params.add(new BasicNameValuePair("Url", "http://ec2-54-236-190-91.compute-1.amazonaws.com:8080/twilio-demo-1.0/sample.xml"));
        params.add(new BasicNameValuePair("To", "+16179531637"));
        params.add(new BasicNameValuePair("From", "+16175130992"));

        CallFactory callFactory = client.getAccount().getCallFactory();
        Call call = callFactory.create(params);
        System.out.println(call.getSid());
    }
}
