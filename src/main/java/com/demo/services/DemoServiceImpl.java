package com.demo.services;

import com.demo.models.RedditResponse;
import com.demo.models.TwimlResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.inject.Inject;
import javax.inject.Singleton;

/**
 * @author Miguel Reyes
 *         Date: 10/12/15
 *         Time: 9:32 AM
 */
@Singleton
public class DemoServiceImpl implements DemoService {

    private static final Logger LOG = LoggerFactory.getLogger(DemoServiceImpl.class);

    @Inject
    private RedditApiClient redditApiClient;

    @Override
    public TwimlResponse welcome() {
        RedditResponse.Children children = redditApiClient.findRedditsTopPost().getData().getChildren().get(0);
        if (children != null) {
            String title = children.getData().getTitle();
            LOG.debug("Found title in Reddit: {}", title);
            return createResponse(title);
        } else {
            return createResponse("Could not find a top post in Reddit");
        }
    }

    private TwimlResponse createResponse(String title) {
        TwimlResponse.TwimlSay say = new TwimlResponse.TwimlSay();
        say.setText("Message from Miguel Reyes, " + title);
        say.setVoice("alice");
        TwimlResponse response = new TwimlResponse();
        response.setSay(say);
        return response;
    }
}
