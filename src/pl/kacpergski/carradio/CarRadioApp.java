package pl.kacpergski.carradio;

import java.util.Scanner;


public class CarRadioApp {
    private static Scanner scanner = new Scanner(System.in, "UTF-8");
    private static AllRadiosFuncions allRadiosFuncions;
    public static void main(String[] args) {
        int option;

        do {

            mainMenu();
            option = getOption();

            switch (option) {
                case 1:
                    System.out.println("Wybrałeś radio Blaupunkt");
                    menuAllRadios();
                    System.out.println("4. Specjalna funkcja 1");
                    option = getOption();
                    switch (option) {
                        case 1:
                            allRadiosFuncions = new RadioBlaupunktRepo();
                            allRadiosFuncions.wlaczRadio();
                            break;
                        case 2:
                            allRadiosFuncions.wylaczRadio();
                            break;
                        case 3:
                            allRadiosFuncions.zmienStacje();
                            break;

                        case 4:
                            allRadiosFuncions.funkcja1();
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

    private static int getOption() {
        int option;
        option = scanner.nextInt();
        scanner.nextLine();
        return option;
    }

    private static void mainMenu() {
        System.out.println("-----Car Radio------------");
        System.out.println("1.Wybierz radio Blaupunkt");
        System.out.println("2.Wybierz radio Sony");
        System.out.println("3.Wybierz radio Lenco");
        System.out.println("0.Exit");
    }

    private static void menuAllRadios() {
        System.out.println("1. Wlacz radio");
        System.out.println("2. Wylacz radio");
        System.out.println("3. Zmien stacje");
    }
}