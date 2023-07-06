package Box;

public class BoxTest2 {
    public static void main(String[] args) {
        Box boxA = new Box(10, "Mars");
        //wciąż jeden obiekt ale już dwie strzałeczki(referencje)
        Box boxB = boxA;

        boxA.eat(5);
        System.out.println("boxB");
        boxB.showBox();
        System.out.println("boxA");
        boxA.showBox();


        //w przypadku typów prostych jest inaczej
        //tutaj kopiowana jest wartość
        int x1 = 123;
        //tu jest kopia wartości
        int x2 = x1; //x2 = 123

        x1--;
        x1--;
        System.out.println("x1: " + x1);
        System.out.println("x2: " + x2);
    }}
