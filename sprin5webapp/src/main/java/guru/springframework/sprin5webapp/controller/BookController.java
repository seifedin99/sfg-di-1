package guru.springframework.sprin5webapp.controller;


import guru.springframework.sprin5webapp.repositories.BookRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class BookController {
    public BookController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    BookRepository bookRepository;

    @RequestMapping("/books")
    public String getBooks(Model model) {

        model.addAttribute("books", bookRepository.findAll());

        return "books";
    }
}














//@Controller
//public class BookController {
//     BookRepository bookRepository;
//    public BookController(BookRepository bookRepository) {
//        this.bookRepository = bookRepository;
//    }
//
//
//    @RequestMapping("/books")
//    public String getBooks(Model model){
//        model.addAttribute("books",bookRepository.findAll());
//
//
//        return "books";
//    }
//
//}
