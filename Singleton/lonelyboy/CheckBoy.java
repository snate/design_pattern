/**
  * Sebastiano Valle - 08/04/2015
  * This is the class which represents the GoF's ``Singleton" class.
  *
  * This is a double-check implementation of Singleton pattern.
  *
  * PROS:
  * <ul>
  * <li> lazy initialization </li>
  * <li> subclassing</li>
  * </ul>
  *
  *
  * CONS:
  * <ul>
  * <li> reflection attack</li>
  * </ul>
*/
package lonelyboy;

public class CheckBoy {
  private static volatile CheckBoy INSTANCE; // volatile keyword forces JVM to
                                             // flush cache at each reading
  private static String name;

  public static CheckBoy getInstance() {
    if(INSTANCE == null) {
      synchronized(CheckBoy.class) { // lock on entire class
        if(INSTANCE == null)
          INSTANCE = new CheckBoy();
      }
    }
    return INSTANCE;
  }

  public static void setName(String str) {
    name = str;
  }

  public String toString() {
    return "CheckBoy: My name is " + name;
  }
}
