package col8;

public class BestMaxSubsetFinder implements MaxSubsetFinder {

	@Override
	public int find(int... ns) {
		int maxSofar = 0;
		int maxEndingHere = 0;
		
		for (int v : ns) {
			maxEndingHere = Math.max(maxEndingHere + v, 0);
			maxSofar = Math.max(maxSofar, maxEndingHere);
		}
		
		return maxSofar;
	}

}
