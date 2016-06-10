/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eduLibrary.rawdatabase;

import com.eduLibrary.model.Bookss;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author rocardho
 */
@Remote
public interface LibraryBookssPersistentBeanRemote {

    void addBook(Bookss bookName);

    List<Bookss> getBooks();
}
