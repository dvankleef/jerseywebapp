package com.dvankleef.client;

import com.dvankleef.model.Activity;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;

public class ActivityClient {

    private Client client;

    public ActivityClient() {
        client = ClientBuilder.newClient();
    }

    public Activity get(String id) {

        WebTarget webTarget = client.target("http://localhost:8088/api/");

        Activity response = webTarget.path("activities/" + id).request().get(Activity.class);

        return response;
    }
}
