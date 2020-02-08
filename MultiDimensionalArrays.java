
public class MultiDimensionalArrays {

	public static void main(String[] args) {

		int[] values = { 1, 2, 3 };

		System.out.println(values[1]);

		int[][] grid = { { 10, 20, 30 }, { 40, 50 }, { 60, 70, 80, 90 }, };

		System.out.println(grid[1][1]);
		System.out.println(grid[0][2]);

		String[][] texts = new String[2][3];
		texts[0][1] = "Nice";

		System.out.println(texts[0][1]);

		for (int row = 0; row < grid.length; row++) {
			for (int col = 0; col < grid.length; row++)
				System.out.println((grid[row][col] + "\t"));
		}

	}

}
