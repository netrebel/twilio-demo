package com.demo.services;

import com.demo.models.Response;
import com.demo.models.Say;

import javax.inject.Singleton;

/**
 * @author Miguel Reyes
 *         Date: 10/12/15
 *         Time: 9:32 AM
 */
@Singleton
public class DemoServiceImpl implements DemoService {

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
