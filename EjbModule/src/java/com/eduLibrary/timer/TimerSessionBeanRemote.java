/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eduLibrary.timer;

import javax.ejb.Remote;

/**
 *
 * @author rocardho
 */
@Remote
public interface TimerSessionBeanRemote {

    public void createTimer(long milliseconds);

}
