
import static org.junit.Assert.*;

import org.junit.Test;

/**
 * 
 * @author Mayur
 * 
 */
public class FilterWaterInGlassesTest {

	@Test
	public void filterWaterInGlassesTest() {
		WaterOverflow waterOverFlow = new WaterOverflow();
		int result = waterOverFlow.fillWaterInGlasses(1, 10);
		assertEquals(4, result);
		
		
		int resultWithZeroCapacity = waterOverFlow.fillWaterInGlasses(0, 10);
		assertEquals(0, resultWithZeroCapacity);
		
		int resultWithZeroWater = waterOverFlow.fillWaterInGlasses(2.5, 0);
		assertEquals(0, resultWithZeroWater);
	}

}
