package OOP.prAtest;

public class Bike extends Toys{
  private int numberOfWheels;


  public Bike(int id, String name, int quantity, int chanceToDrop, int numberOfWheels) {
    super(id, name, quantity, chanceToDrop);
    this.numberOfWheels = numberOfWheels;
  }

  public int getNumberOfWheels() {
    return numberOfWheels;
  }

  public void setNumberOfWheels(int numberOfWheels) {
    this.numberOfWheels = numberOfWheels;
  }
}
