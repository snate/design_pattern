/**
  * Sebastiano Valle - 08/04/2015
  * This is the class which represents the GoF's ``Singleton" class.
  *
  * This is the simplest implementation of Singleton pattern and larger
  * explanation of it can be found on Item 3 of Joshua Bloch's Effective Java.
  *
  * PROS:
  * <ul>
  * <li> simplicity </li>
  * <li> no reflection attack</li>
  * </ul>
  *
  *
  * CONS:
  * <ul>
  * <li> no lazy initialization </li>
  * <li> no subclassing</li>
  * </ul>
*/
package lonelyboy;

public enum EnumBoy {
  INSTANCE;
  private String name;

  public synchronized void setName(String str) {
    name = str;
  }

  public synchronized String toString() {
    return "Enum: My name is " + name;
  }
}
