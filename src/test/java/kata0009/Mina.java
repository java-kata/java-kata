package kata0009;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * @author mina1
 *
 */
public class Mina {
	
    @Test
    public void problem1() throws Exception {

        assertEquals("", "");
        
        for (int a = 1; a < 1000; a++) {
			for (int b = a + 1; b < 1000; b++) {
				int c = 1000 - a - b;
				if (a * a + b * b == c * c)  // b < c
					System.out.println(Integer.toString(a * b * c));
			}
		}
    }
}