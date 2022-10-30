import java.util.Scanner;
public class b {
    public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    
      // Tetapkan daftar bilangan ke variable numbers
      int ganjil = 0;
      int genap = 0;
      int n;
      System.out.print("masukan angka :");
      n=input.nextInt();
      for(int i = 1; i<=n; i++){
        if ( i % 2 != 0){
            System.out.print(i+",");
            ganjil += i;
            }
       }
    System.out.print(" = "+ganjil);
    System.out.println(" ");

    for(int i = 1; i<=n; i++){
        if ( i % 2 == 0){
            System.out.print(i+",");
            genap += i;
            }
       }
    System.out.print(" = "+genap);
    }
  }