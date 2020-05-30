public class WalidatorKonta {
    public static boolean waliduj(Accound konto){
        String numerKonta = konto.getNumerKonta();

        if (numerKonta.length()!=26){
            System.out.println("Twoj numer konta ma dlugosc inna niz 26 cyfr");
            return false;
        }

        for (int i=0; i<numerKonta.length(); i++){
            char c = numerKonta.charAt(i);

            if (Character.isLetter(c)){
                System.out.println("Twoj numer konta nie zawiera samych cyfr");
                return false;
            }
        }
        return true;

    }
}
