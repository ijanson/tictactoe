import org.junit.Test;
import static org.junit.Assert.*;

/*
 * @author ian, @date 7/23/16 4:56 PM
 */
public class LibraryTest {
    @Test public void testSomeLibraryMethod() {
        Library classUnderTest = new Library();
        assertTrue("someLibraryMethod should return 'true'", classUnderTest.someLibraryMethod());
    }
}
