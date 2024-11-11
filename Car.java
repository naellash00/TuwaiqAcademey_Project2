public class Car {
    private String code;
    private final Route route;
    private int maxCapacity;

    Car(Route route) {
        // final variable must be declared at all
        // constructors, if its not initialized in the declaration
        this.route = route;

    }
    public Car(String code, Route route, int maxCapacity) {
        this.code = code;
         this.route = route;
        this.maxCapacity = maxCapacity;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Route getRoute(){
        return route;
    }
    // no set bcs its final


    public int getMaxCapacity() {
        return maxCapacity;
    }

    public void setMaxCapacity(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }
}
