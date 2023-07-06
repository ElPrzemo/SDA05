package person;

public class Person {
    static private int counter;
    String name;

    public Person (String name){
        this.name = name;
        counter++;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name=name;
    }

    public static int getCounter() {
        return counter;
    }
}
