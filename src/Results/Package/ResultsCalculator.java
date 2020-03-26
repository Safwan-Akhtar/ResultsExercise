package Results.Package;

public class ResultsCalculator {
	
	public void displayResults (int phys, int chem, int bio) {
		System.out.println("physics: " + phys + " /150");
		System.out.println("chemistry: " + chem + " /150");
		System.out.println("biology: " + bio + " /150");
		System.out.println("total: " + (phys + chem + bio + " /450"));
	}
	
	public double displayPercentage(double total) {
		return total * 100 /450;
	}
	
	int failcounter = 0;
	
	public void passOrFail (int phys, int chem, int bio) {
				
		if ((phys * 100 /150) < 60) {
			System.out.println("failed Physics: " + (phys * 100 /150) + "%");
			failcounter++;
		}
		
		if ((chem * 100 /150) < 60) {
			System.out.println("failed Chemistry: " + (chem * 100 /150) + "%");
			failcounter++;
		}
		
		if ((bio * 100 /150) < 60) {
			System.out.println("failed Biology: " + (bio * 100 /150) + "%");
			failcounter++;
		}
		
		System.out.println("failed " + failcounter + " Exams");
		
		if (failcounter > 0) {
			System.out.println("you failed your exams");
		}
		
		else {
			System.out.println("you passed!!!");
		}
		
	}
	
}
