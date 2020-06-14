package top.BinGCU.dao;

import top.BinGCU.pojo.Book;

public interface BookMapper {
    Book getBookByName(String name);

    int insertOneBook(Book book);

    int deleteBooksByName(String name);
}
