/**
  * Sebastiano Valle - 07/04/2015
  * This is the class which represents a ``Client" that wants to operate with
  * an image, which is accessible only by using a proxy.
  *
  * In this example I don't make a RemoteProxy, that is already well explained
  * in java.rmi documentation.
*/
package client;
import images.*;

public class Client {

  public static void main(String[] args) {
    Image img = null;
    Image img2;
    String choice = args[0];
    switch(choice) {
      case "1":
        img = new VirtualProxyImage();
        break;
      case "2":
        img = new ProtectionProxyImage();
        break;
      case "3":
        img = new SmartProxyImage();
        img2 = new SmartProxyImage();
        break;
      default:
        System.out.println("Please enter a valid number");
    }
    if(img != null) img.show();
  }
}
