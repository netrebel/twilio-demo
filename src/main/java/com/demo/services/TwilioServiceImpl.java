package com.demo.services;

import com.demo.models.Response;
import com.demo.models.Say;


/**
 * @author Miguel Reyes
 *         Date: 10/9/15
 *         Time: 3:40 PM
 */
public class TwilioServiceImpl implements TwilioService {

    @Override
    public Response welcome() {
        Say say = new Say();
        say.setText("Hi, here I will read reddit's page.");
        say.setVoice("alice");

        Response response = new Response();
        response.setSay(say);
        return response;
    }
}
