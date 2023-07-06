public class VarargsExample {

    //metodty z dowlną liczbą argumentów
    //w kosekwencji ja mam do dyspozycji całą tablicę argumentów typu int

    static void displayNumbers(int...numbers){ //int[]numbers
        System.out.println("Jestem  w display numbers");
        for(int i=0; i<numbers.length; i++){
            System.out.println(numbers[i]);
        }
    }

    //zawsze musze podac conajmniej jeden argument
    static void printArgs(int firstArg, int... numbers) {
        System.out.println("Argument wymagany to: "+ firstArg);
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }



    public static void main(String[] args) {
        displayNumbers();
        System.out.println("######");
        displayNumbers(321,123,567);
        System.out.println("######");
        displayNumbers(90);
        System.out.println("######");
        displayNumbers(56,12,3,4,2,6);
    }

}
