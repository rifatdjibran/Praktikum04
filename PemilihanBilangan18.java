import java.util.Scanner;

public class PemilihanBilangan18 {
    public static void main(String[] args) {
        // Membuat scanner untuk input
        Scanner input = new Scanner(System.in);

        // input
        System.out.print("Masukkan sebuah bilangan: ");
        int bilangan = input.nextInt();

        
        if (bilangan % 2 == 0) {
            System.out.println(bilangan + " adalah bilangan genap.");
        } else {
            System.out.println(bilangan + " adalah bilangan ganjil.");
        }

        
        input.close();
    }
}
