/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.polab4;

/**
 *
 * @author Tomasz
 */
public class Student {
    
    public String imie;
    public String nazwisko;
    public int nr_indeks;
    public String nazwa_specjalnosci;
    public int rok_studiow;

    public Student(String imie, String nazwisko, int nr_indeks, String nazwa_specjalnosci, int rok_studiow) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.nr_indeks = nr_indeks;
        this.nazwa_specjalnosci = nazwa_specjalnosci;
        this.rok_studiow = rok_studiow;
    }

    public Student(String imie) {
        this.imie = imie;
    }

    public Student(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    public Student(int nr_indeks, String nazwa_specjalnosci) {
        this.nr_indeks = nr_indeks;
        this.nazwa_specjalnosci = nazwa_specjalnosci;
    }

    public Student(String imie, int rok_studiow) {
        this.imie = imie;
        this.rok_studiow = rok_studiow;
    }
    
    public void wyswietl(){
        System.out.println("Imie: "+this.imie);
        System.out.println("Nazwisko: "+this.nazwisko);
        System.out.println("nr indeksu: "+this.nr_indeks);
        System.out.println("Nazwa specjalnosci: "+this.nazwa_specjalnosci);
        System.out.println("Rok studiow: "+this.rok_studiow);
    }
}