package com.kuang.service;

import com.kuang.dao.BookMapper;
import com.kuang.pojo.Books;

import java.util.List;

/**
 * @author CC
 * @describe
 * @create 2021-09-17-22:18
 */
public class BookServiceImpl implements BookService{
//    service层调dao层 组合Dao
    private BookMapper bookMapper;

    public void setBookMapper(BookMapper bookMapper) {
        this.bookMapper = bookMapper;
    }

    public int addBook(Books books) {
        return bookMapper.addBook(books);
    }

    public int deleteBookById(int id) {
        return bookMapper.deleteBookById(id);
    }

    public int updateBook(Books books) {
        return bookMapper.updateBook(books);
    }

    public Books queryBookById(int id) {
        return bookMapper.queryBookById(id);
    }

    public List<Books> queryAllBook() {
        return bookMapper.queryAllBook();
    }
}
