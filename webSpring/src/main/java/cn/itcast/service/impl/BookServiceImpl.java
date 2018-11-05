package cn.itcast.service.impl;

import cn.itcast.dao.BookDao;
import cn.itcast.domain.Book;
import cn.itcast.service.BookService;


public class BookServiceImpl implements BookService {

   private BookDao dao;



    public void setDao(BookDao dao) {

        this.dao = dao;
    }



    public Book findById(int id) {

        return dao.findById(id);
    }



    public void update(Book book) {
        dao.update(book);
    }



    public void trans(int id, int id2, double price) {

        Book book1 = dao.findById(id);
        Book book2 = dao.findById(id2);

        book1.setPrice(book1.getPrice()-price);
        book2.setPrice(book2.getPrice()+price);



        update(book1);
       // int i = 1/0;
        update(book2);

    }
}
