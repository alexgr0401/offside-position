package task;

import java.util.Arrays;

public class OffsidePosition {

	public static boolean isOffsidePosition(int[][] teams) {

		Arrays.sort(teams[0]);
		Arrays.sort(teams[1]);

		int leftTeamPlayer = teams[0][10];
		int rightTeamPlayer = teams[1][0];

		int leftGoalKeeper = teams[0][0];
		int rightGoalKeeper = teams[1][10];

		int secondToLastLeftTeamPlayer = teams[0][1];
		int secondToLastRightTeamPlayer = teams[1][9];

		if (leftTeamPlayer == rightGoalKeeper && leftTeamPlayer == 100) {
			return false;
		} else if (rightTeamPlayer == leftGoalKeeper && rightTeamPlayer == 0) {
			return false;
		}

		if (leftTeamPlayer > rightGoalKeeper || rightTeamPlayer < leftGoalKeeper) {
			return true;
		} else if (leftTeamPlayer < rightGoalKeeper && leftTeamPlayer > secondToLastRightTeamPlayer) {
			return true;
		} else if (rightTeamPlayer > leftGoalKeeper && rightTeamPlayer < secondToLastLeftTeamPlayer) {
			return true;
		}
		return false;

	}
}
