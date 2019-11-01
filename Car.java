/*
Implement a class called Car with the following properties and behaviors.

A Car has a make (Toyota, Ford, BMW, etc.) and a model (Highlander, Fiesta, M3, etc.)
A Car has a certain fuel efficiency (measured in miles/gallon)
A Car has a certain amount of fuel in the gas tank (in gallons)
A Car can drive and fuel to the tank (driving a car changes the amount of fuel in the tank)

You must also include appropriate accessor and mutator methods for the Car class and a toString method that prints out a report on the current state of the car.

Create a client class with 3 instances of the car class. The client class should test all of the methods from the Car class and print out relevant information to prove the proper functionality of your Car class.
*/
public class Car{
  /*
  The attributes of a car (instance variables)
  */
  private String make;
  private String model;
  private double mpg;
  private double tankSize;
  private double amtFuel;


  public Car(String carMake, String carModel, double carMpg, double carTankSize){
    make = carMake;
    model = carModel;
    mpg = carMpg;
    tankSize = carTankSize;
    //amtFuel = carFuel;
  }

  public String getMake(){
    return make;
  }

  public String getModel(){
    return model;
  }

  public double getMpg(){
    return mpg;
  }

  public double getTankSize(){
    return tankSize;
  }

  public double getAmtFuel(){
    return amtFuel;
  }

  public String addFuel(double fuel){
    amtFuel += fuel;
    if(amtFuel > tankSize){
      amtFuel = tankSize;
      result += "You add to much fuel, stop wasting resources";
    }
    result += "You now have " + amtFuel + "gal in the tank";
    return result;
  }

  public void drive(double miles){
    amtFuel = amtFuel - (miles / mpg);
  }

  public String toString(){
    String result = "";
    result += "Make: " + make + "\n";
    result += "Model: " + model + "\n";
    result += "MPG: " + mpg + ", Tank Size: " + tankSize + "\n";
    result += "Current Amount of Fuel: " + amtFuel;
    return result;
  }

//
}
