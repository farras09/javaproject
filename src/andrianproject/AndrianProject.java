/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package andrianproject;

import java.util.Scanner;

/**
 *
 * @author root
 */
public class AndrianProject {

    /**
     * @param n
     */
    public static void display(int n[]) {
        System.out.println("Menampilkan Array : ");
        for (int a = 0; a < n.length; a++) {

            System.out.print(n[a] + " ");

        }
        System.out.println();
    }

    /**
     *
     * @param n
     */
    public static void search(int n[]) {
        int b, flag = 0;
        // display(n);
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Elemen Array : ");

        b = sc.nextInt();
        for (int a = 0; a < n.length; a++) {
            
            if (n[a] == b) {
                System.out.println("Elemen ditemukan pada posisi : " + (a+1));
                //break;
                flag = 1;
            }
        }
        if (flag == 0) {
            System.out.println("Elemen " + b + " Tidak Ditemukan");
        }
    }

    /**
     *
     * @param n
     */
    public static void display_odd(int[] n) {
        System.out.println("Menampilkan Array Bilangan Ganjil : ");
        for (int a = 0; a < n.length; a++) {
            if (n[a] % 2 == 1) {

                System.out.print(n[a] + " ");
            }
        }
        System.out.println();
    }

    /**
     *
     * @param n
     */
    public static void kelipatan_tiga(int[] n) {
        System.out.println("Menampilkan Array Kelipatan 3 : ");
        for (int a = 0; a < n.length; a++) {
            if (n[a] % 3 == 0) {

                System.out.print(n[a] + " ");
            }
        }
        System.out.println();
    }

    public static void kelipatan_lima(int[] n) {
        System.out.println("Menampilkan Array Kelipatan 5 Yang Elemen Sebelumnya kelipatan 5 : ");
        for (int a = 0; a < n.length; a++) {
            if (n[a] % 5 == 0) {
                if (n[a - 1] % 5 == 0) {
                    System.out.print(n[a] + " ");
                }
            }
        }
        System.out.println();
    }

    /**
     *
     * @param n
     */
    public static void tampilkan_dua(int[] n) {
        String pref1 = "2";

        System.out.println("Menampilkan Array Yang Memiliki Angka 2 : ");

        for (int a = 0; a < n.length; a++) {

            if (String.valueOf(n[a]).startsWith(pref1) || String.valueOf(n[a]).endsWith(pref1)) {
                System.out.print(n[a] + " ");

            }

        }
        System.out.println();
    }

    public static void ganjil_diapit(int[] n) {
        System.out.println("Menampilkan Angka Ganjil Yang Diapit Angka Genap : ");

        for (int a = 0; a < n.length; a++) {

            if (n[a] % 2 == 1) {
                if (n[a - 1] % 2 == 0) {
                    System.out.print(n[a] + " ");
                }
                break;

            }

        }
        System.out.println();
    }

    public static void total(int[] n) {
        int sum = 0, hasil = 0;
        System.out.println("Menampilkan Jumlah Keselurahan Array : ");
        for (int a = 0; a < n.length; a++) {

            hasil = sum += n[a];

        }
        System.out.println(hasil);
    }

    public static void selisih(int[] n) {
        int hasil;

        hasil = 0;
        System.out.println("Menampilkan Selisih Angka - Angka dengan Angka Setelahnya : ");
        for (int a = 0; a < n.length - 1; a++) {
            if (n.length - 1 < n.length) {
                hasil = n[a + 1] - n[a];
            }

            System.out.println("Angka Sebelum : " + n[a]);
            System.out.println("Angka Sesudah : " + n[a + 1]);
            System.out.println("Selisih : " + hasil);
            //System.out.println("Array Out Of Index");                         

        }

    }

    public static void selisih_genap(int[] n) {
        int hasil;
        System.out.println("Menampilkan Selisih Angka - Angka dengan Angka Genap dengan Angka Setelahnya Yang Genap: ");
        for (int a = 0; a < n.length - 1; a++) {

            if (n[a] % 2 == 0) {
                if (n[a + 1] % 2 == 0) {
                    hasil = n[a + 1] - n[a];
                    System.out.println("Angka Sebelum : " + n[a]);
                    System.out.println("Angka Sesudah : " + n[a + 1]);
                    System.out.println("Selisih : " + hasil);
                    //break;
                }

            }

        }

    }

