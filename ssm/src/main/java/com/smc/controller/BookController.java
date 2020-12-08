package com.smc.controller;

import com.smc.pojo.Book;
import com.smc.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author : SongMc
 * @date : 2020/11/12 22:40
 * className : BookController
 * package: com.smc.controller
 * version : 1.0
 * Description
 */
@RequestMapping("/book")
@Controller
public class BookController {

    @Autowired
    BookService bookService;

    @ResponseBody
    @RequestMapping(value = "/query")
    public List<Book> queryBooks(){
        return bookService.queryBooks();
    }


}
