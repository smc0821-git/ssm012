package com.smc.dao;

import com.smc.pojo.Book;

import java.util.List;

/**
 * @author SongMc
 * @date 2020/11/12 22:17
 * @InterfaceName BookMapper
 * version : 1.0
 * Description
 **/
public interface BookMapper {

    public List<Book> queryBooks();

}
