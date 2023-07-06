package Box;

public class Box {
        private int numbersOfSweets;
        private String sweetsType;
        public Box(int numbersOfSweets, int sweetsType){

        }

    public Box(int numbersOfSweets, String sweetsType) {
        this.numbersOfSweets = numbersOfSweets;
        this.sweetsType = sweetsType;
    }

    public void showBox(){
        System.out.println(sweetsType+ " : " + numbersOfSweets);

}

    public void eat (int numbersOfSweets){
         this.numbersOfSweets -= numbersOfSweets;
    }

    public int getNumbersOfSweets(){
            return numbersOfSweets;
    }

    public int getSweetsType(){
            return numbersOfSweets;
    }


    }


