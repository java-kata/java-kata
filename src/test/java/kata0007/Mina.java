package kata0007;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * @author mina1
 *
 * 10,001 번째 소수는 무엇입니까?
 * 
 * 소수는 2를 제외하면 모두 홀수
 * 1은 소수가 아님
 */
public class Mina {
	
	public static boolean isPrime (long i) {
	    if (i <= 1) return false;
	    else if (i == 2 || i == 3) return true;
	    else if (i % 2 == 0 || i % 3 == 0) return false;
	    else {
	    for (int n = 3; n <= Math.sqrt(i); n+=2) {
	        if (i % n == 0) {
	            return false;
	        }
	    }
	    return true;
	    }
	}
	
    @Test
    public void problem1() throws Exception {

        assertEquals("", "");
        
        long count = 1;
        long primes = 0;
        while (primes <= 10001) {
            if (isPrime(count)){
                primes++;
                if (primes == 10001) {
                    System.out.println(count);
                }
            }
        count++;
        }
    }
}