/**
  * Sebastiano Valle - 24/04/2015
  * This is the class which represents GoF's ``Invoker" class.
  *
  * Invoker manages the Commands that he is asked to store in order to call
  * them when a specific input action (in our example a String) is submitted.
*/
package counter;
import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Invoker extends Thread {
  private Map<String,Command> map = new HashMap<String,Command>();
  private String input = "";
  private boolean stop = false;

  public void storeCommand(String s,Command c) {
    if(!s.equals("quit"))
      map.put(s,c);
  }

  public void run() {
    System.out.println("Ready to go:");
    while(!stop) {
      nextRequest();
      if(input.equals("quit"))
        stop = true;
      else{
        Command c = map.get(input);
        if(c != null)
          c.execute();
        else
          System.out.println("I don't have a command for that input, sorry.");
      }
    }
  }

  public void nextRequest() {
    BufferedReader br = null;
    try {
      br = new BufferedReader(new InputStreamReader(System.in));
      input = br.readLine();
    } catch(IOException e) {}
  }
}
