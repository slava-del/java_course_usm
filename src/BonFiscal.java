import java.util.Locale;
import java.util.Scanner;

public class BonFiscal {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int produs = sc.nextInt();
        int portii = sc.nextInt();
        int bursier = sc.nextInt();

        double pret = 0;

        switch (produs) {
            case 1:
                pret = 24.50;
                break;
            case 2:
                pret = 46.00;
                break;
            case 3:
                pret = 18.00;
                break;
            case 4:
                pret = 12.00;
                break;
            default:
                System.out.println("Produs invalid.");
        }

        if (pret > 0) {
            double subtotal = pret * portii;
            double reducere = 0;

            if (bursier == 1) {
                reducere = subtotal * 0.15;
            }

            double sumaFaraTva = subtotal - reducere;
            double tva = sumaFaraTva * 0.20;
            double total = sumaFaraTva + tva;

            System.out.printf("Subtotal: %.2f%n", subtotal);
            System.out.printf("Reducere: %.2f%n", reducere);
            System.out.printf("TVA: %.2f%n", tva);
            System.out.printf("Total: %.2f%n", total);
        }
    }
}
