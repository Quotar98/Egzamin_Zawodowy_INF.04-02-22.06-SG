import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Liczba zarejestrowanych osób: " + Osoba.getLiczbaInstacji());

        Osoba osoba1 = new Osoba();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj id: ");
        int id = scanner.nextInt();
        System.out.println("Podaj imię: ");
        String imie = scanner.next();
        Osoba osoba2 = new Osoba(id, imie);

        Osoba osoba3 = new Osoba(osoba2);

        osoba1.powiadomienieWitaj("Jan");
        osoba2.powiadomienieWitaj("Jan");
        osoba3.powiadomienieWitaj("Jan");

        System.out.println("Liczba zarejestrowanych osób: " + Osoba.getLiczbaInstacji());
    }
}