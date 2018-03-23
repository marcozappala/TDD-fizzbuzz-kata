import org.hamcrest.Matcher;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import static org.hamcrest.core.Is.*;
import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class FizzBuzzTest {

  @Test
  public void shouldReturnTheNumberForNonMultiplesOfThreeAndFive() {
    assertThatAnswerForNumber(1, is("1"));
    assertThatAnswerForNumber(2, is("2"));
  }

  @Test
  public void shouldReturnFizzForMultiplesOfThree() {
    assertThatAnswerForNumber(3, is("Fizz"));
    assertThatAnswerForNumber(6, is("Fizz"));
  }

  @Test(expected = IllegalArgumentException.class)
  public void shouldThrowForZero() {
    FizzBuzz.returnAnswerForNumber(0);
  }

  private void assertThatAnswerForNumber(int numberToCheck, Matcher<String> matcher) {
    assertThat(FizzBuzz.returnAnswerForNumber(numberToCheck), matcher);
  }

}
