package tb.soft;
import java.util.*;

public class pierwsze {
    Scanner scanner = new Scanner(System.in);
    private static final String MENU =
            "    M E N U   K O L E K C J I  \n" +
                    "1 - Podaj dane nowej osoby \n" +
                    "2 - Podaj kilka przykładowych osób osoby \n" +
                    "3 - Wypisz wszystkie osoby \n" +
                    "4 - Usuwania osoby z niezdefiniowaną metode equales() \n" +
                    "5 - Usuwania osoby z zdefiniowaną metodę equales() \n" +
                    "6 - Usuwania osoby z poróąwnujc wartości uzyskane niezdefiniowaną metodę hashCode() \n" +
                    "7 - Usuwania osoby z porównując wartoóci uzyskane zdefiniowanć metodę hashCode() \n" +
                    "0 - Zakończ program        \n";

    private static final String START =
            "\n \n   M E N U   G Ł Ó W N E  \n" +
                    "1 - ArrayList              \n" +
                    "2 - LinkedList             \n" +
                    "3 - HashSet                \n" +
                    "4 - TreeSet                \n" +
                    "5 - HashMap                \n" +
                    "6 - TreeMap                \n" +
                    "0 - Koniec programu        \n";


        public static void main(String[] args) {
            pierwsze aplication = new pierwsze();
            aplication.App1();
    }

    private void App1(){
        while(true){
            System.out.println(START);
            Scanner scanner = new Scanner(System.in);
            String z = scanner.nextLine();
            switch(z) {
                case "1":
                    Arrayy();
                case "2":
                    Linkeddd();
                case "3":
                    HashSett();
                case "4":
                    TreeSettt();
                case "5":
                    HashMapp();
                case "6":
                    TreeMapp();
                case "0":
                    System.out.println("\n Koniec programu");
                    System.exit(0);
            }
        }
    }

//dodawanie obiektu klasy ze zdefinowanymi equals oraz  hashcode
    private Person dej() {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Podaj imie");
            String d1 = scanner.nextLine();
            System.out.println("Podaj naziwsko");
            String d2 = scanner.nextLine();
            if(d1=="" || d2==""){
                System.out.println("Błędne dane");
            }
            Person d = new Person(d1, d2);
            return d;
        } catch (InputMismatchException e) {
            System.out.println("Błędne dane");
            scanner.nextLine();
        }return null;
    }

//doddwanie obiektu klasy bez zdefinowanych equals oraz hashcode
    private Personbez doj() {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Podaj imie");
            String d1 = scanner.nextLine();
            System.out.println("Podaj naziwsko");
            String d2 = scanner.nextLine();
            if(d1=="" || d2==""){
                System.out.println("Błędne dane");
            }
            Personbez d = new Personbez(d1, d2);
            return d;
        } catch (InputMismatchException e) {
            System.out.println("Błędne dane");
            scanner.nextLine();
        }return null;
    }

//ArrayList
    private void Arrayy(){
        ArrayList<Person> lista1 = new ArrayList<Person>();
        while(true){
            System.out.println(MENU);
            Scanner scanner = new Scanner(System.in);
            String pie = scanner.nextLine();
            switch(pie){
                case "1":
                    Person dod = dej();
                    lista1.add(dod);
                    break;
                case "2":
                    Person a12 = new Person("Barak","Mobama");
                    Person a13 = new Person("Adej","Dudej");
                    Person a14 = new Person("Masny","Ben");
                    lista1.add(a12);
                    lista1.add(a13);
                    lista1.add(a14);
                    break;
                case "3":
                    for(Object k  : lista1){
                        System.out.println(((Person)k).imie+" "+((Person)k).nazwisko);
                    }
                    break;
                case "4":
                    Personbez z1 = doj();
                    for(Person p: lista1) {
                        Personbez v1 = new Personbez(p.imie,p.nazwisko);
                        if(z1.equals(v1)) {
                            lista1.remove(p);
                            break;
                        }}
                    break;
                case "5":
                    Person z2 = dej();
                    for(Person p: lista1) {
                        if(z2.equals(p)) {
                            lista1.remove(p);
                            break;
                        }}
                    break;
                case "6":
                    Personbez z3 = doj();
                    for(Person p: lista1) {
                        Personbez v3 = new Personbez(p.imie,p.nazwisko);
                        if(v3.hashCode() == z3.hashCode()) {
                            lista1.remove(p);
                            break;
                        }}
                    break;
                case "7":
                    Person z4 = dej();
                    for(Person p: lista1) {
                        if(z4.hashCode() == p.hashCode()) {
                            lista1.remove(p);
                            break;
                        }}
                    break;
                case "0":
                    System.out.println("\n Koniec programu");
                    System.exit(0);
            }

        }
    }

