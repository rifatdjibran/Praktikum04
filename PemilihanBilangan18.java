import java.util.Scanner;

public class PemilihanBilangan18 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        // input
        System.out.print("Masukkan sebuah bilangan: ");
        int bilangan = input.nextInt();

        // ternary operator
        String hasil = (bilangan % 2 == 0) ? "genap" : "ganjil";
        System.out.println(bilangan + " adalah bilangan " + hasil + ".");

        
        input.close();
    }
}
