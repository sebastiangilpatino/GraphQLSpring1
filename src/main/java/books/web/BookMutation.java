package books.web;

import books.domain.Book;
import books.service.BookService;
import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BookMutation implements GraphQLMutationResolver {

    @Autowired
    private BookService bookService;

    public Book addBook(String isbn, String title, double price, String author) {
        return bookService.add(isbn, title, price, author);
    }

    public Book deleteBook(String isbn) {
        return bookService.delete(isbn);
    }

    public Book updateBook(String isbn, String title, double price, String author) {
        return bookService.update(new Book(isbn, title, price, author));
    }
}
