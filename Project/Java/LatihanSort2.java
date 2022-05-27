/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 *
 * @author mariq
 */
import java.util.*;


public class LatihanSort2 {
    static int Pilihan;
 static ArrayList <Barang> Item = new ArrayList <Barang>();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        do {
            Tampilkan_Menu_Pilihan();
            switch (Pilihan) {
                case 1:
                    Menambahkan_Barang();
                    break;
                case 2:
                   Menampilkan_Item("List-Barang");
                    break;
                default:
                    System.exit(0);
            }
        } while (Pilihan != 3);
    }

    public static void Tampilkan_Menu_Pilihan() {
        System.out.println("==================================");
        System.out.println("Menambahkan & Menampilkan Barang");
        System.out.println("===================================");
        System.out.println("1. Menambahkan Barang");
        System.out.println("2. Menampilkan Barang");
        System.out.println("3. Exit");
        System.out.println("====================================");
        System.out.print("Pilih (1/2/3): ");
        Scanner sn = new Scanner(System.in);
        Pilihan = sn.nextInt();
    }

    public static void Menambahkan_Barang() {
        System.out.println("===============================");
        System.out.println("Masukan Data Barang");
        System.out.println("==============================");
        Scanner scr = new Scanner(System.in);
        System.out.print("Kode Barang  : ");
        int KodeBarang = scr.nextInt();
        System.out.print("Nama Barang  : ");
        scr = new Scanner(System.in);
        String NamaBarang = scr.nextLine();
        System.out.print("Harga        : ");
        scr = new Scanner(System.in);
        int Harga = scr.nextInt();
        System.out.print("Jumlah       : ");
        scr = new Scanner(System.in);
        int Jumlah = scr.nextInt();
        Item.add(new Barang (KodeBarang, NamaBarang, Harga, Jumlah));
    }


     public static void Menampilkan_Item (String Judul)
    {   System.out.println("-----------------------------------");
        System.out.println(Judul);
        Collection.sort(Item, Barang.perbedaan_barang);
         for (Barang brg : Item){
             System.out.println(brg);
         }
        
     }
       
        
    }

  
