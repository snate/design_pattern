/**
  * Sebastiano Valle - 23/04/2015
  * This is the class which represents GoF's ``Product" class.
  *
  * This class provides some methods to set the product's variables and one
  * method to print the overall outcome.
*/
package cellphone;

import java.lang.IllegalArgumentException;
import java.util.*;

public class Cellphone {

  private String os;
  private double size;
  private String name;

  public void setOS(String os) {
    this.os = os;
  }

  public void setScreenSize(double size) {
    this.size = size;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String toString() {
    StringBuilder result = new StringBuilder();
    result.append(name + ":\n");
    result.append("Operative system: " + os + "\n");
    result.append("Screen size: " + size + " inches\n");
    return result.toString();
  }
}
