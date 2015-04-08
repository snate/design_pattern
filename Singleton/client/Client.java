/**
  * Sebastiano Valle - 08/04/2015
  * This is the class which represents a ``Client" that wants to operate with
  * Singleton class(es).
  *
  * It operates with three different kinds of Singleton.
*/
package client;
import lonelyboy.*;

public class Client {

  public static void main(String[] args) {
    SimpleBoy sBoy1 = SimpleBoy.getInstance(); //no-Double-Check-Singleton
    SimpleBoy sBoy2 = SimpleBoy.getInstance(); //no-Double-Check-Singleton

    CheckBoy cBoy1 = CheckBoy.getInstance(); //Double-Check-Singleton
    CheckBoy cBoy2 = CheckBoy.getInstance(); //Double-Check-Singleton

    sBoy1.setName("Bob");
    sBoy2.setName("Carl");

    cBoy1.setName("Bob");
    cBoy2.setName("Carl");

    EnumBoy.INSTANCE.setName("Bob");
    EnumBoy.INSTANCE.setName("Carl");

    System.out.println(sBoy1);
    System.out.println(sBoy2);
    System.out.println(cBoy1);
    System.out.println(cBoy2);
    System.out.println(EnumBoy.INSTANCE.toString());
  }
}
