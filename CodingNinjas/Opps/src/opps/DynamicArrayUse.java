package opps;

public class DynamicArrayUse {
	
	public static void main(String[] args) {
		DynamicArray d = new DynamicArray();
		
		for(int i=1; i<100; i++) {
			d.add(i);
		}
		System.out.println("Size = "+d.size());
		System.out.println("value = "+d.get(98));
		System.out.println("value = "+d.get(2));
		d.set(2, 2);
		System.out.println("value = "+d.get(2));
		System.out.println("Size = "+d.size());
		while(!d.isEmpty()) {
			d.removeLast();
		}
		System.out.println("Size = "+d.size());
	}
}
