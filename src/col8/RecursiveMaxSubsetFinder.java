package col8;

public class RecursiveMaxSubsetFinder implements MaxSubsetFinder {

	private int[] ns;
	
	@Override
	public int find(int... ns) {
		this.ns = ns;
		
		return max(0, ns.length - 1);
	}

	private int max(int l, int u) {
		if (l == u) return Math.max(0,  ns[l]);
		
		if (l > u) return 0;
		
		int mid = (l + u) / 2;
		
		int lMax = 0;
		int sum = 0;
		for (int i = mid; i >= l; i--) {
			sum += ns[i];
			lMax = Math.max(sum, lMax);
		}
		
		int rMax = 0;
		sum = 0;
		for (int i = mid + 1; i <= u; i++) {
			sum += ns[i];
			rMax = Math.max(sum, rMax);
		}
		
		return Math.max(lMax + rMax, 
						Math.max(max(l, mid), 
								 max(mid + 1, u)));
	} 
	
}
