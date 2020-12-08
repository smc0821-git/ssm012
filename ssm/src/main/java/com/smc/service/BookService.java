package com.smc.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.smc.dao.BookMapper;
import com.smc.pojo.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author : SongMc
 * @date : 2020/11/12 22:31
 * className : BookService
 * package: com.smc.service
 * version : 1.0
 * Description
 */
@Service
public class BookService {

    @Autowired
    BookMapper bookMapper;

    public List<Book> queryBooks(){
        PageHelper.startPage(2,3);
        List<Book> books = bookMapper.queryBooks();
        PageInfo<Book> page = new PageInfo<Book>(books);

        System.out.println("当前页：" + page.getPageNum());
        System.out.println("总页数：" + page.getPages());
        System.out.println("总记录数：" + page.getTotal());
        System.out.println("当前页是否为第一页：" + page.isIsFirstPage());
        System.out.println("当前页是否为最后一页：" + page.isIsLastPage());
        System.out.println("上一页为：" + page.getPrePage());
        System.out.println("下一页为：" + page.getNextPage());
        System.out.println("当前页的列表数据为：" + page.getList());

        return books;
    }

}
