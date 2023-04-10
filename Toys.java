package OOP.prAtest;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Toys {
  private int id;
  private String name;
  private int quantity;
  private int chanceToDrop;

  public void getToy () {
    Random random = new Random( );
    String text = "";
    int indexToy = random.nextInt(1, 101);
    if (indexToy> 0 && indexToy <= 10) {
      text = "Вы выйграли машинку";
      System.out.println("Вы выйграли машинку");
    }
    if (indexToy> 10 && indexToy <= 30) {
      text = "Вы выйграли велосипед";
      System.out.println("Вы выйграли велосипед");
    }
    if (indexToy> 30 && indexToy <= 60) {
      text = "Вы выйграли конструктор";
      System.out.println("Вы выйграли конструктор");
    }
    if (indexToy> 60 && indexToy <= 75) {
      text = "Вы выйграли самокат";
      System.out.println("Вы выйграли самокат");
    }
    if (indexToy> 75 && indexToy <= 100) {
      text = "Вы выйграли оружие";
      System.out.println("Вы выйграли оружие");
    }


    try(FileWriter writer = new FileWriter("notes.txt", false))
    {
      writer.write(text);
      writer.append('\n');
    }
    catch(IOException ex){
      System.out.println(ex.getMessage());
    }
  }

  public Toys(int id, String name, int quantity, int chanceToDrop) {
    this.id = id;
    this.name = name;
    this.quantity = quantity;
    this.chanceToDrop = chanceToDrop;
  }

  public Toys() {

  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getQuantity() {
    return quantity;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }

  public int getChanceToDrop() {
    return chanceToDrop;
  }

  public void setChanceToDrop(int chanceToDrop) {
    this.chanceToDrop = chanceToDrop;
  }
}
