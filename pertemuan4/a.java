import java.util.Scanner;

class a {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Program Konversi Nilai Ke Huruf Mahasiswa");
        System.out.print("Masukkan Sebuah Nilai = ");
        int nilai = x.nextInt();
        if (nilai >= 85 && nilai <= 100) {
            System.out.println("Nilai Anda A");
        } else if (nilai >= 70 && nilai <= 84) {
            System.out.println("Nilai Anda B");
        } else if (nilai >= 60 && nilai < 70) {
            System.out.println("Nilai Anda C");
        } else if (nilai >= 50 && nilai < 60) {
            System.out.println("Nilai Anda D");
        } else {
            System.out.println("Nilai Anda E");
        }
    }

}