package kata0003;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * @author mina1
 *
 * 13195의 소인수는 5, 7, 13, 29입니다.
 * 600851475143의 가장 큰 소인수는 무엇입니까?
 */
public class Mina {

    @Test
    public void problem1() throws Exception {

        assertEquals("", "");
        
        long num = 600851475143L;
        
        for (int i = 2; i < num; i++) {
        	if(num % i == 0) {
        		num /= i;
        		if(num == 1) {
        			num = i;
        			break;
        		}
        	}
		}
        System.out.println(num);
    }
}
