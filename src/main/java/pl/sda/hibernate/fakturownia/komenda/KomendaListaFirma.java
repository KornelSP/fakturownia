package pl.sda.hibernate.fakturownia.komenda;

import pl.sda.hibernate.fakturownia.database.DataAccessObject;
import pl.sda.hibernate.fakturownia.model.Firma;

public class KomendaListaFirma implements Komenda {

    private DataAccessObject<Firma> dao = new DataAccessObject<>();


    @Override
    public String getKomenda() {
        return "lista firm";
    }

    @Override
    public void obsluga() {

        dao.findAll(Firma.class).forEach(System.out::println);
    }
}

