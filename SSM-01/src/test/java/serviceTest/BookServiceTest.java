package serviceTest;

import org.junit.Test;
import top.BinGCU.pojo.Book;
import top.BinGCU.service.BookService;

import java.util.ArrayList;
import java.util.List;

public class BookServiceTest {
    @Test
    public void buyBookTest(){
        BookService bookService = new BookService();

        bookService.buyBook("zhangsan","~");
        bookService.buyBook("zhangsan","《XX5》");
    }

    @Test
    public void puchaseTest(){
        BookService bookService = new BookService();

        List<Book> list = new ArrayList<>();
        list.add(new Book("《JJJ01》", "IIIIInfo"));
        list.add(new Book("《JJJ02》", "IIIIInfo"));
        list.add(new Book("《JJJ03》", "IIIIInfo"));
        list.add(new Book("《JJJ04》", "IIIIInfo"));
        list.add(new Book("《JJJ05》", "IIIIInfo"));
        list.add(new Book("《JJJ06》", "IIIIInfo"));
        list.add(new Book("《JJJ07》", "IIIIInfo"));
        bookService.puchase(list);
    }
}
