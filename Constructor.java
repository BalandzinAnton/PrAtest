package OOP.prAtest;

public class Constructor extends Toys{
  private int numbersOfDetails;


  public Constructor(int id, String name, int quantity, int chanceToDrop, int numbersOfDetails) {
    super(id, name, quantity, chanceToDrop);
    this.numbersOfDetails = numbersOfDetails;
  }

  public int getNumbersOfDetails() {
    return numbersOfDetails;
  }

  public void setNumbersOfDetails(int numbersOfDetails) {
    this.numbersOfDetails = numbersOfDetails;
  }
}
