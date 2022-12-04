package pl.sda.hibernate.fakturownia;

import pl.sda.hibernate.fakturownia.komenda.Komenda;
import pl.sda.hibernate.fakturownia.komenda.KomendaDodajFirme;

import java.util.List;

public class Main {
    public static void main(String[] args) {
// SELECT * FROM firma;
        List<Komenda> listaKomend = List.of(
                new KomendaDodajFirme()

        );
        String komenda;
        do {
            System.out.println("Lista dostępnych komend:");
            for (int i = 0; i < listaKomend.size(); i++) {
                System.out.println((i + 1) + ". " + listaKomend.get(i));
            }
            System.out.println();


            System.out.println("Podaj komendę:");
            komenda = Komenda.SCANNER.nextLine();

            for (Komenda dostepnaKomenda : listaKomend) {
                if (dostepnaKomenda.getKomenda().equals(komenda)) {
                    dostepnaKomenda.obsluga();
                }
            }
        } while (!komenda.equalsIgnoreCase("exit"));
    }
}