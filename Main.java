import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Testing non subscribe passenger with code
        System.out.println("**********Test Subscribe Passenger**********");
        Route route1 = new Route("king road", "pnu gate1", 40);
        Car car1 = new Car("ab12", route1, 0);


        Passenger passenger1 = new SubscribersPassengers("reem", "112233", car1, 40);
//        passenger1.reserveCar(car1); // the issue is i didnt call the function before displaying the info
//        passenger1.displayInfo();

        // Testing non subscribe passenger with code
        System.out.println("**********Test Non Subscribe Passenger With Discount**********");
        Route route2 = new Route("narjis road", "nada dist", 50);
        Car car2 = new Car("cd23", route2, 0);
        Passenger passenger2 = new NonSubscribersPassengers("ibrahim", "009988", car2, 50, true);

//        passenger2.reserveCar(car2);
//        passenger2.displayInfo();

        // Testing non subscribe passenger with No discount
        System.out.println("**********Test Non Subscribe Passenger**********");
        Route route3 = new Route("khalidyah", "tuwaiq", 50);
        Car car3 = new Car("ef56", route3, 3);
        Passenger passenger3 = new NonSubscribersPassengers("huda", "776655", car3, 50, false);
//        passenger3.reserveCar(car3);
//        passenger3.displayInfo();

        System.out.println("**********Test Array Of Passengers**********");
        ArrayList<Passenger> passengers = new ArrayList<>();
        passengers.add(passenger1);
        passengers.add(passenger3);
        for(Passenger p : passengers){
            p.displayInfo();
        }

        // new passenger trying to reserve car 1 -> should throw the exception
        SubscribersPassengers passenger4 = new SubscribersPassengers("nuha", "887744", car1, 20);
        passenger4.reserveCar(car1);
        passenger4.displayInfo();

        System.out.println("**********Test Reserve Car Method**********");
        // testing the reserve method
         passenger3.reserveCar(car3);
         passenger2.reserveCar(car3);
         passenger1.reserveCar(car3);
         passenger4.reserveCar(car3);

         passenger1.displayInfo();
         passenger2.displayInfo();
         passenger3.displayInfo();
         passenger4.displayInfo();


    }
}