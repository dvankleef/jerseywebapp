package com.dvankleef.repository;

import com.dvankleef.model.Activity;
import com.dvankleef.model.User;

import java.util.ArrayList;
import java.util.List;

public class ActivityRepositoryStub implements ActivityRepository {

    @Override
    public List<Activity> findAllActivities() {
        List<Activity> activities = new ArrayList<Activity>();

        Activity activityOne = new Activity();
        activityOne.setDescription("Training");
        activityOne.setDuration(45);

        activities.add(activityOne);

        Activity activityTwo = new Activity();
        activityTwo.setDescription("Workshop");
        activityTwo.setDuration(120);

        activities.add(activityTwo);

        return activities;
    }

    @Override
    public Activity findActivityById(String activityId) {
        Activity activityOne = new Activity();
        activityOne.setId("1234");
        activityOne.setDescription("Training");
        activityOne.setDuration(45);

        User user = new User();
        user.setId("5678");
        user.setName("Henk");

        activityOne.setUser(user);

        return activityOne;
    }

    @Override
    public void create(Activity activity) {
        //should insert into DB
    }
}

