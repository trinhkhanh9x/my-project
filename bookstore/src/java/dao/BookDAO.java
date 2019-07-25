/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import model.Book;

/**
 *
 * @author Admin
 */
public interface BookDAO {
    public Book getChiTietBook(int idBook);
    // lay thong tin book theo id
    public ArrayList<Book> gettitleBook(String title);
    // lay thong tin theo ten
   public ArrayList<Book> getListBooklanguage(String laguage);
    //lay danh sach theo ngon ngu
   public ArrayList<Book> getListBook();
    //lay tat ca sach
    boolean insertBook(Book book);
    boolean deleteBook(int idBook);
    boolean updateBook(Book book);
    boolean searchBook(Book book);
}

