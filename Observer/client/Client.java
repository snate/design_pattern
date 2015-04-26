/**
  * Sebastiano Valle - 26/04/2015
  * This is the class which represents a ``Client" that instantiates a
  * Paparazzo and some NewspaperWriter(s) which publish information given by
  * the Paparazzo.
*/
package client;
import newspaper.*;

public class Client {

  public static void main(String[] args) {
    Paparazzo pap = new Paparazzo();
    Object outputLock = new Object();
    try { // creation & subscription
      NewspaperWriter w1 = new TheGoodPaper(pap,outputLock);
      NewspaperWriter w2 = new TheBoringPaper(pap,outputLock);
      NewspaperWriter w3 = new TheEvilPaper(pap,outputLock);
    } catch(Exception e) {}
    Thread t = new Thread(pap);
    t.start();
  }
}
