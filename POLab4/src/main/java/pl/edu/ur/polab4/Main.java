package pl.edu.ur.polab4;

import pl.edu.ur.polab4.wprowadzDane.*;
import java.util.Scanner;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO zad 4, 5
        System.out.println("Podaj numer zadania (4/5): ");
        Scanner s = new Scanner(System.in);
        int zad = s.nextInt();

        switch (zad) {
            default:
                System.out.println("Bledny numer");
                break;
            case 4:

                System.out.println("Wybierz figure ktora chcesz obliczyc: 1-kolo, 2-prostakat,"
                        + "3-szescian, 4-prostopadloscian, 5-kula, 6-stozek, 7-kwadrat ");
                int zadanie = s.nextInt();

                switch (zadanie) {

                    default:
                        System.out.println("Bledny numer ");
                        break;

                    case 1:
                        System.out.println("Kolo");
                        System.out.println("Podaj wartosc promienia:");
                        double a = s.nextDouble();
                        pl.edu.ur.polab4.obliczanieFigur.Kolo k1 = new pl.edu.ur.polab4.obliczanieFigur.Kolo(a);
                        k1.obwod();
                        k1.pole();
                        break;

                    case 2:
                        System.out.println("Prostokat");
                        System.out.println("Podaj wartosc pierwszego boku:");
                        double c = s.nextDouble();
                        System.out.println("Podaj wartosc drugiego boku:");
                        double b = s.nextDouble();
                        pl.edu.ur.polab4.obliczanieFigur.Prostokat k2 = new pl.edu.ur.polab4.obliczanieFigur.Prostokat(c, b);
                        k2.obwod();
                        k2.pole();
                        break;

                    case 3:
                        System.out.println("Szescian ");
                        System.out.println("Podaj wartosc boku:");
                        double d = s.nextDouble();
                        pl.edu.ur.polab4.obliczanieFigur.Szescian k3 = new pl.edu.ur.polab4.obliczanieFigur.Szescian(d);
                        k3.objetosc();
                        k3.pole();
                        break;

                    case 4:
                        System.out.println("Prostopadloscian ");
                        System.out.println("Podaj wartosc pierwszego boku podstawy:");
                        double e = s.nextDouble();
                        System.out.println("Podaj wartosc drugiego boku podstawy:");
                        double f = s.nextDouble();
                        System.out.println("Podaj wartosc wysokosci:");
                        double g = s.nextDouble();
                        pl.edu.ur.polab4.obliczanieFigur.Prostopadloscian k4 = new pl.edu.ur.polab4.obliczanieFigur.Prostopadloscian(e, f, g);
                        k4.objetosc();
                        k4.pole();
                        break;

                    case 5:
                        System.out.println("Kula");
                        System.out.println("Podaj wartosc promienia:");
                        double h = s.nextDouble();
                        pl.edu.ur.polab4.obliczanieFigur.Kula k5 = new pl.edu.ur.polab4.obliczanieFigur.Kula(h);
                        k5.objetosc();
                        k5.pole();
                        break;

                    case 6:
                        System.out.println("Stozek ");
                        System.out.println("Podaj wartosc promienia:");
                        double i = s.nextDouble();
                        System.out.println("Podaj wartosc tworzacej:");
                        double j = s.nextDouble();
                        System.out.println("Podaj wartosc wysokosci:");
                        double k = s.nextDouble();
                        pl.edu.ur.polab4.obliczanieFigur.Stozek k6 = new pl.edu.ur.polab4.obliczanieFigur.Stozek(i, j, k);
                        k6.objetosc();
                        k6.pole();
                        break;

                    case 7:
                        System.out.println("Kwadrat ");
                        System.out.println("Podaj wartosc boku:");
                        double l = s.nextDouble();
                        pl.edu.ur.polab4.obliczanieFigur.Kwadrat k7 = new pl.edu.ur.polab4.obliczanieFigur.Kwadrat(l);
                        k7.obwod();
                        k7.pole();
                        break;

                }
                break;

            case 5:

                Manager x = new Manager();
                x.wypelnienie();
                x.zmiana();
                x.wyswietlanie();
                x.usuniecie();
                x.wyswietlanie();
                x.wyswietlanie_zakresu();
                x.wyswietlanie_wszystkich();
                break;

        }

    }

}
