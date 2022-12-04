package pl.sda.hibernate.fakturownia.komenda;

import pl.sda.hibernate.fakturownia.database.DataAccessObject;
import pl.sda.hibernate.fakturownia.model.Kontrahent;


public class KomendaUsunKontrahenta implements Komenda {
    private DataAccessObject<Kontrahent> dao = new DataAccessObject<>();


    @Override
    public String getKomenda() {
        return "usun kontrahenta";
    }

    @Override
    public void obsluga() {

        System.out.println("Podaj id szukanego kontrahenta");
        String idString = Komenda.SCANNER.nextLine();
        Long id = Long.parseLong(idString);

        dao.delete(Kontrahent.class, id);
    }
}
