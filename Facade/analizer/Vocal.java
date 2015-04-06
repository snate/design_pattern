/**
  * Sebastiano Valle - 06/04/2015
  * This is an enum class which represents a GoF's internal class of the
  * subsystem.
*/
package analizer;

enum Vocal {
  A ('a'),
  E ('e'),
  I ('i'),
  O ('o'),
  U ('u');

  private char letter;

  Vocal(char letter) {
    this.letter = letter;
  }

  public char getChar() {
    return letter;
  }

}
