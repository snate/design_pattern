/**
  * Sebastiano Valle - 26/04/2015
  * This is the class which represents GoF's ``ConcreteObserver" class.
*/
package newspaper;

public class TheGoodPaper extends NewspaperWriter {

  public TheGoodPaper(Subject s, Object lock) throws Exception {
    super(s,lock);
  }

  public void writeNews(String news) {
    synchronized(lock) {
      System.out.println("I'm happy. I'm telling you that " + news);
    }
  }
}
