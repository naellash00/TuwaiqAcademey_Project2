
public class SubscribersPassengers extends Passenger {
    // car with 5 seats -> car capacity = 4 -> empty car only driver
    // car capacity = 3 -> one passenger  / car capacity = 2 -> two passengers
    // car capacity = 1 -> three passengers / car capacity = 0 -> 4 passengers (full car)
    // everytime someone rides the car the capacity decrease

    public SubscribersPassengers(String name, String id, Car reservedCar, double tripCost) {
        super(name, id, reservedCar, tripCost);
    }

    @Override
    public void reserveCar(Car car) {
        try {
            // check if the car is available
            if (car.getMaxCapacity() == 0) {
                throw new Exception("Error: Cant Reserve. Car Is Full");
            } else { // there is a capacity
                this.setReservedCar(car); // for this passenger set/reserve this car
                System.out.println("Car Reserved Successfully");
                // car.setMaxCapacity(car.getMaxCapacity() - 1); // then update the car capacity and decrement it
                // calculate trip cost
                // new price = original price * 0.5
                this.getReservedCar().setMaxCapacity(this.getReservedCar().getMaxCapacity() - 1);
                this.setTripCost(this.getReservedCar().getRoute().getTripPrice() * 0.5);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void displayInfo() {
//        if (this.getReservedCar().getMaxCapacity() == 0) {
//            System.out.println("Passenger Name: " + this.getName() + "\nPassenger ID: " + this.getId());
//        }
        System.out.println("Passenger Name: " + this.getName() + "\nPassenger ID: " + this.getId()
                + "\nCar Code: " + this.getReservedCar().getCode() + "\nTrip Cost: " + this.getTripCost()
                + "\nTrip Original Price: " + this.getReservedCar().getRoute().getTripPrice());

    }
}
