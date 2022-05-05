package arrays;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Arrays {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


    public static void printArray(int[] arr) {
        for (int element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) throws NumberFormatException, IOException {
        int t = Integer.parseInt(br.readLine().trim());

        while(t > 0) {
            int n = Integer.parseInt(br.readLine());
            int[] arr = new int[n];

            Solution.arrange(arr, n);
            printArray(arr);

            t -= 1;
        }
    }
    public class Solution {
        
        public static void arrange(int[] arr, int n) {
        	int[] a = arr;
        	int m =n, count = 0;
            for(int i=1; i<=n; i++){
                if(i%2!=0){
                    a[count] = i;
                    count++;
                }  
            }
            for(int i=n; i>=1; i--){
            	if(i%2==0){
                    a[count] = i;
                    count++;
                }
            }
            
        }
    }
}