//LinkedList
    private void Linkeddd(){
            LinkedList<Person> lista1 = new LinkedList<Person>();
        while(true){
            System.out.println(MENU);
            Scanner scanner = new Scanner(System.in);
            String pie = scanner.nextLine();
            switch(pie){
                case "1":
                    Person dod = dej();
                    lista1.add(dod);
                    break;
                case "2":
                    Person a12 = new Person("Barak","Mobama");
                    Person a13 = new Person("Adej","Dudej");
                    Person a14 = new Person("Masny","Ben");
                    lista1.add(a12);
                    lista1.add(a13);
                    lista1.add(a14);
                    break;
                case "3":
                    for(Object k  : lista1){
                        System.out.println(((Person)k).imie+" "+((Person)k).nazwisko);
                    }
                    break;
                case "4":
                    Personbez z1 = doj();
                    for(Person p: lista1) {
                        Personbez v1 = new Personbez(p.imie,p.nazwisko);
                        if(z1.equals(v1)) {
                            lista1.remove(p);
                            break;
                        }}
                    break;
                case "5":
                    Person z2 = dej();
                    for(Person p: lista1) {
                        if(z2.equals(p)) {
                            lista1.remove(p);
                            break;
                        }}
                    break;
                case "6":
                    Personbez z3 = doj();
                    for(Person p: lista1) {
                        Personbez v3 = new Personbez(p.imie,p.nazwisko);
                        if(v3.hashCode() == z3.hashCode()) {
                            lista1.remove(p);
                            break;
                        }}
                    break;
                case "7":
                    Person z4 = dej();
                    for(Person p: lista1) {
                        if(z4.hashCode() == p.hashCode()) {
                            lista1.remove(p);
                            break;
                        }}
                    break;
                case "0":
                    System.out.println("\n Koniec programu");
                    System.exit(0);
            }

        }
    }

//HashSet
    private void HashSett(){
        HashSet<Person> lista1 = new HashSet<Person>();
        while(true){
            System.out.println(MENU);
            Scanner scanner = new Scanner(System.in);
            String pie = scanner.nextLine();
            switch(pie){
                case "1":
                    Person dod = dej();
                    lista1.add(dod);
                    break;
                case "2":
                    Person a12 = new Person("Barak","Mobama");
                    Person a13 = new Person("Adej","Dudej");
                    Person a14 = new Person("Masny","Ben");
                    lista1.add(a12);
                    lista1.add(a13);
                    lista1.add(a14);
                    break;
                case "3":
                    for(Object k  : lista1){
                        System.out.println(((Person)k).imie+" "+((Person)k).nazwisko);
                    }
                    break;
                case "4":
                    Personbez z1 = doj();
                    for(Person p: lista1) {
                        Personbez v1 = new Personbez(p.imie,p.nazwisko);
                        if(z1.equals(v1)) {
                            lista1.remove(p);
                            break;
                        }}
                    break;
                case "5":
                    Person z2 = dej();
                    for(Person p: lista1) {
                        if(z2.equals(p)) {
                            lista1.remove(p);
                            break;
                        }}
                    break;
                case "6":
                    Personbez z3 = doj();
                    for(Person p: lista1) {
                        Personbez v3 = new Personbez(p.imie,p.nazwisko);
                        if(v3.hashCode() == z3.hashCode()) {
                            lista1.remove(p);
                            break;
                        }}
                    break;
                case "7":
                    Person z4 = dej();
                    for(Person p: lista1) {
                        if(z4.hashCode() == p.hashCode()) {
                            lista1.remove(p);
                            break;
                        }}
                    break;
                case "0":
                    System.out.println("\n Koniec programu");
                    System.exit(0);
            }

        }
    }

//TreeSet
    private void TreeSettt() {
        Set<Person> lista1 = new TreeSet<Person>();
        while(true){
            System.out.println(MENU);
            Scanner scanner = new Scanner(System.in);
            String pie = scanner.nextLine();
            switch(pie){
                case "1":
                    Person dod = dej();
                    lista1.add(dod);
                    break;
                case "2":
                    Person a12 = new Person("Barak","Mobama");
                    Person a13 = new Person("Adej","Dudej");
                    Person a14 = new Person("Masny","Ben");
                    lista1.add(a12);
                    lista1.add(a13);
                    lista1.add(a14);
                    break;
                case "3":
                    for(Object k  : lista1){
                        System.out.println(((Person)k).imie+" "+((Person)k).nazwisko);
                    }
                    break;
                case "4":
                    Personbez z1 = doj();
                    for(Person p: lista1) {
                        Personbez v1 = new Personbez(p.imie,p.nazwisko);
                        if(z1.equals(v1)) {
                            lista1.remove(p);
                            break;
                        }}
                    break;
                case "5":
                    Person z2 = dej();
                    for(Person p: lista1) {
                        if(z2.equals(p)) {
                            lista1.remove(p);
                            break;
                        }}
                    break;
                case "6":
                    Personbez z3 = doj();
                    for(Person p: lista1) {
                        Personbez v3 = new Personbez(p.imie,p.nazwisko);
                        if(v3.hashCode() == z3.hashCode()) {
                            lista1.remove(p);
                            break;
                        }}
                    break;
                case "7":
                    Person z4 = dej();
                    for(Person p: lista1) {
                        if(z4.hashCode() == p.hashCode()) {
                            lista1.remove(p);
                            break;
                        }}
                    break;
                case "0":
                    System.out.println("\n Koniec programu");
                    System.exit(0);
            }

        }

    }

