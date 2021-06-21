# Inheritance-Matematika2
Tugas Latihan 2 Praktikum Pewarisan

package matematika;
import java.util.Scanner;

public class pertambahanTiga extends Matematika{
   private int d;
   void Penambahantiga(int a, int b, int c){
       Scanner input = new Scanner (System.in);
       
       System.out.println(" Input Angka Pertama  : ");
       a = input.nextInt();
       System.out.println(" Input Angka Kedua    : ");
       b = input.nextInt();
       System.out.println(" Input Angka Tiga     : ");
       c = input.nextInt();
       
       d = a + b + c;
       System.out.println(" \n Hasil Penambahan     : "+d);

   }
}
