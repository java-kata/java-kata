package kata0001;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Mina {

    @Test
    public void problem1() throws Exception {

        assertEquals("", "");

       int sum = 0; // 배수의 합 초기화
       int num1 = 3;
       int num2 = 5;
       
       for (int i = 1; i < 1000; i++) {
       	if (i%num1==0 || i%num2==0) {
       		// System.out.println(i);
       		sum += i;
       	}
       }
       System.out.println(sum);
        	
    }
    
    @Test
    public void problem2() throws Exception {
    	
        assertEquals("", "");

    	int sum = 0; // 배수의 합 초기화
        int num1 = 3;
        int num2 = 5;
    	
    	for (int i = 1; i < 1000; i++) {
    		if (i%num1==0) {
    			sum += i;
    			continue;
    		}
    		if (i%num2==0)
    			sum += i;
    	}
    	System.out.println(sum);
    }
}
