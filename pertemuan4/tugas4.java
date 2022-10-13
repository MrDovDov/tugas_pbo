import java.util.Scanner;
 
public class tugas4{
   public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pesan,pilih;
        String menu;
        System.out.print("Masukkan menu :");
        menu = input.next();
        System.out.print("Pilihan:\n 1. AYAM BAKAR\n 2. PECEL LELE\n 3. SEAFOOD\n 4. NASI GORENG AYAM\n 5. NASI SEAFOOD\n 6. NASI GORENG SPEASIAL\n");
        System.out.print("Masukkan Pilihan :");
        pilih = input.nextInt();
        System.out.print("Jumlah Pesan : ");
        pesan = input.nextInt();
        System.out.println("================");
        switch(pilih){
            case 1:
                System.out.println("Nama Pemesan :"+menu);
                System.out.println("Pesanan : AYAM BAKAR");
                System.out.println("Harga : 25.000");
                System.out.println("Jumlah Pesan : "+pesan);
                System.out.println("Total Bayar : "+pesan*25000);
            break;
            case 2:
                System.out.println("Nama Pemesan :"+menu);
                System.out.println("Pesanan : PECEL LELE");
                System.out.println("Harga : 15.000");
                System.out.println("Jumlah Pesan : "+pesan);
                System.out.println("Total Bayar : "+pesan*15000);
            break;
            case 3:
                System.out.println("Nama Pemesan :"+menu);
                System.out.println("Pesanan : SEAFOOD");
                System.out.println("Harga : 20.000");
                System.out.println("Jumlah Pesan : "+pesan);
                System.out.println("Total Bayar : "+pesan*20000);
            break;
            case 4:
                System.out.println("Nama Pemesan : NASI GORENG AYAM "+menu);
                System.out.println("Pesanan : ");
                System.out.println("Harga : 30.000");
                System.out.println("Jumlah Pesan : "+pesan);
                System.out.println("Total Bayar : "+pesan*30000);
            break;
            case 5:
                System.out.println("Nama Pemesan :"+menu);
                System.out.println("Pesanan : NASI GORENG SEAFOOD");
                System.out.println("Harga : 25.000");
                System.out.println("Jumlah Pesan : "+pesan);
                System.out.println("Total Bayar : "+pesan*25000);
            break;
            case 6:
                System.out.println("Nama Pemesan :"+menu);
                System.out.println("Pesanan : MIE GORENG SPESIAL");
                System.out.println("Harga : 20.000");
                System.out.println("Jumlah Pesan : "+pesan);
                System.out.println("Total Bayar : "+pesan*20000);
            break;
            default:
            System.out.println("Salah Pilih ! :(");
        }
    }
}