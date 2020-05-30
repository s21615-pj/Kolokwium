public class User {
    private String imie;
    private String nazwisko;
    private String id;

    public User(String id, String imie, String nazwisko){
        this.id = id;
        this.imie = imie;
        this.nazwisko = nazwisko;
    }
    public String getImie(){
        return imie;
    }
    public String getNazwisko(){
        return nazwisko;
    }
    public  String getId(){
        return id;
    }


}
