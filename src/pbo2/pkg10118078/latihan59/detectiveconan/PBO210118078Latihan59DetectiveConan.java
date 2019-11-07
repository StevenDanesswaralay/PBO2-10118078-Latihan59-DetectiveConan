/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118078.latihan59.detectiveconan;
import java.util.Scanner;
/**
 *
 * @author         
 * Nama     : Steven Danesswaralay
 * Kelas    : IF-2
 * Nim      : 10118078
 * Deskripsi Tugas : Detective Conan
 */
public class PBO210118078Latihan59DetectiveConan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        Pemeran pemeran = new Pemeran();
        
        System.out.println("===Tokoh Dalam Detektif Konan===");
        System.out.println("---Berdasarkan Keahliannya---");
        pemeran.tampilDaftarKeahlian();
        pemeran.setKeahlian(scanner.nextInt());
        
        System.out.println("");
        
        pemeran.tampilKeahlian(pemeran.getKeahlian());
    }
    
}
