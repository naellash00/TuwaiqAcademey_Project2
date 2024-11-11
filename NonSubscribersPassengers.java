public class NonSubscribersPassengers extends Passenger {
    boolean discount;

    public NonSubscribersPassengers() {

    }

    public NonSubscribersPassengers(String name, String id, Car reservedCar, double tripCost, boolean discount) {
        super(name, id, reservedCar, tripCost);
        this.discount = discount;
    }

    public boolean isDiscount() {
        return discount;
    }

    public void setDiscount(boolean discount) {
        this.discount = discount;
    }

    @Override
    public void reserveCar(Car car) {
        try {
            if (car.getMaxCapacity() == 0) {
                throw new Exception("Error: Cant Reserve. Car Is full");
            } else { // if not full reserve the car
                this.setReservedCar(car);
                System.out.println("Car Reserved Successfully");
                //  car.setMaxCapacity(car.getMaxCapacity()-1);
                this.getReservedCar().setMaxCapacity(this.getReservedCar().getMaxCapacity() - 1);
            }

            // calculate cost:
            if (discount) {
                //this.setTripCost(this.getTripCost());
                double newPrice = car.getRoute().getTripPrice() - (car.getRoute().getTripPrice() * 0.1);
                this.setTripCost(newPrice);
            } else {
                this.setTripCost(car.getRoute().getTripPrice());
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
