/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ti.umy.TugasAPI.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ti.umy.TugasAPI.repository.BookRepository;
import ti.umy.TugasAPI.entity.Daftarbuku;

/**
 *
 * @author hp
 */
@Service
public class BookServiceImpl implements BookService{
    
    @Autowired
    private BookRepository repository;
    
    @Override
    public Daftarbuku addBook(Daftarbuku book) {
        return repository.save(book);
    }

    @Override
    public Daftarbuku getBookById(int bookId) {
        return repository.findById(bookId).get();
    }

    @Override
    public void updateBook(Daftarbuku book) {
        Daftarbuku bookDB = repository.findById(book.getId()).orElseThrow();
        repository.save(book);
    }

    @Override
    public void deleteBookById(int bookId) {
        try{
            repository.deleteById(bookId);
        }
        catch(Exception e){
            throw new RuntimeException(e.getMessage());
        }
    }

    @Override
    public List<Daftarbuku> getAllBook() {
        return repository.findAll();
    }
    
}
