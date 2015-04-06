/**
  * Sebastiano Valle - 06/04/2015
  * This is the interface which represents a GoF's internal class of the
  * subsystem.
*/
package analizer;

class VocalSeparator {

  /**
  * @param str the String this method has to analize
  * @return String[0] a String containing the vocals in str
  * @return String[1] a String containing the consonants in str
  */
  public static String[] separateVocals(String str) {
    StringBuilder vocals = new StringBuilder(str.length());
    StringBuilder consonants = new StringBuilder(str.length());
    for(int i = 0; i < str.length(); i++) {
      boolean isVocal = false;
      for(Vocal v : Vocal.values())
        if(v.getChar() == str.charAt(i))
          isVocal = true;
      if(isVocal)
        vocals.append(str.charAt(i));
      else
        consonants.append(str.charAt(i));
    }
    String[] res = new String[]{vocals.toString(),consonants.toString()};
    return res;
  }
}
