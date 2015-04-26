/**
  * Sebastiano Valle - 26/04/2015
  * This is the class which represents GoF's ``ConcreteObserver" class.
*/
package newspaper;

public class TheEvilPaper extends NewspaperWriter {

  public TheEvilPaper(Subject s, Object lock) throws Exception {
    super(s,lock);
  }

  public void writeNews(String news) {
    synchronized(lock) {
      System.out.println("Hey you. Don't move and stay there, because " + news);
    }
  }
}
