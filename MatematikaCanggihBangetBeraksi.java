# Inheritance-Matematika2
Tugas Latihan 2 Praktikum Pewarisan

package matematika;
public class MatematikaCanggihBangetBeraksi {
    public static void main(String[] args) {
        
        matematika_canggih MTK = new matematika_canggih();
        pertambahanTiga MTK2 = new pertambahanTiga();
        
        MTK.Penambahan('a','b');
        
        MTK.Perkalian('a', 'b');
               
        MTK.Modulus('a', 'b');
        
        MTK2.Penambahantiga('a', 'b', 'c');
        
    }
}
