import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}

  @Test
  public void testReverseInPlace2() {
    int [] input2 = {1, 2, 3};
    ArrayExamples.reverseInPlace(input2);
    assertArrayEquals(new int[]{3, 2, 1}, input2);
  }


  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }

  @Test 
  public void testReversed2() {
    int[] input2 = {1, 2, 3};
    assertArrayEquals(new int[] {3, 2, 1}, ArrayExamples.reversed(input2));
  }

  @Test
  public void testAverageWithoutLowest() {
    double[] input1 = {1.0, 2.0, 3.0};
    double output = ArrayExamples.averageWithoutLowest(input1);
    assertEquals(2.5, output, 0.0);
  }

  @Test
  public void testAverageWithoutLowest2() {
    double[] input2 = {1.0, 1.0, 2.0, 3.0};
    double output = ArrayExamples.averageWithoutLowest(input2);
    assertEquals(2.5, output, 0.0);
  }
}
