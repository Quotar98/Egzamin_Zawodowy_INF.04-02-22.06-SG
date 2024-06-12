public class Osoba {
    private int id;
    private String imie;

    public static int liczbaInstacji = 0;

    public Osoba(){
        this.id = 0;
        this.imie = "";
        liczbaInstacji++;
    }

    public Osoba(int id, String imie){
        this.id = id;
        this.imie = imie;
        liczbaInstacji++;
    }

    public Osoba(Osoba innaOsoba){
        this.id = innaOsoba.id;
        this.imie = innaOsoba.imie;
        liczbaInstacji++;
    }

    public void powiadomienieWitaj(String inneImie){
        if (this.imie == null || this.imie.isEmpty()){
            System.out.println("Brak danych");
        }
        else {
            System.out.println("Cześć " + inneImie + ", mam na imię " + this.imie);
        }
    }

    public static int getLiczbaInstacji() {
        return liczbaInstacji;
    }
}
