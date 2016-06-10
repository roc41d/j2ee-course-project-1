/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eduLibrary.stateful;

import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author rocardho
 */
@Remote
public interface LibraryStatefulSessionBeanRemote {

    void addBook(String bookName);

    List getBooks();

}
