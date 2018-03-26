/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.polab4.wprowadzDane;

/**
 *
 * @author Tomasz
 */
import pl.edu.ur.polab4.*;
import java.util.Scanner;

public class Manager {
    Student[] x;
    int nrstud;
    
    public Manager(){
        this.nrstud = 0;
        this.x = new Student[100];
    }
    
    public void wypelnienie(){
       for(int i=0;i<100;i++){
           x[i]=new Student("","",0,"",0);
       }
    }
    public void zmiana(){
       Scanner wczytanie=new Scanner(System.in);
       System.out.println("Podaj index do zmiany: ");
       int index=wczytanie.nextInt();
       System.out.println("Podaj Imie");
       String imie=wczytanie.next();
       System.out.println("Podaj Nazwisko");
       String nazwisko=wczytanie.next();
       System.out.println("Podaj nr indeksu");
       int nr_indeks=wczytanie.nextInt();
       System.out.println("Podaj nazwe specjalnosci");
       String nazwa_specjalnosci=wczytanie.next();
       System.out.println("Podaj rok studiow");
       int rok_studiow=wczytanie.nextInt();
       x[index]=new Student(imie,nazwisko,nr_indeks,nazwa_specjalnosci,rok_studiow);
       
   }
   public void usuniecie(){
       Scanner wczytanie=new Scanner(System.in);
       System.out.println("Podaj index do usuniecia: ");
       int index=wczytanie.nextInt();
       x[index]=new Student("","",0,"",0);
       
   }
   public void wyswietlanie(){
       Scanner wczytanie=new Scanner(System.in);
       System.out.println("Podaj index do wyswietlenia: ");
       int index=wczytanie.nextInt();
       System.out.println("Student o indeksie: "+index);
       System.out.println(x[index].imie);
       System.out.println(x[index].nazwisko);
       System.out.println(x[index].nr_indeks);
       System.out.println(x[index].nazwa_specjalnosci);
       System.out.println(x[index].rok_studiow);
       
   }
   public void wyswietlanie_wszystkich(){
       for(int i=0;i<100;i++){
            System.out.println("Student o indeksie: "+i);
            System.out.println(x[i].imie);
            System.out.println(x[i].nazwisko);
            System.out.println(x[i].nr_indeks);
            System.out.println(x[i].nazwa_specjalnosci);
            System.out.println(x[i].rok_studiow);
       }
   }
   public void wyswietlanie_zakresu(){
       Scanner wczytanie=new Scanner(System.in);
       System.out.println("Podaj zakres poczatkowy indeksow: ");
       int pocz=wczytanie.nextInt();
       System.out.println("Podaj zakres koncowy indeksow: ");
       int kon=wczytanie.nextInt();
       for(int i=pocz;i<kon;i++){
            System.out.println("Student o indeksie: "+i);
            System.out.println(x[i].imie);
            System.out.println(x[i].nazwisko);
            System.out.println(x[i].nr_indeks);
            System.out.println(x[i].nazwa_specjalnosci);
            System.out.println(x[i].rok_studiow); 
       }
   }
}
