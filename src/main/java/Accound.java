public class Accound {
    private String numerKonta;
    private User urzytownik;
    private int stanKonta;

    public void setStanKonta(int stanKonta) {
        this.stanKonta = stanKonta;
    }

    public int getStanKonta() {
        return stanKonta;
    }

    public Accound(String konto, User urzytownik) {
        this.numerKonta = konto;
        this.urzytownik = urzytownik;
    }

    public String getNumerKonta() {
        return numerKonta;
    }

    public User getUrzytownik() {
        return urzytownik;
    }
}
