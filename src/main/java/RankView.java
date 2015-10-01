public class RankView {

	public RankView(Rank[] rank) {
		for (int i = 0; i < rank.length; i++) {
			System.out.print("Rank number " + i);
			if (rank[i].size() == 0) {
				System.out.print("<empty>");
				System.out.println("");
			} else {
				for (int j = 0; j < rank[i].size() - 1; j++) {
					System.out.print("[");
				}
				System.out.print("[" + rank[i].getCardFromTop().getValue()
						+ "," + rank[i].getCardFromTop().getSuitValue() + "]");
				System.out.println("");
			}
		}
	}

}
