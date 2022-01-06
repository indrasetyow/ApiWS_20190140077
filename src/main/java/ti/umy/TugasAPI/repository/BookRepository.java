/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ti.umy.TugasAPI.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ti.umy.TugasAPI.entity.Daftarbuku;


public interface BookRepository extends JpaRepository<Daftarbuku, Integer>{
    
}
