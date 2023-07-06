package car;



class Application {
    public static void main(String[] args) {
        Car car1 = new Car("czerwony","BMW");
        System.out.println(car1.getBrand());
        System.out.println(car1.getColor());
        //car1.brand --> tak nie mozemy bo brand jest private
        car1.setBrand("Audi");
        System.out.println(car1.getBrand());

        System.out.println("#######");
        System.out.println("#######");

        Car car2 = new Car();
        System.out.println(car2.getBrand());
        System.out.println(car2.getColor());

        System.out.println("#######");
        System.out.println("#######");

        Car car3 = new Car("czerwony");//31 w klasie Car
        System.out.println(car3.getColor());
        System.out.println(car3.getBrand());

    }
}