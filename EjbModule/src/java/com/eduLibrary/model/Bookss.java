/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eduLibrary.model;

import java.io.Serializable;

/**
 *
 * @author rocardho
 */
public class Bookss implements Serializable {

    private int id;
    private String name;

    public Bookss() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
