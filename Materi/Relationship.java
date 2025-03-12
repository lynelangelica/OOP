package Materi;

// nama class harus huruf kapital didepan
// variable dan function huruf kecil
class name(){
    public String firstName;
    public String middleName;
    public String lastName;
}

public class Relationship {
    public int dd, mm, yy;

    public Relationship(){
        name = new Name();
    }

    public void visit(PublicPlace p){
    }
}

// Asosiasi (uses) = student dan place, library sama book saling bisa berdiri sendiri
// agregasi (has) (tidak bergantung) = student dan address, hanya salah satu yang bergantungan
// komposisi (part of) (bergantung) = student dan name (satu ilang yang mainnya ikut ilang) dua duanya bergantungan

public Main{
    public main(){
        // komposisi
        Student student1 = new Student(new Name());

        // aggregation
        Name n = new Name("Louis");
        Student s1 = new Student();

        Address adr = new Address("Bogor");
        PublicPlace p = new PublicPlace("Kebun Raya Bogor");

        s1.visit(p);
        s1.address = adr;
    }
}

public class App{
    public App(){
        Student student1 = new Student(new Name());


        // Aggregation
        City b = new City ("Bogor");
        Districtd = new District();
        Address address = new Address(b, d);
    }
}