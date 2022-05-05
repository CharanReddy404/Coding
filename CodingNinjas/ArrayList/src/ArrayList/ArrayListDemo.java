package ArrayList;
import java.util.ArrayList;
public class ArrayListDemo {

	public static void main(String[] args) {
		
		ArrayList<Integer> arr = new ArrayList<>();
		arr.add(9);
		arr.add(8);
		arr.add(6);
		System.out.println(arr.size());
		for(int i=0; i<arr.size(); i++) {
			System.out.print(arr.get(i)+" ");
		}
		arr.add(2, 7);
		System.out.println();
		System.out.println(arr.size());		
		for(int i=0; i<arr.size(); i++) {
			System.out.print(arr.get(i)+" ");
		}
	}

}
