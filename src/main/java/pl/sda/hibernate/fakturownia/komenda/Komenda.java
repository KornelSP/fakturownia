package pl.sda.hibernate.fakturownia.komenda;

import java.util.Scanner;

public interface Komenda {
    Scanner SCANNER = new Scanner(System.in);

    String getKomenda();

    void obsluga();
}
