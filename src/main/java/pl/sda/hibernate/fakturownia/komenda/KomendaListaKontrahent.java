package pl.sda.hibernate.fakturownia.komenda;

import pl.sda.hibernate.fakturownia.database.DataAccessObject;
import pl.sda.hibernate.fakturownia.model.Kontrahent;

public class KomendaListaKontrahent implements Komenda {

    private DataAccessObject<Kontrahent> dao = new DataAccessObject<>();

    @Override
    public String getKomenda() {
        return "lista kontrahentow";
    }

    @Override
    public void obsluga() {

        dao.findAll(Kontrahent.class).forEach(System.out::println);
    }
}

