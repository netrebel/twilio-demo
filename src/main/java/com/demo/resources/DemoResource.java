package com.demo.resources;

import com.demo.models.Response;
import com.demo.services.TwilioService;

import javax.inject.Inject;
import javax.ws.rs.GET;
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
    private TwilioService twilioService;

    @Path("/welcome")
    @GET
    @Produces(MediaType.TEXT_XML)
    public Response welcome() {
        return twilioService.welcome();
    }
}
