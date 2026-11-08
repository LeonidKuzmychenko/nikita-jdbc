package lk.tech.nikitalessonjdbc.controller;

import lk.tech.nikitalessonjdbc.entity.BookEntity;
import lk.tech.nikitalessonjdbc.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/books")
@RequiredArgsConstructor
public class BookController {

    private final BookService bookService;

    public List<BookEntity> getAll() {
        return bookService.getAll();
    }

    public BookEntity getById(Long id) {
        //return bookService.getById(id)TODO;
        throw  new UnsupportedOperationException("Not supported yet.");
    }

    public BookEntity putOne(BookEntity bookEntity) {
       // return bookService.putOne(bookEntity)TODO;
        throw  new UnsupportedOperationException("Not supported yet.");
    }

    public BookEntity postOne(BookEntity bookEntity) {
        return bookService.postOne(bookEntity);
    }

    public void deleteOne(Long id) {
        bookService.deleteOne(id);
    }

    public void deleteAll() {
        bookService.deleteAll();
    }


}
