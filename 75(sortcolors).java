class Solution {
    public void sortColors(int[] nums1) {
         int count0 = 0;
        int count1 = 0;
        int count2 = 0;
        
      
        for (int i = 0; i < nums1.length; i++) {
            if (nums1[i] == 0) {
                count0++;
            } else if (nums1[i] == 1) {
                count1++;
            } else if (nums1[i] == 2) {
                count2++;
            }
        }

        int index = 0;
        
        for (int i = 0; i < count0; i++) {
            nums1[index++] = 0;
        }
        for (int i = 0; i < count1; i++) {
            nums1[index++] = 1;
        }
        for (int i = 0; i < count2; i++) {
            nums1[index++] = 2;
        }

    }
}
