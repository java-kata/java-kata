package kata0005;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Mina {
  
	/** 유클리드 알고리즘을 통해 최대 공약수와 최소 공배수를 구함. **/
	private int euclid(int num1, int num2) {
		if (num2 == 0)
			return num1;
		return euclid(num2, num1%num2);
	}
	
	/* 최대 공약수 */
	private int gcd(int num1, int num2) {
		return euclid(Math.max(num1, num2), Math.min(num1, num2));
	}
	/* 최소 공배수 : 최소공배수 = 큰 수 * 작은 수 / 최대공약수 */
	private int lcm(int num1, int num2) {
		return (num1*num2) / gcd(num1, num2);
	}
	
    @Test
    public void problem1() throws Exception {

        assertEquals("", "");
        
        int result = 1;
        /* 1~20까지의 최소 공배수 */
        for (int i = 2; i < 20; i++) {
        	result = lcm(result, i);
		}
        System.out.println(result);
    }
    
    /*==============================================================*/
    
	/* 최대 공약수 */
	private int gcd2(int num1, int num2) {
		
		int a;
		
		/*유클리드 알고리즘*/
		while(true) {
			a = num1 % num2;
			if(a == 0)
				break;
			num1 = num2;
			num2 = a;
			
		}
		return num2;
	}
	/* 최소 공배수 : 최소공배수 = 큰 수 * 작은 수 / 최대공약수 */
	private int lcm2(int num1, int num2) {
		return (num1*num2) / gcd2(num1, num2);
	}
	
    @Test
    public void problem2() throws Exception {

        assertEquals("", "");
        
        int result = 1;
        /* 1~20까지의 최소 공배수 */
        for (int i = 2; i < 20; i++) {
        	result = lcm2(result, i);
		}
        System.out.println(result);
    }
}
