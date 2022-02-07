/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop1;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class siswa {
    static String Nama = "Caca";
    static String Jenis_kelamin = "Laki - Laki";
    static String Tempat_Tanggal_Lahir = "Dimanaaja, 31 Februari 1111";
    static String Agama = "Privasi Jigeum";
    

    void Biodata() {
        System.out.println("Nama : " + Nama);
        System.out.println("Jenis kelamin : " + Jenis_kelamin);
        System.out.println("Tempat lahir : " + Tempat_Tanggal_Lahir);
        System.out.println("Agama : " + Agama);
    }

    void Seleksi() {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nilai = ");
        int Nilai;
        Nilai = input.nextInt();
        if (Nilai < 75) {
            System.out.println("Tidak Lulus");
        } else if (Nilai >= 75 && Nilai <= 85) {
            System.out.println("Lulus dengan memuaskan");
        } else if (Nilai > 85 && Nilai <= 100) {
            System.out.println("Lulus dengan sangat Memuaskan");
        } else {
            System.out.println("Kamu ga sekolah ya?");
        }
    }
}
