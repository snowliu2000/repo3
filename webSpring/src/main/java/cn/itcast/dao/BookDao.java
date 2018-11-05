package cn.itcast.dao;

import cn.itcast.domain.Book;


public interface BookDao {

    Book findById(int id);

    void update(Book book);

}
