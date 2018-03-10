package kata0006;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * @author mina1
 *
 *  1~100 자연수 제곱의 합과 합의 제곱의 차
 *  
 *  수열의 합 '시그마'
 */
public class Mina {
	
	/*자연수 n개의 합  n(n+1)/2 */
	private int sigma(int n) {
		return (n*(n+1))/2;
	}
	/*자연수 제곱의 합  n(2n+1)(n+1)/6 */
	private int sumOfSquare(int n) {
		return (n*(2*n+1))*(n+1)/6;
	}
	
    @Test
    public void problem1() throws Exception {

        assertEquals("", "");
        
        int sum = sigma(100);
        int sum2 = sumOfSquare(100);
        System.out.println(sum); //자연수의 합
        System.out.println(sum * sum); //합의 제곱
        System.out.println(sum2); //제곱의 합
        int result = sum * sum - sum2; //합의 제곱 - 제곱의 합
        
        System.out.println(result);
    }
}
