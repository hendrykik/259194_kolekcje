package tb.soft;
import java.util.Objects;
import java.util.Scanner;

//klasa z zdefinowanymi equals i hashCode
public class Person implements Comparable<Person> {
    String imie,nazwisko;

    Person(String imie,String nazwisko){
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    @Override
    public String toString() {
        return(imie +" " + nazwisko);
    }

    @Override
    public int compareTo(Person o) {
        int hash = this.imie.compareTo(o.imie);
        return hash;
    }

    //definiowanie equals
    public boolean equals(Person p) {
        if (this == p) {
            return true;
        }
        if (p == null) {
            return false;
        }
        if (getClass() != p.getClass()) {
            return false;
        }
        final Person other = (Person) p;
        if (!Objects.equals(this.imie, other.imie)) {
            return false;
        }
        if (!Objects.equals(this.nazwisko, other.nazwisko)) {
            return false;
        }
        return true;
    }

    //definiwanie hashCode
    public int hashCode() {
        return 17*imie.hashCode() + 31*nazwisko.hashCode();
    }
}
