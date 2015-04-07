/**
  * Sebastiano Valle - 07/04/2015
  * This is the class which represents the GoF's ``Proxy" class.
  *
  * A virtual proxy shows (and/or instantiates) the object only when requested.
*/
package images;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class VirtualProxyImage implements Image {
  private static String text = "VIRTUAL - NICE PHOTO";

  public void show() {
    String answer = "n";
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    try{
      while(!(answer.equals("y"))) {
        System.out.print("Do you want to see the image? (y/n) ");
        answer = br.readLine();
      }
    }
    catch(IOException e) {}
    new RealImage(text).show();
  }

}
