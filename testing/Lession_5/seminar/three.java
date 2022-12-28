import java.util.*;

public class three {
    public static void main(String[] args) {
        // найти пересечение двух массивов
        int [] nums1 = new int[] {1,7,2,3,4};
        int [] nums2 = new int[] {3,5,6,3,7};
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums1.length; i++) {
            set.add(nums1[i]);
        }
           
        for (int i = 0; i < nums2.length; i++) {
            if(set.contains(nums2[i])){
                System.out.println("Значение: " + nums2[i]);
                set.remove(nums2[i]);
            }
        }
    }
}
