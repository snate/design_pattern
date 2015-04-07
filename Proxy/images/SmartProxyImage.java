/**
  * Sebastiano Valle - 07/04/2015
  * This is the class which represents the GoF's ``Proxy" class.
  *
  * A smart proxy adds functionalities to the object it represents (e.g.
  * counting instantiated units).
*/
package images;

public class SmartProxyImage implements Image {
  private static int units = 0;
  private static String text1 = "SMART ";
  private static String text2 = " - NICE PHOTO";

  public SmartProxyImage() {
    units++;
  }

  public void show() {
    new RealImage(text1 + units + text2).show();
  }

}
