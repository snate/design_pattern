/**
  * Sebastiano Valle - 06/04/2015
  * This is the interface which represents a GoF's internal class of the
  * subsystem.
*/
package analizer;

class Reverse {

  static String reverse(String str) {
    StringBuilder res = new StringBuilder(str.length());
    for(int i = str.length() - 1; i >= 0; i--) {
      res.append(str.charAt(i));
    }
    return res.toString();
  }

}
