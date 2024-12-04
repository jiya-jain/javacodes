

public class TrappingRainWater {

        public static int trappingRainwater(int height[]) {
            int n = height.length;
            
            //calculate left max boundary
            int left[] = new int[n];
            left[0] = height[0];
            for (int i = 1; i < n; i++) {
                left[i] = Math.max(height[i], left[i - 1]);
            }
    
            // calculate right max boundary
            int right[] = new int[n];
            right[n - 1] = height[n - 1];
            for (int i = n - 2; i >= 0; i--) {
                right[i] = Math.max(height[i], right[i + 1]);
            }
    
            //calculate water trapped: (water level - height of bar) * width
            int wt = 0;
            int water_level;
            for (int i = 0; i < n; i++) {
                water_level = Math.min(right[i], left[i]);
                wt += (water_level - height[i]);
            }
    
            return wt;
        }
    
        public static void main(String[] args) {
            int height[] = {4, 2, 0, 6, 3, 2, 5};
            if (height.length > 2) {
            System.out.println(trappingRainwater(height));
            }
        }
    }
