package task;

public class Main {

	public static void main(String[] args) {
		
		int[][] teams = { { 5, 22, 30, 40, 30, 50, 30, 50, 50, 60, 50 },
				{ 96, 20, 30, 25, 25, 40, 60, 70, 80, 70, 40 } };

		OffsidePosition.isOffsidePosition(teams);
		System.out.println();

		int[][] teams2 = { { 5, 22, 30, 40, 30, 50, 30, 50, 50, 60, 50 },
				{ 96, 28, 30, 25, 25, 40, 60, 70, 80, 70, 40 } };

		OffsidePosition.isOffsidePosition(teams2);

	}
}
