package com.dvankleef.repository;

import com.dvankleef.model.Activity;

import java.util.List;

public interface ActivityRepository {
    List<Activity> findAllActivities();

    Activity findActivityById(String activityId);

    void create(Activity activity);
}
