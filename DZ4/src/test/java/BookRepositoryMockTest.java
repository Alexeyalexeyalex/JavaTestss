import org.example.BookRepository;
import org.example.BookService;
import org.example.InMemoryBookRepository;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class BookRepositoryMockTest {

    @Test
    void  test(){

        InMemoryBookRepository dummyInMemoryBookRepository = mock(InMemoryBookRepository.class);

//        InMemoryBookRepository IMBR = new InMemoryBookRepository();
        BookService bookService = new BookService(dummyInMemoryBookRepository);
        when();


        System.out.println(bookService.findBookById("1").getAuthor());

    }
}
