
package vezbanjezaispit4;

public class EkranTelefona {
    private double sirina;
    private double visina;

    public EkranTelefona(double sirina, double visina) {
        this.sirina = sirina;
        this.visina = visina;
    }

    public double getSirina() {
        return sirina;
    }

    public double getVisina() {
        return visina;
    }
    
    public double getDijagonala(){
        if (this.sirina==this.visina)
            return Math.sqrt(this.sirina);
        else
            return Math.sqrt(((this.sirina*this.sirina)+(this.visina*this.visina)));
    }

    @Override
    public String toString() {
        return "EkranTelefona{" + "sirina=" + sirina + ", visina=" + visina + '}';
    }
    
    
}
