package arrays;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TotalSumOfBoundariesAndDiagonals {
static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    public static int[][] take2DInput() throws IOException {
        int n = Integer.parseInt(br.readLine().trim());

        if (n == 0) {
            return new int[0][0];
        }


        int[][] mat = new int[n][n];

        for (int row = 0; row < n; row++) {
            String[] strNums; 
            strNums = br.readLine().trim().split("\\s");
            
            for (int col = 0; col < n; col++) {
                mat[row][col] = Integer.parseInt(strNums[col]);
            }
        }

        return mat;
    }


    public static void main(String[] args) throws NumberFormatException, IOException {
        int t = Integer.parseInt(br.readLine().trim());

        while(t > 0) {

            int[][] mat = take2DInput();

            totalSum(mat);
            System.out.println();

            t -= 1;
        }
    }
    public static void totalSum(int[][] mat) {
		int m = mat.length;
        int sum = 0;
        if(m==0){
            sum = 0;
          	return;  
        }    
        int n = mat[0].length;
        for(int i=0; i<m-1; i++){
            for(int j=0; j<n-1; j++){
                if(i==0 || j==0 || i==m-1 || j==n-i){
                    sum+=mat[i][j];
                }
            }
        }
        System.out.print(sum);
	}
}
