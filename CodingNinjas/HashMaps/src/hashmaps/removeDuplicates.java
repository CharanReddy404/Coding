package hashmaps;

import java.util.ArrayList;
import java.util.HashMap;

public class removeDuplicates {

	public static ArrayList<Integer> removerDuplicates(int[] arr){
		ArrayList<Integer> output = new ArrayList<>();
		HashMap<Integer,Boolean> map = new HashMap<>();
		for(int i=0; i<arr.length; i++) {
			if(map.containsKey(arr[i])) {
				continue;
			}
			map.put(arr[i], true);
			output.add(arr[i]);
		}
		return output;
	}
	public static int maxFrequencyNumber(int[] arr){ 
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i=0; i<arr.length; i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
                continue;
            }
            map.put(arr[i],1);
        }
        int max = 0;
        int ans = 0;
        for(Integer i : map.keySet()){
            if(max<map.get(i)){
                max=map.get(i);
                ans = i;
            }
        	System.out.println(i+" "+map.get(i));
        }
        return ans;
    }
	
	public static void main(String[] args) {
//		int[] arr = {1,3,2,2,3,1,6,2,5};
//		ArrayList<Integer> output = removerDuplicates(arr);
//		System.out.println(output);
		int[] arr = {2, 12, 2, 11, 12, 2, 1, 2, 2, 11, 12, 2, 6};
		System.out.println("max: "+maxFrequencyNumber(arr));
	}

}
