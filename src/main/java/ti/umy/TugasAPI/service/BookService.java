/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ti.umy.TugasAPI.service;

import java.util.List;
import ti.umy.TugasAPI.entity.Daftarbuku;

public interface BookService {    
    Daftarbuku addBook(Daftarbuku book);
    Daftarbuku getBookById(int bookId);
    void updateBook(Daftarbuku book);
    void deleteBookById(int bookId);
    List<Daftarbuku> getAllBook();
}