    public static void tampilkan_lebih_besar(int[] n) {
        System.out.println("Menampilkan Angka - Angka Yang Setelahnya Bernilai Lebih Besar: ");

        for (int a = 0; a < n.length - 1; a++) {

            if (n[a + 1] > n[a]) {
                System.out.print(n[a] + " ");

            }

        }
        System.out.println();
    }
    public static void jumlah_angka_dengan_setelahnya(int[] n) {
        System.out.println("Menampilkan Angka - Angka Yang Setelahnya Bernilai Lebih Besar: ");

        for (int a = 0; a < n.length - 1; a++) {

            if (n[a + 1] > n[a]) {
                System.out.print(n[a] + " ");

            }

        }
        System.out.println();
    }
    public static void jumlah_angka_genap(int[] n){
        
        int hasil;
        System.out.println("Menampilkan Jumlah Angka Dengan Angka Setelahnya Yang Hasil Penjumlahannya bernilai genap: ");
         for (int a = 0; a < n.length - 1; a++) {

                    hasil = n[a ] - n[a+1];
                    if(hasil%2==0){
                    System.out.println("Angka Sebelum : " + n[a]);
                    System.out.println("Angka Sesudah : " + n[a + 1]);
                    System.out.println("Selisih : " + hasil);
                    }

        }
    }
    
    public static void jumlah_selisih(int[] n){
        int hasil,hasil_selisih;

        hasil_selisih = 0;
        System.out.println("Menampilkan Angka - Angka Selisih pada poin i : ");
        for (int a = 0; a < n.length - 1; a++) {
            if (n.length - 1 < n.length) {
                hasil=n[a + 1] - n[a];
                hasil_selisih =hasil_selisih +hasil;    
             
            }
            
            
            //Tampilkan indeks dan selisih
            //System.out.println("Angka Sebelum : " + n[a]);
           // System.out.println("Angka Sesudah : " + n[a + 1]);
           //System.out.println("Jumlah Selisih : " +hasil); 
            //System.out.println("Array Out Of Index");                         

        }
        //hasil akhir
        
           System.out.println("Jumlah Selisih : " +hasil_selisih);
    }
    
    public static void jumlah_total(int[] n){
         int sum = 0, hasil;
        System.out.println("Menampilkan Jumlah Angka - Angka Di Dalam Array Dengan Angka - Angka Sebleumnya : ");
        for (int a = 0; a < n.length-1; a++) {
            
           
            hasil = sum += n[a];
            
            System.out.println(hasil + " " + n[a]+ " ");
            System.out.print(n[a+1]+" ");
            
            
            
            

        }
        System.out.println();
        
    }
     
    

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Bilangan Array
        int arr[] = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};

        //a. Method Tampilkan Array
        display(arr);

        //b. Method Cari Array
        search(arr);

        //c. Method Tampilkan Bilangan Ganjil
        display_odd(arr);

        //d. Method Tampilkan Kelipatan 3
        kelipatan_tiga(arr);

        //e. tampilkan elemen yang memiliki angka 2
        tampilkan_dua(arr);

        //f. tampilkan elemen ganjil yang diapit oleh elemen genap
        ganjil_diapit(arr);

        //g. menampilkan elemen angka kelipatan 5 yang sebelumnya juga kelipatan 5
        kelipatan_lima(arr);

        //h. menampilkan jumlah angka array
        total(arr);

        //i. menampilkan selisih angka - angka dengan angka setelahnya
        selisih(arr);

        //j. menampilkan selisih angka - angka dengan angka genap dengan angka setelahnya yang genap:
        selisih_genap(arr);

        //k. menampilkan angka - angka yang setelahnya bernilai besar
        tampilkan_lebih_besar(arr);
        
        //l.
        jumlah_angka_genap(arr);
        
         //m.
        jumlah_selisih(arr);

         //n.
        jumlah_total(arr);
    }

}
