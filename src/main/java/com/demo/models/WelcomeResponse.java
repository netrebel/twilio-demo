package com.demo.models;

/**
 * @author Miguel Reyes
 *         Date: 10/9/15
 *         Time: 3:44 PM
 */
public class WelcomeResponse {

    public Response response = new Response();

    public static class Response {
        public Say say = new Say();
    }
    public static class Say {
        public String voice;
        public String text;
    }
}