//HashMap
    private void HashMapp() {
        HashMap<Person,Integer> lista1 = new HashMap<>();
        while(true){
            System.out.println(MENU);
            Scanner scanner = new Scanner(System.in);
            String pie = scanner.nextLine();
            switch(pie){
                case "1":
                    Person dod = dej();
                    lista1.put(dod,dod.hashCode());
                    break;
                case "2":
                    Person a12 = new Person("Barak","Mobama");
                    Person a13 = new Person("Adej","Dudej");
                    Person a14 = new Person("Masny","Ben");
                    lista1.put(a12,a12.hashCode());
                    lista1.put(a13,a13.hashCode());
                    lista1.put(a14,a14.hashCode());
                    break;
                case "3":
                    for(Person k: lista1.keySet()){
                        System.out.println(((Person)k).imie+" "+((Person)k).nazwisko);
                    }
                    break;
                case "4":
                    Personbez z1 = doj();
                    for(Person p: lista1.keySet()) {
                        Personbez v1 = new Personbez(p.imie,p.nazwisko);
                        if(v1.equals(z1)) {
                            lista1.remove(p);
                            break;
                        }}
                    break;
                case "5":
                    Person z2 = dej();
                    for(Person p: lista1.keySet()) {
                        if(z2.equals(p)) {
                            lista1.remove(p);
                            break;
                        }}
                    break;
                case "6":
                    Personbez z3 = doj();
                    for(Person p: lista1.keySet()) {
                        Personbez v3 = new Personbez(p.imie,p.nazwisko);
                        if(z3.hashCode() == v3.hashCode()) {
                            lista1.remove(p);
                            break;
                        }}
                    break;
                case "7":
                    Person z4 = dej();
                    for(Person p: lista1.keySet()) {
                        if(z4.hashCode() == p.hashCode()) {
                            lista1.remove(p);
                            break;
                        }}
                    break;
                case "0":
                    System.out.println("\n Koniec programu");
                    System.exit(0);
            }

        }
    }

//TreeMap
    private void TreeMapp() {
        TreeMap<Person,Integer> lista1 = new TreeMap<>();
        while(true){
            System.out.println(MENU);
            Scanner scanner = new Scanner(System.in);
            String pie = scanner.nextLine();
            switch(pie){
                case "1":
                    Person dod = dej();
                    lista1.put(dod,dod.hashCode());
                    break;
                case "2":
                    Person a12 = new Person("Barak","Mobama");
                    Person a13 = new Person("Adej","Dudej");
                    Person a14 = new Person("Masny","Ben");
                    lista1.put(a12,a12.hashCode());
                    lista1.put(a13,a13.hashCode());
                    lista1.put(a14,a14.hashCode());
                    break;
                case "3":
                    for(Person k: lista1.keySet()){
                        System.out.println(((Person)k).imie+" "+((Person)k).nazwisko);
                    }
                    break;
                case "4":
                    Personbez z1 = doj();
                    for(Person p: lista1.keySet()) {
                        Personbez v1 = new Personbez(p.imie,p.nazwisko);
                        if(v1.equals(z1)) {
                            lista1.remove(p);
                            break;
                        }}
                    break;
                case "5":
                    Person z2 = dej();
                    for(Person p: lista1.keySet()) {
                        if(z2.equals(p)) {
                            lista1.remove(p);
                            break;
                        }}
                    break;
                case "6":
                    Personbez z3 = doj();
                    for(Person p: lista1.keySet()) {
                        Personbez v3 = new Personbez(p.imie,p.nazwisko);
                        if(z3.hashCode() == v3.hashCode()) {
                            lista1.remove(p);
                            break;
                        }}
                    break;
                case "7":
                    Person z4 = dej();
                    for(Person p: lista1.keySet()) {
                        if(z4.hashCode() == p.hashCode()) {
                            lista1.remove(p);
                            break;
                        }}
                    break;
                case "0":
                    System.out.println("\n Koniec programu");
                    System.exit(0);
            }

        }
}
}
