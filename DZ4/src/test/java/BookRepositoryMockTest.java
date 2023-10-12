import org.example.Book;
import org.example.BookRepository;
import org.example.BookService;
import org.example.InMemoryBookRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class BookRepositoryMockTest {

    @Test
    void  test(){

        BookRepository dummyBookRepository = mock(BookRepository.class);
        Book book1 = new Book("1", "Book1", "Author1");
        Book book2 = new Book("1", "Book1", "Author1");
        List<Book> books = new ArrayList<>();
        books.add(book1);
        books.add(book2);

        when(dummyBookRepository.findById("1")).thenReturn(book1);
        when(dummyBookRepository.findAll()).thenReturn(books);

        BookService bookService = new BookService(dummyBookRepository);

        Assertions.assertEquals(bookService.findBookById("1"), book1);
        Assertions.assertEquals(bookService.findAllBooks(), books);





    }
}
