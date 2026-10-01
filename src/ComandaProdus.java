import java.util.Locale;
import java.util.Scanner;

public class ComandaProdus {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Produs p1 = new Produs("Zeamă de casă", 24.50, 10);
        Produs p2 = new Produs("Piure cu pârjoală", 46.00, 8);
        Produs p3 = new Produs("Salată de varză", 18.00, 12);

        String denumire = sc.nextLine();
        int portii = sc.nextInt();

        boolean gasit = false;
        boolean disponibil = false;
        double cost = 0;

        if (denumire.equals(p1.getDenumire())) {
            gasit = true;
            disponibil = p1.esteDisponibil(portii);
            cost = p1.costPentru(portii);
        }

        if (denumire.equals(p2.getDenumire())) {
            gasit = true;
            disponibil = p2.esteDisponibil(portii);
            cost = p2.costPentru(portii);
        }

        if (denumire.equals(p3.getDenumire())) {
            gasit = true;
            disponibil = p3.esteDisponibil(portii);
            cost = p3.costPentru(portii);
        }

        if (gasit) {
            if (disponibil) {
                System.out.printf("Cost total: %.2f lei%n", cost);
            } else {
                System.out.println("Stoc insuficient.");
            }
        } else {
            System.out.println("Produs inexistent.");
        }
    }
}
