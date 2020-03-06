package p1;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import p1.prom;
public class TestProm {
	prom p = null;
	@Before
	public void setup() {
		p = new prom();
	}
	@Test
	public void testProm() {
			assertEquals("false",p.test(-1));
			assertEquals("false",p.test(100));
			assertEquals("false",p.test(24));
			assertEquals("false",p.test(45));
			assertEquals("true",p.test(60));
		
	}
	
}
