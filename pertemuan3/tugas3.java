import java.util.Scanner;

public class tugas3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("###Biodata###");
        System.out.println("Nama    :dian");
        System.out.println("NIM     :20210801052");
        System.out.println("Email   :diansyamdova24@gmail.com");
        

        System.out.println("###Input angka###");
        int Angka1, Angka2;
        System.out.print("Angka 1 : ");
        Angka1 = input.nextInt();
        System.out.print("Angka 2 : ");
        Angka2 = input.nextInt();
        

        int Penjumlahan = Angka1 + Angka2;
        int Pengurangan = Angka1 - Angka2;
        int Perkalian = Angka1 * Angka2;
        float Pembagian = (float) Angka1 / Angka2;
        int Modulo = Angka1 % Angka2;

        System.out.println("###Perhitungan###");
        System.out.println("Penjumlahan: " + Angka1 + " + " + Angka2 + " = " + Penjumlahan);
        System.out.println("Pengurangan: " + Angka1 + " - " + Angka2 + " = " + Pengurangan);
        System.out.println("Perkalian: " + Angka1 + " * " + Angka2 + " = " + Perkalian);
        System.out.println("Pembagian: " + Angka1 + " / " + Angka2 + " = " + Pembagian);
        System.out.println("Modulo: " + Angka1 + " % " + Angka2 + " = " + Modulo);
        

        boolean no_1 = Penjumlahan % 2 >= Pembagian % 2 && Modulo % 2 <= Perkalian % 2;
        boolean no_2 = Perkalian % 2 == Pengurangan || Perkalian % 4 == Pengurangan;
        boolean no_3 = Penjumlahan <= Pengurangan + Pembagian && Perkalian >= Modulo + Pengurangan;
        boolean no_4 = !(Perkalian > Penjumlahan) && Pengurangan < Pembagian;
        boolean no_5 = Penjumlahan + Perkalian >= Pengurangan++ + Modulo;

        System.out.println("###Statement###");
        System.out.println("Statement 1 = Penjumlahan % 2 >= Pembagian % 2 && Modulo % 2 <= Perkalian % 2 ->" + no_1);
        System.out.println("Statement 2 = Perkalian % 2 == Pengurangan || Perkalian % 4 == Pengurangan ->" + no_2);
        System.out.println("Statement 3 = Penjumlahan <= Pengurangan + Pembagian && Perkalian >= Modulo + Pengurangan ->" + no_3);
        System.out.println("Statement 4 = ! (Perkalian > Penjumlahan) && Pengurangan < Pembagian ->" + no_4);
        System.out.println("Statement 5 = Penjumlahan + Perkalian >= Pengurangan++ + Modulo ->" + no_5);

    }

}