import java.util.Scanner;

class b {
    public static void main(String[] args) {
        int bilangan;
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan bilangan : ");
        bilangan = sc.nextInt();
        if (bilangan < 0) {
            System.out.println("bilangan " + bilangan + " adalah bilangan negatif");

        }
        if (bilangan > 0) {
            System.out.println("bilangan " + bilangan + " adalah bilangan positif");
        }

        if (bilangan == 0) {
            System.out.println("bilangan " + bilangan + " adalah null");
        }
    }
}