/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eduLibrary.stateless;

import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author rocardho
 */
@Remote
public interface LibraryStatelessBeanRemote {

    void addBook(String bookName);

    List getBooks();
}
