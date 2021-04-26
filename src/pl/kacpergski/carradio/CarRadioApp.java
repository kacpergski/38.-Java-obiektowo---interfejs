package pl.kacpergski.carradio;

import java.util.Scanner;

public class CarRadioApp {
    public static void main(String[] args) {
        int option;
        Scanner scanner = new Scanner(System.in, "UTF-8");

        do {

            System.out.println("-----Car Radio------------");
            System.out.println("1.Wybierz radio Blaupunkt");
            System.out.println("2.Wybierz radio Sony");
            System.out.println("3.Wybierz radio Lenco");
            System.out.println("0.Exit");
            option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    System.out.println("Wybrałeś radio Blaupunkt");
                    menuAllRadios();
                    option = scanner.nextInt();
                    switch (option) {
                        case 1:
                            break;
                        case 2:
                            break;
                        case 3:
                            break;
                    }


                    break;
                case 2:
                    System.out.println("Wybrałeś radio Sony");
                    menuAllRadios();
                    break;
                case 3:
                    System.out.println("Wybrałeś radio Lenco");
                    menuAllRadios();
                    break;
            }


        } while (option != 0);
    }

    private static void menuAllRadios() {
        System.out.println("1. Wlacz radio");
        System.out.println("2. Wylacz radio");
        System.out.println("3. Zmien stacje");
    }
}