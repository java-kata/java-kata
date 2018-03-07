package kata0004;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * @author mina1
 *
 * 3자리 숫자를 곱해 만들어진 가장 큰 대칭수을 찾으십시오.
 */
public class Mina {

    private int palindrome(int n) {
    	int pul = 0;
    	
    	while(n > 0)
    	{
    		pul = 10 * pul + n % 10;
    		n /= 10;
    	}
    	return pul; // 숫자 뒤집기
    }
    
    private boolean isPalindrome(int n) {
    	return n == palindrome(n);
    }
    
    @Test
    public void problem1() throws Exception {

        assertEquals("", "");
        
        int mul = 0;
        int result = 0;
        
        for (int i = 999; i >= 100; i--) {
			for (int j = 999; j >= 100; j--) {
				mul = i * j;
				if(mul <= result)
					break;
				if(isPalindrome(mul) && mul > result) {
					result = mul;
				}
			}
		}

        System.out.println(result);
    }
}


