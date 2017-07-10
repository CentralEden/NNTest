
public class Perceptron {
	NumJava nj = new NumJava();
	// AND回路
	int AndCircuit(Integer x1, Integer x2) {
		Double x[] = {new Double(x1), new Double(x2)};
		Double w[] = {0.5, 0.5};
		Double b = -0.7;
		Double in[] = nj.multiply(x, w);
		if(nj.sumTotal(in) + b <= 0) {
			return 0;
		}else {
			return 1;
		}
		
	}
}
