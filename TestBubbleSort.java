import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Test;

public class TestBubbleSort {
	@Test
	public void testBS() {
		assertEquals("[1, 2, 3, 4, 5]",Arrays.toString(BubbleSort.BubbleSort(new int[] {1,2,3,4,5})));
		assertEquals("[1, 2, 3, 4, 5]",Arrays.toString(BubbleSort.BubbleSort(new int[] {5,4,3,2,1})));
		assertEquals("[1, 2, 3, 4, 5]",Arrays.toString(BubbleSort.BubbleSort(new int[] {2,3,1,4,5})));
		assertEquals("[1, 2, 3, 4, 5]",Arrays.toString(BubbleSort.BubbleSort(new int[] {2,5,1,4,3})));
		assertEquals("[1, 2, 3, 4, 5]",Arrays.toString(BubbleSort.BubbleSort(new int[] {1,3,5,2,4})));
	}
}
