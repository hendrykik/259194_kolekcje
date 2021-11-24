package tb.soft;

//klasa bez zdefinowanych equals i hashCode
public class Personbez implements Comparable<tb.soft.Personbez> {
    String imie,nazwisko;

    Personbez(String imie,String nazwisko){
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    @Override
    public String toString() {
        return(imie +" " + nazwisko);
    }

    @Override
    public int compareTo(tb.soft.Personbez o) {
        int hash = this.imie.compareTo(o.imie);
        return hash;
    }}