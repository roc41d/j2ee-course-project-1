/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eduLibrary.persistence;

import com.eduLibrary.entities.BookBlob;
import com.eduLibrary.entities.BookEmbeddable;
import javax.ejb.Remote;
import com.eduLibrary.entities.Books;
import java.util.List;

/**
 *
 * @author rocardho
 */
@Remote
public interface LibraryPersistentBeanRemote {

    void addBook(Books bookName);

    List<Books> getBooks();
    
    void addBookEmbeddable(BookEmbeddable bookName);

    List<BookEmbeddable> getBookEmbeddable();

    void addBookBlob(BookBlob book);

    List<BookBlob> getBookBlob();
}
