import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {

  private static int[] input1, test;
  double[] input2;

  @Before
  public void setUp() {
    input1 = new int[]{1, 2, 3, 4};
    input2 = new double[]{1.0, 2.0, 3.0, 4.0};
    test = input1;
  }

	@Test 
	public void testReverseInPlace() {
    ArrayExamples.reverseInPlace(input1);
    assertEquals(test, input1);
    assertArrayEquals(new int[]{4, 3, 2, 1}, test);
	}


  @Test
  public void testReversed() {
    assertArrayEquals(new int[]{4, 3, 2, 1}, ArrayExamples.reversed(input1));
  }

  @Test
  public void testaverageWithoutLowest() {
    double getMean = ArrayExamples.averageWithoutLowest(input2);
    assertEquals(3, getMean, 0.001);
  }
}
