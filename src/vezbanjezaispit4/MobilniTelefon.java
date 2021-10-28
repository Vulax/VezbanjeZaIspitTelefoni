
package vezbanjezaispit4;

public class MobilniTelefon {
    private String proizvodjac;
    private String model;
    private int godina;
    private double kolicinaRadneMemorije;
    private double kolicinaProstora;
    private EkranTelefona dimenzije;
    
    public String getProizvodjac() {
        return proizvodjac;
    }

    public String getModel() {
        return model;
    }

    public int getGodina() {
        return godina;
    }

    public double getKolicinaRadneMemorije() {
        return kolicinaRadneMemorije;
    }

    public double getKolicinaProstora() {
        return kolicinaProstora;
    }

    public EkranTelefona getDimenzije() {
        return dimenzije;
    }

    public MobilniTelefon(String proizvodjac, String model, int godina, double kolicinaRadneMemorije, double kolicinaProstora, EkranTelefona dimenzije) {
        this.proizvodjac = proizvodjac;
        this.model = model;
        this.godina = godina;
        this.kolicinaRadneMemorije = kolicinaRadneMemorije;
        this.kolicinaProstora = kolicinaProstora;
        this.dimenzije = dimenzije;
    }
    
    public double ocenaPodobnosti(){
        double podobnost = 0;
        if (this.dimenzije.getDijagonala()<=5)
            podobnost = (this.dimenzije.getDijagonala()*this.kolicinaRadneMemorije)/(2020-this.godina);
        else if (this.dimenzije.getDijagonala()>5)
            podobnost = (this.dimenzije.getDijagonala()*this.kolicinaProstora)/(2020-this.godina);
        
        return podobnost;      
    }

    @Override
    public String toString() {
        return String.format("|%-24s|%-17s|%-20s|%-19s|\n"
                + "|%-24s|%-17d|%-20s|%-16.2f %s|\n"
                + "|%-24s| %.2f x %.2f in  |%-20s|%16.2f in|\n"
                + "|%-24s|%13.2f MB |%-20s|%-16.2f %s|\n",
                "Proizvodjac:",this.proizvodjac,
                "Model:", this.model,
                "Godina proizvodnje:", this.godina,
                "Ocena podobnosti:",this.ocenaPodobnosti(),"PP",
                "Sirina i visina ekrana:", this.dimenzije.getSirina(),this.dimenzije.getVisina(),
                "Dijagonala ekrana:", this.dimenzije.getDijagonala(),
                "Kolicina RAM memorije:",this.kolicinaRadneMemorije,
                "Kolicina skladista:", this.kolicinaProstora, "MB");
    }
    
}


