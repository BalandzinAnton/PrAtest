package OOP.prAtest;

import java.util.ArrayList;
import java.util.List;

public class Main {

  public static void main(String[] args) {
    Car car = new Car(1, "Car", 15, 10);
    Bike bike = new Bike(2, "Bike", 10, 20, 2);
    Constructor constructor = new Constructor(3, "Car", 15, 30, 500);
    Scooter scooter = new Scooter(4, "Scooter", 11, 15);
    Weapon weapon = new Weapon(1, "Car", 15, 25);

    List<Toys> listToys = new ArrayList<>();
    listToys.add(car);
    listToys.add(bike);
    listToys.add(constructor);
    listToys.add(scooter);
    listToys.add(weapon);

    Toys toys = new Toys();
    toys.getToy();
  }

}
