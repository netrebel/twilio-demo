package com.demo.services;

import com.demo.models.RedditResponse;
import org.codehaus.jackson.map.DeserializationConfig;
import org.codehaus.jackson.map.ObjectMapper;

import javax.inject.Singleton;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import java.io.IOException;

/**
 * @author Miguel Reyes
 *         Date: 10/12/15
 *         Time: 10:29 AM
 */
@Singleton
public class RedditApiClient {

    //Sample:  https://www.reddit.com/.json?limit=1
    private final String URL = "https://www.reddit.com";
    //    private Gson gson;
    private ObjectMapper objectMapper;
    private Client client;

    public RedditApiClient() {
        objectMapper = new ObjectMapper();
        client = ClientBuilder.newClient();
    }

    public RedditResponse findRedditsTopPost() {
        String response = client.target(URL)
                .path(".json")
                .queryParam("limit", "1")
                .request()
                .get(String.class);
        try {
            objectMapper.configure(DeserializationConfig.Feature.FAIL_ON_UNKNOWN_PROPERTIES, false);
            return objectMapper.readValue(response, RedditResponse.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args) {
        RedditApiClient apiClient = new RedditApiClient();
        RedditResponse response = apiClient.findRedditsTopPost();
        System.out.println("response = " + response.getData().getChildren().get(0).getData().getTitle());
    }

}
