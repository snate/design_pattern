/**
  * Sebastiano Valle - 08/04/2015
  * This is the class which represents the GoF's ``Singleton" class.
  *
  * This is the most immediate implementation of Singleton pattern.
  *
  * PROS:
  * <ul>
  * <li> simplicity </li>
  * </ul>
  *
  *
  * CONS:
  * <ul>
  * <li> no lazy initialization </li>
  * <li> no subclassing</li>
  * <li> reflection attack</li>
  * </ul>
*/
package lonelyboy;

public class SimpleBoy {
  private static final SimpleBoy INSTANCE = new SimpleBoy();

  public static SimpleBoy getInstance() {
    return INSTANCE;
  }
  
  private static String name;

  public static void setName(String str) {
    name = str;
  }

  public String toString() {
    return "SimpleBoy: My name is " + name;
  }

}
