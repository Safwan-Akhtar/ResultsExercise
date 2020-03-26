package Results.Package;

public class Runner {
	public static void main(String[] args) {
		int phyMark = 100; // of a total of 150
		int chemMark = 120; // of a total of 150
		int bioMark = 70; // of a total of 150
		int total = phyMark + chemMark + bioMark; //of a total of 450
		
		ResultsCalculator res = new ResultsCalculator();
		
		res.displayResults(phyMark, chemMark, bioMark);
		System.out.println("total percentage: " + res.displayPercentage(total) + "%");
		
		res.passOrFail(phyMark, chemMark, bioMark);
	}
}