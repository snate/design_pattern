/**
  * Sebastiano Valle - 07/04/2015
  * This is the class which represents the GoF's ``Proxy" class.
  *
  * A protection proxy controls the access to an object.
*/
package images;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProtectionProxyImage implements Image {
  private static String text = "PROTECTION - SECRET PHOTO";
  private static String password = "proxy";

  public void show() {
    System.out.print("Please enter the password: ");
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String answer = "";
    try {
      answer = br.readLine();
    } catch (IOException e) {}
    if(answer.equals(password))
      new RealImage(text).show();
    else
      System.out.println("Access denied");
  }

}
