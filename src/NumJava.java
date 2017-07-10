
public class NumJava {
	Double[] sum(Double[] a, Double[] b) {
		if(a.length != b.length) {
			System.out.println("Error : Length are different!");
			return null;
		}
		
		Double[] ans = new Double[a.length];
		for(int i = 0; i < a.length; i++) {
			ans[i] = a[i] + b[i];
		}
		return ans;
	}
	
	Double[] multiply(Double[] a, Double[] b) {
		if(a.length != b.length) {
			System.out.println("Error : Length are different!");
			return null;
		}
		
		Double[] ans = new Double[a.length];
		for(int i = 0; i < a.length; i++) {
			ans[i] = a[i] * b[i];
		}
		return ans;
	}
	
	Double sumTotal(Double[] a) {
		Double ans = 0.0;
		for(int i = 0; i < a.length; i++) {
			ans += a[i];
		}
		return ans;
	}
}
