package Program;

public class OsobaDoBazy {
    private int id;
    private String imie;
    private String nazwisko;




    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        //TekstRamkaPierwsza tekstRamkaPierwsza = new TekstRamkaPierwsza();
        this.imie= nazwisko;//tekstRamkaPierwsza.imieOsoby;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }


    public OsobaDoBazy() {
    }

    public OsobaDoBazy(int id, String imie, String nazwisko) {
        TekstRamkaPierwsza tekstRamkaPierwsza = new TekstRamkaPierwsza();
        this.id = id;
        this.imie = tekstRamkaPierwsza.imieTextRamka;
        this.nazwisko = tekstRamkaPierwsza.nazwiskoTextRamka;

    }

    @Override
    public String toString() {

        return "[" + id + "] - " + imie + " " + nazwisko;
    }
}