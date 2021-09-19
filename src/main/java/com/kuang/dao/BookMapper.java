package com.kuang.dao;

import com.kuang.pojo.Books;
import lombok.NoArgsConstructor;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author CC
 * @describe
 * @create 2021-09-17-21:58
 */
public interface BookMapper {
//    增加一本书
    int addBook(Books books);
//    删除一本书
    int deleteBookById(@Param("bookID")int id);
//    更新一本书
    int updateBook(Books books);
//    查询一本书
    Books queryBookById(@Param("bookID")int id);
//    查询全部的书
    List<Books> queryAllBook();
//    通过书名查询书
    Books queryBookByName(@Param("bookName") String bookName);
}
