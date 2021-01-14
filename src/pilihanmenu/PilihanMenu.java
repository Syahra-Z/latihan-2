/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pilihanmenu;

import java.util.Scanner;

/**
 *
 * @author MOKLET-01
 */
public class PilihanMenu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //memberi inputan
        Scanner masukan = new Scanner(System.in);
        //deklarasi variabel
        int pilihan=9;
        //rumus perulangan dengan menuliskan menu
        do{
            System.out.println("\nMENU LUAS BANGUN\n");
            System.out.println("1. Menghitung luas persegi");
            System.out.println("2. Menghitung luas persegi panjang");
            System.out.println("3. Keluar");
            System.out.print("Masukkan Pilihan Anda : ");
            //memasukkan pilihan dari user
            pilihan = masukan.nextInt();
        //pilihan menu yang bisa dijalankan
        switch(pilihan){
            case 1 : luasPersegi();break;
            case 2 : luasPersegiPanjang();break;
        }
        } while(pilihan!=3);
    }
    //fungsi dari pilihan menu 1
    private static void luasPersegi(){
        Scanner masukan = new Scanner (System.in);
        //deklarasi variabel
        float sisi,luas;
        System.out.print("Masukkan Nilai Sisi : ");
        //memasukkan nilai sisi dari user
        sisi = masukan.nextFloat();
        //rumus menu 1
        luas = sisi * sisi;
        //output dari menu 1
        System.out.println("Luas persegi adalah : "+luas);
    }
    //fungsi dari pilihan menu 2
    private static void luasPersegiPanjang(){
        Scanner masukan = new Scanner(System.in);
        //deklarasi variabel
        float panjang, lebar, luas;
        System.out.print("Masukkan Nilai Panjang : ");
        //memasukkan nilai panjang dari user
        panjang = masukan.nextFloat();
        System.out.print("Masukkan Nilai Lebar : ");
        //memasukkan nilai lebar dari user
        lebar = masukan.nextFloat();
        //rumus
        luas = panjang*lebar;
        //output dari menu 2
        System.out.println("Luas persegi panjang adalah : "+luas);
    }
}
