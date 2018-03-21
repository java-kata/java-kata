package star;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * @author mina1
 * 
 * for문을 활용한 별 찍기
 */
public class Mina {
	
	/**
	 * *****
	 * *****
	 * *****
	 * *****
	 * *****
	 */
    @Test
    public void problem1() throws Exception {

        assertEquals("", "");
        
        for (int i = 0; i < 5; i++) { // 행
        	for (int j = 0; j < 5; j++) {  // 열
        		System.out.print("*");
			}
        	System.out.println("");
		}
    }
    
	/**
	 * *
	 * **
	 * ***
	 * ****
	 * *****
	 */
    @Test
    public void problem2() throws Exception {

    	int a = 1;
        for (int i = 0; i < 5; i++) {
        	for (int j = 0; j < a; j++) { 
        		System.out.print("*");
			}
        	a += 1;
        	System.out.println("");
		}
    }
    
    /**
     *     *
     *    **
     *   ***
     *  ****
     * *****
     */
    @Test
    public void problem3() throws Exception {
    	

    }
}
