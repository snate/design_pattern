/**
  * Sebastiano Valle - 26/04/2015
  * This is the class which represents GoF's ``ConcreteObserver" class.
  *
  * In the update() method a NewspaperWriter gathers information from a
  * Paparazzo and then he publish them.
  *
  * NewspaperWriter is also the abstract class in the Template Method pattern.
*/
package newspaper;

public abstract class NewspaperWriter implements Observer {
  private Paparazzo pap;
  protected final Object lock;

  public NewspaperWriter(Subject s,Object lock) throws Exception {
    this.lock = lock;
    if(s instanceof Paparazzo) {
      pap = (Paparazzo) s;
      s.attach(this);
    }
    else
      throw new Exception("invalid argument");
  }

  public void update() {
    String news = pap.getNews();
    writeNews(news);
  }

  public abstract void writeNews(String news);
}
