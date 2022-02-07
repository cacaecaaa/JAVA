/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop1;

/**
 *
 * @author Asus
 */
public class OOP1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        siswa lulus = new siswa();
        
        System.out.println("Kelulusan Siswa");
        System.out.println(" ");
        
        System.out.println("Biodata");
        lulus.Biodata();
        
        System.out.println("=================================");
        
        lulus.Seleksi();
    }
}
