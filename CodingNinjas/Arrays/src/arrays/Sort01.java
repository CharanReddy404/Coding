package arrays;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sort01 {

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

            int[] input = takeInput();
            sortZeroesAndOne(input);
            printArray(input);

            t -= 1;
        }
    }
    public static void sortZeroesAndOne(int[] arr) {
        int[] a = new int[arr.length]; 
        int c = 0;
        int d = arr.length-1;
    	for(int i=0; i<arr.length; i++){
                if(arr[i]==0){
                    a[c]= 0;
                    c++;
                }
            }
        for(int i=arr.length-1; i>=0; i--){
            	if(arr[i]==1){
                    a[d]=1;
                    d--;
                }
        }
        for(int j=0; j<a.length; j++) {
        	arr[j]=a[j];
        }
    }

}
