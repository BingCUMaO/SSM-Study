package top.BinGCU.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import top.BinGCU.pojo.Book;
import top.BinGCU.service.BookService;

@Controller
public class shopStore {

    @RequestMapping("/shop-store")
    public String store(){
        return "/shop-store";
    }

    /**
     * produces 用来处理返回中文为乱码的问题
     */
    @GetMapping(value = "/shop-store/buy-book/{book-name}", produces = {"text/html;charset=UTF-8;","application/json;"})
//    @GetMapping(value = "/shop-store/buy-book", produces = {"text/html;charset=UTF-8;","application/json;"})
    @ResponseBody
    public String buyBook(@PathVariable("book-name") String bookName) throws JsonProcessingException {

        ObjectMapper objectMapper = new ObjectMapper();

        BookService bookService = new BookService();
        Book book = bookService.getBook(bookName);


        if(book==null) return "很抱歉，已无库存";

        bookService.buyBook("XX", bookName);
        return objectMapper.writeValueAsString(book);
    }
}
