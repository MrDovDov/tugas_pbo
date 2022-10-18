import java.util.Scanner;

public class d {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilih;
        String menu;
        System.out.println("SEMALAT DATANG DI RESTAURANT DAPUR LARISA DISINI MENYEDIAKAN ANEKA MENU");
        System.out.print("Nama Pemesan :");
        menu = input.next();

        System.out.print(
                "Pilihan Menu :\n 1. AYAM BAKAR\n 2. PECEL LELE\n 3. SEAFOOD\n 4. NASI GORENG AYAM\n 5. NASI GORENG SEAFOOD\n 6. MIE GORENG SPEASIAL\n");
        System.out.println("================");
        System.out.print("Pilih Menu :");
        pilih = input.nextInt();

        System.out.println("================");
        switch (pilih) {
            case 1:

                System.out.println("PESANAN : AYAM BAKAR");
                System.out.println("JUMLAH HARGA : " + 20000);
                System.out.println("PPN : " + 20000 * 0.1);
                System.out.println("TOTAL HARGA : " + 22000);
                System.out.println("TOTAL BAYAR : " + 50000);
                System.out.println("KEMBALIAN : " + 28000);
                break;
            case 2:

                System.out.println("Pesanan : PECEL LELE");
                System.out.println("jumlah Harga : " + 15000);
                System.out.println("PPN : " + 15000 * 0.1);
                System.out.println("TOTAL HARGA : " + 16500);
                System.out.println("TOTAL BAYAR : " + 50000);
                System.out.println("KEMBALIAN : " + 33500);
                break;
            case 3:

                System.out.println("Pesanan : SEAFOOD");
                System.out.println("jumlah Harga : " + 10000);
                System.out.println("PPN : " + 10000 * 0.1);
                System.out.println("TOTAL HARGA : "+ 11000);
                System.out.println("TOTAL BAYAR : " + 50000);
                System.out.println("KEMBALIAN : " + 39000);
                break;
            case 4:

                System.out.println("Pesanan : NASI GORENG AYAM");
                System.out.println("jumlah Harga : " + 25000);
                System.out.println("PPN : " + 25000 * 0.1);
                System.out.println("TOTAL HARGA : "+ 27500);
                System.out.println("TOTAL BAYAR : " + 50000);
                System.out.println("KEMBALIAN : " + 22500);
                break;
            case 5:

                System.out.println("Pesanan : NASI GORENG SEAFOOD");
                System.out.println("jumlah Harga : " + 20000);
                System.out.println("PPN : " + 20000 * 0.1);
                System.out.println("TOTAL HARGA : "+ 22000);
                System.out.println("TOTAL BAYAR : " + 50000);
                System.out.println("KEMBALIAN : " + 28000);
                break;
            case 6:

                System.out.println("Pesanan : MIE GORENG SPESIAL");
                System.out.println("jumlah Harga : " + 30000);
                System.out.println("PPN : " + 30000 * 0.1);
                System.out.println("TOTAL HARGA : "+ 33000);
                System.out.println("TOTAL BAYAR : " + 50000);
                System.out.println("KEMBALIAN : " + 17000);
                break;
            default:
                System.out.println("Salah Pilih ! :(");
        }
    }
}