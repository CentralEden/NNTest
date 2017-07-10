
public class NNTest {

	public static void main(String[] args) {
		Perceptron per = new Perceptron();
		int ans;
		
		System.out.println("x1 | x2 | y");
		System.out.println("-----------");
		for(int i = 0; i < 2; i++) {
			for(int j = 0; j < 2; j++) {
				ans = per.AndCircuit(i, j);
				System.out.println(" "+ i + " |  " + j + " | " + ans);
				System.out.println("-----------");
			}
		}
	}

}
