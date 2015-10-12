package com.demo.services;

import com.demo.models.TwimlResponse;
import com.demo.models.TwimlSay;

import javax.inject.Singleton;

/**
 * @author Miguel Reyes
 *         Date: 10/12/15
 *         Time: 9:32 AM
 */
@Singleton
public class DemoServiceImpl implements DemoService {

    @Override
    public TwimlResponse welcome() {
        TwimlSay say = new TwimlSay();
        say.setText("Hi, here I will read reddit's page.");
        say.setVoice("alice");

        TwimlResponse response = new TwimlResponse();
        response.setSay(say);
        return response;
    }
}
