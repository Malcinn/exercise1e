package wdsr.exercise1;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.verify;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import wdsr.exercise1.logic.Calculator;

public class CalculatorUtilSubtractionTest {
	private Calculator calculator;
	private CalculatorUtil calcUtil;

	@Before
	public void init() {
		calculator = Mockito.mock(Calculator.class);
		calcUtil = new CalculatorUtil(calculator);
	}

	@Test
	public void test3minus1() {
		//given
		when(calculator.subtract(anyInt(), anyInt())).thenReturn(2);
		//when
		String results = calcUtil.getSubstractionText(3, 1);
		//then
		assertEquals("3 - 1 = 2",results);
		verify(calculator).subtract(anyInt(), anyInt());
	}
}
