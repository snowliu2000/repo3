package cn.itcast.dao.impl;


import cn.itcast.dao.BookDao;
import cn.itcast.domain.Book;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import java.util.List;


public class BookDaoImpl extends JdbcDaoSupport implements BookDao {


    public Book findById(int id) {

        return getJdbcTemplate().queryForObject("select * from book where id=?", new BeanPropertyRowMapper<>(Book.class), id);

    }



    public void update(Book book) {

        getJdbcTemplate().update("update book set price=? where id=?", book.getPrice(), book.getId());
    }
}
