import java.util.Locale;
import java.util.Scanner;

public class Cantina {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Meniul zilei:");
        System.out.printf("1. %-20s %.2f lei%n", "Zeamă de casă", 24.50);
        System.out.printf("2. %-20s %.2f lei%n", "Piure cu pârjoală", 46.00);
        System.out.printf("3. %-20s %.2f lei%n", "Salată de varză", 18.00);
        System.out.printf("4. %-20s %.2f lei%n", "Compot", 12.00);

        System.out.print("Alegeți poziția: ");
        int pozitie = sc.nextInt();

        System.out.print("Numărul de porții: ");
        int portii = sc.nextInt();

        double pret = 0;

        switch (pozitie) {
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
                System.out.println("Poziție invalidă.");
        }

        if (pret > 0) {
            double total = pret * portii;
            System.out.println("Cost total: " + total + " lei");
        }
    }
}
