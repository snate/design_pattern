/**
  * Sebastiano Valle - 26/04/2015
  * This is the class which represents GoF's ``Subject" abstract class.
  *
  * A Subject is a type of object that can be observed. It has a method called
  * notify() that sends a message to all the observer who are waiting for some
  * events to occur.
  *
  * It provides operations to subscribe and unsubscribe.
*/
package newspaper;
import java.util.*;

public abstract class Subject {
  private ArrayList<Observer> listeners = new ArrayList<Observer>();

  public void attach(Observer obs) {
    listeners.add(obs);
  }

  public void detach(Observer obs) {
    listeners.remove(obs);
  }

  public void publish() {
    for(Observer l : listeners)
      ( new Notifier(l) ).start();
  }

  private class Notifier extends Thread {
    private Observer l;

    public Notifier(Observer l) {
      this.l = l;
    }

    public void run(){
      l.update();
    }
  }

  public int getNumberOfSubscribers() {
    return listeners.size();
  }
}
