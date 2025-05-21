public class Car {
    private String model;
    private int yearMade;
    private String CarNumber;

public Car(String model, int yearMade){
    this.model = model;
    this.yearMade = yearMade;
}

public Car(String model, int yearMade, String CarNumber){
    this.model = model;
    this.yearMade = yearMade;
    this.CarNumber = CarNumber;
}

// Getter methods
public String getModel(){
    return model;
}

public int getyearMade(){
    return yearMade;
}

public String getCarNumber(){
    return CarNumber;
}

// Setter method for carNumber
public void setCarNumber(String CarNumber){
    this.CarNumber = CarNumber;
}

// Method to display car details
public void displayDetails(){
    System.out.println("Model: " + model);
    System.out.println("Year made: " + yearMade);
    System.out.println("Car number: " + CarNumber);
}

 // Method to compare car numbers
 public void compareCarNumber(Car otherCar){
    if (this.CarNumber.equals(otherCar.getCarNumber())) {
        System.out.println("Alert: Both cars have the same number.");
    } else {
        System.out.println("Both cars have different numbers.");
    }
 }

// Method to calculate the age of the car
public int calculateCarAge(int currentYear){
    return currentYear - this.yearMade;
}

// Method to calculate the age of the car
public double calculateResaleValue(int currentYear) {
    int carAge = calculateCarAge(currentYear);
    
    double originalValue = 55000.0;
    double depreciationRate = 0.10;
    double resaleValue = originalValue * Math.pow((1 - depreciationRate), carAge);
    return Math.round(resaleValue * 1000.0)/1000.0;
}
}