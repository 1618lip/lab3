import static org.junit.Assert.*;
import org.junit.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class ListTests {
    private static List<String> strlst1;
    private static String[] lst = {"123", "23", "12", "131"};

    @Before 
    public void setUp() {
        strlst1 = new ArrayList<>(Arrays.asList(lst));
    }

    @Test
    public void testFilter() {
        List<String> get = ListExamples.filter(strlst1, new StringContains("2"));
        assertArrayEquals(new String[]{"123", "23", "12"}, get.toArray());
    }

    
   

}
