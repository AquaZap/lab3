import static org.junit.Assert.*;
import org.junit.*;
import java.util.ArrayList;
import java.util.List;


public class ListTests {
    
    @Test
    public void testFilter() {
        List<String> input1 = new ArrayList<String>();
        input1.add("longerword");
        input1.add("short");

        List<String> expected = new ArrayList<String>();
        expected.add("longerword");

        assertEquals(expected, ListExamples.filter(input1, new LongWordChecker()));
    }

    @Test
    public void testMerge() {
        List<String> input1 = new ArrayList<String>();
        input1.add("apple");
        input1.add("crab");

        List<String> input2 = new ArrayList<String>();
        input2.add("banana");
        input2.add("drain");

        List<String> expected = new ArrayList<String>();
        expected.add("apple");
        expected.add("banana");
        expected.add("crab");
        expected.add("drain");

        assertEquals(expected, ListExamples.merge(input1, input2));



    }
}
