package col8;

import java.util.Random;

public class Demo {
	
	public static void main(String... args) {
		Random rand = new Random();
		int len = rand.nextInt(100000) + 2;
		
		int[] testArr = new int[len];
		for (int i = 0; i < len; i++) {
			boolean isNegtive = rand.nextInt() % 3 == 0;
			testArr[i] = rand.nextInt(100);
			testArr[i] = isNegtive ? -testArr[i] : testArr[i]; 
		}
		
		//testArr = new int[]{-25, -5, -1};
		
		for (int v : testArr)
			System.out.print(" " + v);
		System.out.println("\narray size: " + testArr.length);
		
		long start = System.nanoTime();
		int r = new RecursiveMaxSubsetFinder().find(testArr);
		long stop = System.nanoTime();
		System.out.print("max sum: " + r);
		System.out.println(",  elapsed: " + (stop - start) + "(ns)");
		
		start = System.nanoTime();
		r = new BestMaxSubsetFinder().find(testArr);
		stop = System.nanoTime();
		System.out.print("max sum: " + r);
		System.out.println(",  elapsed: " + (stop - start) + "(ns)");
	}
	
}
