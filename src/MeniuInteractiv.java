import java.util.Locale;
import java.util.Scanner;

public class MeniuInteractiv {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int alegere;
        double total = 0;

        System.out.println("1 - Zeamă de casă (24.50 lei)");
        System.out.println("2 - Piure cu pârjoală (46.00 lei)");
        System.out.println("3 - Salată de varză (18.00 lei)");
        System.out.println("4 - Compot (12.00 lei)");
        System.out.println("0 - Finalizare");

        do {
            alegere = sc.nextInt();

            switch (alegere) {
                case 1:
                    total = total + 24.50;
                    break;
                case 2:
                    total = total + 46.00;
                    break;
                case 3:
                    total = total + 18.00;
                    break;
                case 4:
                    total = total + 12.00;
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Alegere invalidă.");
            }
        } while (alegere != 0);

        double reducere = 0;

        if (total > 100) {
            reducere = total * 0.15;
        }

        double sumaDePlata = total - reducere;

        System.out.printf("Total acumulat: %.2f%n", total);
        System.out.printf("Reducere: %.2f%n", reducere);
        System.out.printf("Suma de plată: %.2f%n", sumaDePlata);
    }
}
