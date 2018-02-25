package kata0001;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Mina {

    @Test
    public void problem1() throws Exception {

        assertEquals("", "");

        //테스트 커밋
        public static void main (String[] args) {
        	
            System.out.print("1000 미만의 자연수에서 3,5의 배수의 총합 : ");
            method1(3,5);
            System.out.print("1000 미만의 자연수에서 3,5의 배수의 총합 : ");
            method2(3,5);
            
            }
            
            public static void method1(int num1, int num2) {
            	int sum = 0; // 배수의 합 초기화
            	
            	for (int i = 1; i < 1000; i++) {
            		if (i%num1==0 || i%num2==0) {
            			// System.out.println(i);
            			sum += i;
            		}
            	}
            	System.out.println(sum);
            	
            }
            public static void method2(int num1, int num2) {
            	int sum = 0; // 배수의 합 초기화
            	
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
}
