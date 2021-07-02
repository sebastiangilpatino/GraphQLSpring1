package books.service;

import books.data.BookRepository;
import books.domain.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;

@Service
public class BookService {

    @Autowired
    BookRepository bookRepository;

    public Book add(String isbn, String title, double price, String author){
       return bookRepository.save(new Book(isbn,title,price,author));
    }

    public Book update(Book book){
        return bookRepository.save(book);
    }

    public Book findByIsbn(String isbn){
        return bookRepository.findByIsbn(isbn);
    }

    public List<Book> findByAuthor(String author){
        return bookRepository.findByAuthor(author);
    }

    public Book delete(String isbn){
        return bookRepository.delete(isbn);
    }

    public Collection<Book> findAll(){
        return bookRepository.findAll();
    }
}
