
/**
 * 
 * @author Mayur
 * Let us use a 2 dimensional array to solve this problem in a simplest way 
 * but not entirely efficient way as some of the memory will get wasted here 
 */
public class WaterOverflow 
{
	// Let us assume the 2 dimensional array size to max level of 100 
	double[][] glasses = new double[100][100];
	
	/**
	 * @param total capacity of each glasss
	 * @param totalWater poured
	 * @return the total number of levels till which we will have water in the glasses.
	 */
	public int fillWaterInGlasses(double capacity, double totalWater) {
		
		if(capacity <= 0 || totalWater <= 0){
		   return 0;
		}
		
		// pour all the water initially in the top glass
		glasses[0][0] = totalWater;
		int level = 0;
		boolean waterInLevel = true;
		
		while(waterInLevel){
			waterInLevel = false;
			
			// for each glass in the level
			for (int j = 0; j <= level; j++) {
				
				// If the glass limit exceeds then pour the water in the glass next level
				if(glasses[level][j] > capacity){
					
					double extraWater = glasses[level][j] - capacity;
					glasses[level][j] = capacity;
	                glasses[level+1][j] += extraWater / 2;
	                glasses[level+1][j+1] += extraWater / 2;
	                waterInLevel = true;
				}
			}
			level++;
		}
		
		
		return level-1;
	}
	
	public static void main(String[] args) {
		WaterOverflow wf = new WaterOverflow();
		// Setting the capacity of eacg glass to 0.25 and total water to 1.0
		int level = wf.fillWaterInGlasses(0.25, 1.0);
		
		for(int i=0; i<=level; i++)
	    {
	        for(int j=0; j<=level; j++){
	        	System.out.print(""+wf.glasses[i][j]+"   ");
	        }
	        System.out.println();
	    }
		
		
	}
} 
