
class fibonacci_{

	// Function to print the fibonacci series
	static int fibbo(int n)
	{
		// Base Case
		if (n <= 1)
			return n;

		// Recursive call
		return fibbo(n - 1)
			+ fibbo(n - 2);
	}
	public static void main(String args[])
	{
		// Given Number N
		int N = 10;

		// Print the first N numbers
		for (int i = 0; i < N; i++) {

			System.out.print(fibbo(i) + " ");
		}
	}
}
