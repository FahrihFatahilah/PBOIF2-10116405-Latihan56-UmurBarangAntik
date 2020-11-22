/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UmurBarangAntik;

/**
 *
 * @author Fahrih Fatahilah  
 */
public class UmurBarangAntik {

 /**
 *Nama  : Fahrih Fatahilah
 *Kelas : PBO2
 *NIM   : 10116405
 *Deskripsi Program : program ini berisi program yang menampilkan umur suatu
 *                    barang antik
 */
    public static void main(String[] args) {
        // TODO code application logic here
        Radio radio = new Radio(234);
        radio.setNama("Radio AM");
        System.out.println("Nama barang antik : "+radio.getNama());
        radio.tampilUmur();
    }
    
}
