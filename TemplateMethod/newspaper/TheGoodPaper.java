/**
  * Sebastiano Valle - 26/04/2015
  * This is the class which represents a GoF's ``ConcreteClass" class.
  *
  * This class defines the primitive left unimplemented by the AbstractClass
  * NewsPaperWriter.
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
