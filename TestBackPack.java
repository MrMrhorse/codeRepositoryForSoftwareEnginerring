import org.junit.*;
import static org.junit.Assert.*;
import java.util.Arrays;
public class TestBackPack {
	@Test
	public void testBP() {
		 //最大容量为10
        int m = 10;
        int n = 3;
        //放入的三个物体重量分别为3， 4， 5；价值分别为4， 5， 6
        int w[] = {3, 4, 5};
        int p[] = {4, 5, 6};
		assertEquals("0 0 4 4 4 4 4 4 4 4 \r\n" + 
				"0 0 4 5 5 5 9 9 9 9 \r\n" + 
				"0 0 4 5 6 6 9 10 11 11",printStr(BackPack.BackPack_Solution(m, n, w, p)));
	}
	
	public static String printStr(int [][] arr) {
		String result="";
		for(int i=1;i<arr.length-1;i++) {
			for(int j=1;j<arr[0].length;j++) {
				result += (arr[i][j]+" ");
			}
			result += "\r\n";
		}
        for(int k=1;k<arr[0].length;k++) {
        	result += arr[arr.length-1][k];
        	if(k!=arr[0].length-1) {
        		result += " ";
        	}
        }
        return result;
	}
}
