/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ti.umy.TugasAPI.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import ti.umy.TugasAPI.service.BookService;
import ti.umy.TugasAPI.entity.Daftarbuku;


@RestController
@CrossOrigin
@RequestMapping("/book")
public class BookController {
    @Autowired
    BookService bookService;
    
    @GetMapping
    public List<Daftarbuku> getAllBooks(){
        return bookService.getAllBook();
    }
    
    @PostMapping
    @ResponseStatus
    public Daftarbuku addBook(@RequestBody Daftarbuku book){
        return bookService.addBook(book);
    }
    
    @GetMapping("/{id}")
    public Daftarbuku getBookById(@PathVariable("id") int bookId){
        return bookService.getBookById(bookId);
    }
    
    @PutMapping("/updateBook")
    public ResponseEntity<String> updateBook(@RequestBody Daftarbuku book){
        try{
            bookService.updateBook(book);
            return new ResponseEntity<>(HttpStatus.OK);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteBook(@PathVariable int id){
        try{
            bookService.deleteBookById(id);
            return new ResponseEntity<>(HttpStatus.OK);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
