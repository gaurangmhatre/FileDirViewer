import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import static junit.framework.TestCase.assertEquals;

public class TestHelper {
    Helper helper;

    @Before
    public void setup(){
        helper = new Helper();
    }

    @Test
    public void testhumanReadableByteCount(){
        assertEquals("Issue with B ","124 B", helper.humanReadableByteCount(124l));
        assertEquals("Issue with Kib ","97.7 KiB", helper.humanReadableByteCount(100024l));
        assertEquals("Issue with mib ","95.4 MiB", helper.humanReadableByteCount(100000024l));
        assertEquals("Issue with gib ","93.1 GiB", helper.humanReadableByteCount(100000000024l));
        assertEquals("Issue with tib ","90.9 TiB", helper.humanReadableByteCount(100000000000024l));
        assertEquals("Issue with pib ","90.6 PiB", helper.humanReadableByteCount(102000000000000004l));
    }

    @Test
    public void testfreeMemoryChecker(){
        assertEquals("Memory is full",true, helper.freeMemoryChecker());
    }
}
