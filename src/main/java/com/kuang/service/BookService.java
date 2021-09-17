package com.kuang.service;

import com.kuang.pojo.Books;


import java.util.List;

/**
 * @author CC
 * @describe
 * @create 2021-09-17-22:17
 */
public interface BookService {
    //    增加一本书
    int addBook(Books books);
    //    删除一本书
    int deleteBookById(int id);
    //    更新一本书
    int updateBook(Books books);
    //    查询一本书
    Books queryBookById(int id);
    //    查询全部的书
    List<Books> queryAllBook();
}
