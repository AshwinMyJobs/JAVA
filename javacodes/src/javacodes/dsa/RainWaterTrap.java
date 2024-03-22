package javacodes.dsa;

public class RainWaterTrap {

	public static void main(String[] args) {

		//int[] heights = {1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
		
		int[] heights = {1,0,0,1};
		
		System.out.println(volumeOfTrappedRainWater(heights));
	}

	
	private static int volumeOfTrappedRainWater(int[] heights) {
	    
		int[] lmax = new int[heights.length];
		int[] rmax = new int[heights.length];
		
		int cur_max = -1;
		
		lmax[0] = 0;
		rmax[heights.length-1] = 0;
		
		for(int i=1; i<heights.length; i++){
			if(heights[i-1]>cur_max) cur_max = heights[i-1];
			lmax[i] = cur_max;
		}
		
		cur_max = -1;
		for(int i=heights.length-2; i>=0; i--){
			if(heights[i+1]>cur_max) cur_max = heights[i+1];
			rmax[i] = cur_max;
		}
		
		int result = 0;
		for(int i=0; i<heights.length-1; i++){
			if(lmax[i]<=rmax[i]){
				if( (lmax[i] - heights[i])<0 )
					result = result + 0;
				else
				 result = result + lmax[i] - heights[i];
			}else{
				if( (rmax[i] - heights[i])<0 )
					result = result + 0;
				else
					result = result + rmax[i] - heights[i];
			}
		}
		return result;
	}
}
