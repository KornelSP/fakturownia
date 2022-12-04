package pl.sda.hibernate.fakturownia.komenda;

import pl.sda.hibernate.fakturownia.database.DataAccessObject;
import pl.sda.hibernate.fakturownia.model.Firma;


public class KomendaUsunFirma implements Komenda {
    private DataAccessObject<Firma> dao = new DataAccessObject<>();

    @Override
    public String getKomenda() {
        return "usun firme";
    }

    @Override
    public void obsluga() {

        System.out.println("Podaj id szukanej firmy");
        String idString = Komenda.SCANNER.nextLine();
        Long id = Long.parseLong(idString);


        dao.delete(Firma.class, id);
    }
}
