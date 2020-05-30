import java.math.BigDecimal;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Bank b1 = new Bank("mBank", "4764");

        User u1 = new User("5646", "Dawid", "Kot");
        User u2 = new User("5665", "Pawel", "Kot");
        User u3 = new User("5476", "Marek", "Kot");
        User u4 = new User("5276", "Wojtek", "Kot");
        Accound k1 = new Accound("4164644654646546446466464", u1);
        Accound k2 = new Accound("4164644654646546446466464", u2);
        Accound k3 = new Accound("4164644654646546446466464", u3);
        Accound k4 = new Accound("4164644654646546446466464", u4);
        boolean rezultat = WalidatorKonta.waliduj(k1);
        System.out.println(rezultat);

        k1.setStanKonta(500);
        k2.setStanKonta(1521);
        k3.setStanKonta(2581);

        b1.dodajKonto(k1);
        b1.dodajKonto(k2);
        b1.dodajKonto(k3);
        // konto 4 jest niedodane
        BankKlient bankKlient = new BankKlient(b1);
        BigDecimal stanKonta = bankKlient.accountBalance(u3);
        System.out.println(stanKonta.intValue());
        Optional<Accound> accountForUser4 = bankKlient.getAccountForUser(u4);
        System.out.println("nie dodane konto: " + accountForUser4);
    }
}
