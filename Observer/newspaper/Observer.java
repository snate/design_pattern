/**
  * Sebastiano Valle - 26/04/2015
  * This is the interface which represents GoF's ``Observer" interface.
  *
  * An Observer waits for events in Subject to occur. When it happens, it is
  * notified by means of its method update().
*/
package newspaper;

public interface Observer {

  public void update();
}
