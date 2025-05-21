public class Main {
    public static void main(String[] args) {

        // Create the first car object
        Car car1 = new Car("Honda City", 2022, "VJM1775");

        // Create the second car object with predefined values
        Car car2 = new Car("Toyota Vios", 2019, "VME841");

        // Display the attribute values of each object
        System.out.println("\nDetails of the first car:");
        car1.displayDetails();
        System.out.println();
        
        System.out.println("\nDetails of the second car:");
        car2.displayDetails();
        System.out.println();

        // Compare the car numbers
        car1.compareCarNumber(car2);

        // Calculate and display the age of each car
        int currentYear = 2024;
        System.out.println("\nAge of the first car: " + car1.calculateCarAge(currentYear) + " years");
        System.out.println("Age of the second car: " + car2.calculateCarAge(currentYear) + " years");

        double car1ResaleValue = car1.calculateResaleValue(currentYear);
        double car2ResaleValue = car2.calculateResaleValue(currentYear);
        System.out.println("The estimated resale value for the first car is: $" + car1ResaleValue);
        System.out.println("The estimated resale value for the second car is: $" + car2ResaleValue);
    }
    
}
    

