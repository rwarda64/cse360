package cse360assignment02;

public class AddingMachine {
  private int total;
  private String str = "0";
  
  public AddingMachine () {
    total = 0;  // not needed - included for clarity
  }
  
  public int getTotal () {
    return total;
  }
  
  public void add (int value) {
	  total = total + value;
	  str = str + " + " + value;
  }

  public void subtract (int value) {
	  total = total - value;
	  str = str + " - " + value;
  }

  public String toString () {
    return str;
  }

  public void clear() {
	  total = 0;
	  
  }
}