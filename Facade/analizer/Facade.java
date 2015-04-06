/**
  * Sebastiano Valle - 06/04/2015
  * This is the class which represents the GoF's ``Facade" class.
  *
  * Facade provides a unique and simple class to access a complex system,
  * decoupling the Client from the single classes/interfaces that make up the
  * system.
*/
package analizer;

public enum Facade {
  INSTANCE;     //Joshua Bloch's Singleton pattern implementation

  public void analize(String str) {
    String rev = Reverse.reverse(str);
    System.out.println(rev);

    String[] vocCons = VocalSeparator.separateVocals(str);
    System.out.println(vocCons[0]);
    System.out.println(unbiasedTrim(vocCons[1]));

    // these operation can be managed in a better way using the Strategy
    // pattern, which can allow us to Analize a string in several ways
  }

  private String unbiasedTrim(String str) {
    return str.replaceAll("\\W","");
  }

}
