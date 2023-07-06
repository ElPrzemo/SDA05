package Box;

public class BoxTest {
    public static void main(String[] args) {
        Box box1 = new Box(100, "Snickers");
        box1.showBox();
        box1.eat(10);
        box1.showBox();


        Box box2= box1;
        box2.showBox();
        box2.eat(30);
        box2.showBox();
        System.out.println("Box1: ");
        box1.showBox();

        //kopiowanie stanu obiektu
        Box box3 = new Box(box2.getNumbersOfSweets(), box2.getSweetsType());
        box3.eat(15);
        System.out.println("box3");
        box3.showBox();
        System.out.println("box2");
        box2.showBox();
        System.out.println(box1);
        box1.showBox();

        box1.eat(10);
    }
}
