package com.pahlsoft.logfarm.scheduler;

import javax.ejb.Schedule;
import javax.ejb.Stateless;
import java.util.Date;

/**
 * Created by aj on 5/5/2014. Property of Pahlsoft Copyright 2014
 *
 */

@Stateless
public class MainScheduler {

    @Schedule(second = "*/5", minute = "*", hour = "*")
    public void reportTimeEveryFiveSeconds() {
        System.out.println("Task for Every 5 Seconds: " + new Date());
    }

    @Schedule(second = "*/10", minute="*", hour="*")
    public void reportTimeEveryTenSeconds() {
        System.out.println("Task for Every 10 Seconds: " + new Date());
    }
}
