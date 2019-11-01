public class CarClient{
  public static void main(String[] args){
    Car myCar = new Car("Acura", "TSX", 16.0, 17.1);

    System.out.println(myCar);

    myCar.drive(6);

    System.out.println("Drove 6 miles: " + myCar);

    myCar.addFuel(15); //Add 15 gallons of fuel to carTankSize

    System.out.println("Added 15 gallons of fuel: " + myCar);

    System.out.println("New amount of fuel is " + myCar.getAmtFuel());
  }
}
