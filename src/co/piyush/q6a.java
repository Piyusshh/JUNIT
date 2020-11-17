package co.piyush;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;

public class q6a {
	@RepeatedTest(3)
	void test_with_RepetitionInfo_Injection(RepetitionInfo repetitionInfo) {

		System.out.println("Count no :"+repetitionInfo.getCurrentRepetition());
		if(repetitionInfo.getCurrentRepetition() == 1)
		{
			assertEquals(5,Function.findMax(new int[]{1,1,1,5}));
			System.out.println("Finded Maximum amongst the array\n");
		}
		if(repetitionInfo.getCurrentRepetition() == 2)
		{
			assertEquals(-12,Function.findMin(new int[]{-12,-3,-4,-2}));
			System.out.println("Finded Minimum amongst the array\n");
		}
		if(repetitionInfo.getCurrentRepetition() == 3)
		{
			assertEquals(10,Function.findSum(new int[]{1,3,4,2}));
			System.out.println("Finded Sum of the array elements\n");
		}
}
}
