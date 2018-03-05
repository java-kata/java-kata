package kata0002;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * @author mina1
 *
 * 피보나치 시퀀스의 각 새로운 용어는 앞의 두 용어를 추가하여 생성됩니다. 1과 2로 시작하면 처음 10 개의 조건이됩니다.
 * 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
 * 값이 4 백만을 초과하지 않는 피보나치 시퀀스의 항을 고려함으로써 짝수 값의 합을 구하십시오.
 */
public class Mina {

    @Test
    public void problem1() throws Exception {

        assertEquals("", "");
        
        int max = 4000000;
        int num1 = 0, num2 = 1;
        int result = 0;
        int sum = 0; //짝수의 합
        
        while (result < max) {
        	result = num1 + num2;
        	num1 = num2;
        	num2 = result;
			//System.out.println(result);
			
			if (result%2 == 0)
				sum += result;
		}
        System.out.println(sum);
    }
}
