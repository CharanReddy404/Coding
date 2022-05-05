package arrays;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CodeMergeTwoSortedArrays {
static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    public static int[] takeInput() throws IOException {
        int size = Integer.parseInt(br.readLine().trim());
        int[] input = new int[size];

        if (size == 0) {
            return input;
        }
        
        String[] strNums; 
        strNums = br.readLine().split("\\s");
        

        for (int i = 0; i < size; ++i) {
            input[i] = Integer.parseInt(strNums[i]);
        }

        return input;
    }

    public static void printArray(int[] arr) {
        for (int element : arr) {
            System.out.print(element + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) throws NumberFormatException, IOException {
        int t = Integer.parseInt(br.readLine().trim());

        while(t > 0) {

            int[] input1 = takeInput();
            int[] input2 = takeInput();
            int[] ans = merge(input1, input2);
            //printArray(ans);

            t -= 1;
        }
    }
    public static int[] merge(int arr1[], int arr2[]) {
    	int[] a = new int[arr1.length+arr2.length];
        int n = a.length;
        for(int i=0; i<arr1.length; i++){
            a[i] = arr1[i];
        }
        int temp = 0;
        for(int i=arr1.length; i<n; i++){
            a[i] = arr2[temp];
            temp++;
        }
        temp =0;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(a[i]>a[j]){
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        for(int i=0; i<n; i++) {
        	System.out.print(a[i]+" ");
        }
        return a;
    }
}

