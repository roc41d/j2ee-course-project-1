/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.eduLibrary.webservice;

import com.eduLibrary.entities.Books;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author rocardho
 */
@Remote
public interface LibraryBooksWebserviceBeanRemote {
    
    void addBook(Books bookName);

    List<Books> getBooks();
    
}
