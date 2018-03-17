package kata0010;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * @author mina1
 * 
 * 2 백만 이하의 모든 소수의 합을 구하십시오.
 */
public class Mina {
	
    public boolean isPrime(int n) {
        if (n == 1){
            return false;
        }
        int k = (int) Math.sqrt(n); //Math 클래스의 sqrt() 메소드(함수)로 루트 근사값을 구할 수 있음.
            for (int i = 2; i <= k; i++) {
                if (n % i == 0)
                    return false;
            }
            return true;
        }
	
    @Test
    public void problem1() throws Exception {

        assertEquals("", "");
        
        long Sum = 0;
        int counter = 1;
        while (counter < 2000000) {
            if (isPrime(counter)) {
                Sum += counter;
            }
            counter += 2;
        }
        System.out.println(Sum + 2); 
        
    }
}
