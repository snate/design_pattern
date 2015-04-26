/**
  * Sebastiano Valle - 26/04/2015
  * This is the class which represents GoF's ``ConcreteObserver" class.
*/
package newspaper;

public class TheBoringPaper extends NewspaperWriter {

  public TheBoringPaper(Subject s, Object lock) throws Exception {
    super(s,lock);
  }

  public void writeNews(String news) {
    synchronized(lock) {
      System.out.println("Nothing new. Blah blah blah, but I might say you that " + news);
    }
  }
}
