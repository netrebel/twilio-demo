package com.demo.resources;

import com.demo.models.TwimlResponse;
import com.demo.services.DemoService;
import com.demo.services.TwilioService;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * @author Miguel Reyes
 *         Date: 10/9/15
 *         Time: 3:41 PM
 */
@Path("twilio")
public class DemoResource {

    @Inject
    private DemoService demoService;

    @Inject
    private TwilioService twilioService;

    @Path("/welcome")
    @GET
    @Produces(MediaType.TEXT_XML)
    public TwimlResponse welcome() {
        return demoService.welcome();
    }


    @Path("makeCall")
    @POST
    public String makeCall() {
        return twilioService.makeCall("+17035896894");
    }

    @Path("test")
    @POST
    public String testCall() {
        return twilioService.makeCall("+16179531637");
    }
}
