package com.dvankleef.client;

import com.dvankleef.model.Activity;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class ActivityClientTest {
    @Test
    public void get() throws Exception {
        ActivityClient activityClient = new ActivityClient();

        Activity activity = activityClient.get("1234");

        System.out.println(activity);

        assertNotNull(activity);
    }

}