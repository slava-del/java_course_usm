import java.util.Locale;
import java.util.Scanner;

public class BonDetaliat {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int alegere;
        int zeama = 0;
        int piure = 0;
        int salata = 0;
        int compot = 0;

        do {
            alegere = sc.nextInt();

            switch (alegere) {
                case 1:
                    zeama++;
                    break;
                case 2:
                    piure++;
                    break;
                case 3:
                    salata++;
                    break;
                case 4:
                    compot++;
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Alegere invalidă.");
            }
        } while (alegere != 0);

        double total = zeama * 24.50 + piure * 46.00 + salata * 18.00 + compot * 12.00;
        double reducere = 0;

        if (zeama > 0) {
            System.out.printf("Zeamă de casă x %d = %.2f lei%n", zeama, zeama * 24.50);
        }

        if (piure > 0) {
            System.out.printf("Piure cu pârjoală x %d = %.2f lei%n", piure, piure * 46.00);
        }

        if (salata > 0) {
            System.out.printf("Salată de varză x %d = %.2f lei%n", salata, salata * 18.00);
        }

        if (compot > 0) {
            System.out.printf("Compot x %d = %.2f lei%n", compot, compot * 12.00);
        }

        if (total > 100) {
            reducere = total * 0.15;
        }

        System.out.printf("Reducere: %.2f lei%n", reducere);
        System.out.printf("Total: %.2f lei%n", total - reducere);
    }
}
