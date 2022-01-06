/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ti.umy.TugasAPI.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author hp
 */
@Entity
@Table(name = "daftarbuku")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Daftarbuku.findAll", query = "SELECT d FROM Daftarbuku d"),
    @NamedQuery(name = "Daftarbuku.findById", query = "SELECT d FROM Daftarbuku d WHERE d.id = :id"),
    @NamedQuery(name = "Daftarbuku.findByNamaBuku", query = "SELECT d FROM Daftarbuku d WHERE d.namaBuku = :namaBuku"),
    @NamedQuery(name = "Daftarbuku.findByKategori", query = "SELECT d FROM Daftarbuku d WHERE d.kategori = :kategori"),
    @NamedQuery(name = "Daftarbuku.findByPenerbit", query = "SELECT d FROM Daftarbuku d WHERE d.penerbit = :penerbit"),
    @NamedQuery(name = "Daftarbuku.findByPengarang", query = "SELECT d FROM Daftarbuku d WHERE d.pengarang = :pengarang"),
    @NamedQuery(name = "Daftarbuku.findByHarga", query = "SELECT d FROM Daftarbuku d WHERE d.harga = :harga")})
public class Daftarbuku implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "namaBuku")
    private String namaBuku;
    @Basic(optional = false)
    @Column(name = "kategori")
    private String kategori;
    @Basic(optional = false)
    @Column(name = "penerbit")
    private String penerbit;
    @Basic(optional = false)
    @Column(name = "pengarang")
    private String pengarang;
    @Basic(optional = false)
    @Column(name = "harga")
    private double harga;

    public Daftarbuku() {
    }

    public Daftarbuku(Integer id) {
        this.id = id;
    }

    public Daftarbuku(Integer id, String namaBuku, String kategori, String penerbit, String pengarang, double harga) {
        this.id = id;
        this.namaBuku = namaBuku;
        this.kategori = kategori;
        this.penerbit = penerbit;
        this.pengarang = pengarang;
        this.harga = harga;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNamaBuku() {
        return namaBuku;
    }

    public void setNamaBuku(String namaBuku) {
        this.namaBuku = namaBuku;
    }

    public String getKategori() {
        return kategori;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }

    public String getPenerbit() {
        return penerbit;
    }

    public void setPenerbit(String penerbit) {
        this.penerbit = penerbit;
    }

    public String getPengarang() {
        return pengarang;
    }

    public void setPengarang(String pengarang) {
        this.pengarang = pengarang;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Daftarbuku)) {
            return false;
        }
        Daftarbuku other = (Daftarbuku) object;
        return !((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)));
    }

    @Override
    public String toString() {
//        return "ti.umy.TugasAkhirDua.Daftarbuku[ id=" + id + " ]";        
        return "BookId = " + getId() + "Nama Buku = "+ getNamaBuku()+"Kategori = "+getKategori()+"Penerbit = "+getPenerbit()+"Pengarang = "+getPengarang()+"Harga = "+getHarga();
    }
    
}
