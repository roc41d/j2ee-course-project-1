/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eduLibrary.timer;

import javax.annotation.Resource;
import javax.ejb.SessionContext;
import javax.ejb.Stateless;
import javax.ejb.Timeout;
import javax.ejb.Timer;

/**
 *
 * @author rocardho
 */
@Stateless
public class TimerSessionBean implements TimerSessionBeanRemote {

    @Resource
    private SessionContext context;

    public void createTimer(long duration) {
        context.getTimerService().createTimer(duration, "Hello World!");
    }

    @Timeout
    public void timeOutHandler(Timer timer) {
        System.out.println("timeoutHandler : " + timer.getInfo());
        timer.cancel();
    }
}
