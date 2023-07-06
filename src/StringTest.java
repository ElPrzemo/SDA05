public class StringTest {
    public static void main(String[] args) {
        String a = ("Hello world");
        String b = ("Hello world");
        String c= new String("Hello world");

        //a i b to są ten sam obiekt z dwoma odwołaniami == oddaje tą samą referencje a equals oddaje tą samą zawartość
        // w obu przypadkach odda true
        System.out.println(a == b);
        System.out.println(a.equals(b));


        //a i c to nie są  te sam obieky, słówko new wywołuje nowy obiekt  == oddaje tą samą referencje a equals oddaje tą samą zawartość
        // == sprawdza referencje i jest różna odda false
        // equals sprawdza zawartość odda true
        System.out.println(a==c);
        System.out.println(a.equals(c));

    }
}
