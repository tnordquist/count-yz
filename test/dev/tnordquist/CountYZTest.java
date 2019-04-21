package dev.tnordquist;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

class CountYZTest {

  private static Object[][] countYZ() {
    return new Object[][]{

        {2, "fez day"}
    };
  }

  @ParameterizedTest
  @MethodSource
   void countYZ(int expected, String input) {

    int actual = CountYZ.countYZ(input);
    assertEquals(expected,actual);
  }

}