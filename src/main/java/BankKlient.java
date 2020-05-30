import java.math.BigDecimal;
import java.util.Optional;

public class BankKlient {
    private Bank bank;

    public BankKlient(Bank bank) {
        this.bank = bank;
    }

    public BigDecimal accountBalance(User user) {
        for (Accound konto : bank.getKonta()) {
            if (user.equals(konto.getUrzytownik())) {
                return new BigDecimal(konto.getStanKonta());
            }
        }
        return null;
    }

    public Optional<Accound> getAccountForUser(User user) {
        for (Accound konto : bank.getKonta()) {
            if (user.equals(konto.getUrzytownik())) {
                return Optional.of(konto);
            }
        }
        return Optional.empty();
    }

    public boolean checkBankAndAccountCorrelation(Accound accound) {
        return false;
    }

    public BigDecimal topUpAccount(BigDecimal toUpAmout, User user) {
        return null;
    }

    public BigDecimal transferMoney(User fromUser, User toUser, BigDecimal amount) {
        return null;
    }
}
