/**
  * Sebastiano Valle - 26/04/2015
  * This is class doesn't represent any of the GoF's classes in Template
  * Method's structure.
*/
package newspaper;
import java.util.*;

public class Paparazzo extends Subject implements Runnable {
  private int count;
  private String nextNews;
  private static ArrayList<String> newsToGive = new ArrayList<String>();

  static {
    newsToGive.add("Microsoft merges with Apple.");
    newsToGive.add("first ships are leaving Earth to start life on Mars.");
    newsToGive.add("population dreads unexpected terrorist attack.");
  }

  public void run() {
    Iterator<String> it = newsToGive.iterator();
    while(it.hasNext())
      emit(it.next());
  }

  public void waitForSpread() {
    try {
      synchronized(this) {
      while(count < getNumberOfSubscribers())
        this.wait();
      count = 0;
      }
    } catch(InterruptedException ie) {}
  }

  public void emit(String news) {
    nextNews = news;
    publish();
    waitForSpread();
  }

  public synchronized String getNews() {
    count++;
    this.notify();
    return nextNews;
  }
}
