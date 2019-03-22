package RekursionandBacktracking;

public class Damenproblem {

	int n = 8;

	char[][] feld = new char[800][800];

	public static void main(String[] args) {
		Damenproblem d = new Damenproblem();
		int[] a = new int[d.n];
		
		System.out.println("DAMENPROBLEM\n------------\n");
		
		for (int i = 0; i < d.n + 1; i++) {
			d.feld[i][0] = '-';
			for (int j = 0; j < d.n; j++) {
				d.feld[i][j] = '-';
			}
		}

		d.damenSetzen(a, 0);

	}

	public void damenSetzen(int[] a, int n) {

		if (n == a.length) {
			int y = 0;
			for (int x : a) {
				y++;
				feld[y][x] = 'D';
			}
			for (int j = 0; j < n*2+1; j++) {
				System.out.print("—");
			}
			System.out.println();
			
			for (int i = 1; i < n + 1; i++) {
				System.out.print("|");
				System.out.print(feld[i][0]);

				for (int j = 1; j < n; j++) {
					System.out.print("|");
					System.out.print(feld[i][j]);
				}

				System.out.print("|");
				System.out.println();
				
				for (int j = 0; j < n*2+1; j++) {
					System.out.print("—");
				}
				System.out.println();
			}
			
			System.exit(0);
		}

		else {
			for (int i = 0; i < a.length; i++) {
				if (n == 0) {
					a[0] = n;
					damenSetzen(a, n + 1);
				}
				int x = 0;
				for (int j = 0; j < n; j++) {
					if (a[j] != i)
						if (a[j] != i + (n - j))
							if (a[j] != i - (n - j))
								x++;
				}
				if (x == n) {
					a[n] = i;
					damenSetzen(a, n + 1);
				}
			}
		}
	}

}