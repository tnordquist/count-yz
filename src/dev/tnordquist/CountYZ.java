package dev.tnordquist;

/**
 * CodingBat: Given a string, count the number of words ending in 'y' or 'z' -- so the 'y' in
 * "heavy" and the 'z' in "fez" count, but not the 'y' in "yellow" (not case sensitive). We'll say
 * that a y or z is at the end of a word if there is not an alphabetic letter immediately following
 * it.
 */
public class CountYZ {

  public static int countYZ(String str) {

    int count = 0;
    str = str.toLowerCase();

    for (int i = 0; i < str.length() - 1; ++i) {
      if (((str.charAt(i) == 'y' || str.charAt(i) == 'z') &&
          !(Character.isLetter(str.charAt(i + 1))))) {
        count++;
      } else if ((((str.lastIndexOf('y') == str.length() - 1 && i == str.length() - 2) || (
          str.lastIndexOf('z')
              == str.length() - 1 && i == str.length() - 2)))) {
        count++;

      }
    }
    return count;
  }
}
