package car;

public class Car {
    private String color;
    private String brand;


    //konstruktor = specjalna metoda, ktora tworzy obiekt
    //-> nazwa jest zawsze taka sama jak nazwa klasy
    //-> pomijamy co konstruktor zwraca, bo domyślnie on zwraca zawsze obiekt
//    public Car(String c, String b) {
//        color = c;
//        brand = b;
//    }
    public Car(String color, String brand) {
        // this wskazuje na nowoutworzony obiekt
        //pole        wartosc z zewnatrz
        System.out.println("Konstruktor z dwoma parametrami");
        this.color = color;
        this.brand = brand;
    }

    //ogólnie klasa może mieć wiele, różnych konstruktorów
    //konstruktor bezparametrowy
    public Car() {
        System.out.println("Konstruktor bezparametrowy");
        color = "biały";
        brand = "Polonez";
    }

    public Car(String color) {
        //moge wywołać inny konstruktor
        this(color, "Fiat");//15
    }

    //generowanie getterow/setterow (alt+insert)
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}