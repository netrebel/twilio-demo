package com.demo.services;

import com.demo.models.WelcomeResponse;

/**
 * @author Miguel Reyes
 *         Date: 10/9/15
 *         Time: 3:40 PM
 */
public class TwilioServiceImpl implements TwilioService {

    @Override
    public WelcomeResponse welcome() {
        WelcomeResponse response = new WelcomeResponse();
        response.response.say.voice = "alice";
        response.response.say.text = "Thanks for the call. Configure your number's voice U R L to change this message";
        return response;
    }
}
