/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eduLibrary.interceptor;

import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;
import javax.interceptor.Interceptors;

/**
 *
 * @author rocardho
 */
@Interceptors({BusinessInterceptor.class})
@Stateless
public class LibraryBean implements LibraryBeanRemote {

    List<String> bookShelf;

    public LibraryBean() {
        bookShelf = new ArrayList<String>();
    }

    public void addBook(String bookName) {
        bookShelf.add(bookName);
    }

    public List<String> getBooks() {
        return bookShelf;

    }
}
