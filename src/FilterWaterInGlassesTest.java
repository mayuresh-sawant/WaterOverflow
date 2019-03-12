
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
	}

}
