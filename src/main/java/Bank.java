import java.util.ArrayList;
import java.util.List;

public class Bank {
    private String nazwa;
    private String id; // musi zawierac 4 znaki
    private List<Accound> konta;

    public Bank(String nazwa, String id) {
        this.nazwa = nazwa;
        if (id.length()!=4) {
            throw new IllegalArgumentException("Identyfikator banku musi miec cztery znaki!");
        }
        this.id = id;
        konta = new ArrayList<>();
    }

    public String getNazwa() {
        return nazwa;
    }

    public String getId() {
        return id;
    }

    public List<Accound> getKonta() {
        return konta;
    }

    public void dodajKonto(Accound konto) {
        konta.add(konto);
    }


}
