public class Bisect {
	int counter = 0;
	public double f(double x) {
		// Square root of 2
		// double ans = 2.0 - (x*x);
		// 7th root of 126
		// double ans = 126.0 - Math.pow(x,7.0);
		// Positive real root of p(x);
		double ans = 6.0 - x - Math.pow(x,3.0);
		return ans;
	}
	// low is lower end of interval
	// high is higher end of interval
	// epsilon is interval width
	public double root(double low, double high, double epsilon) {
		double interval = high - low;
		double middle = (high + low)/2;
		while (interval > epsilon) {
			interval = high - low;
			middle = (high + low)/2;
			if (f(middle) > 0.0) {
				low = middle;
			}
			else if (f(middle) < 0.0) {
				high = middle;
			}
		}
		// System.out.println(middle);
		return middle;
	}
	// Finding the square root of any number
	public double sqroot(double number, double guess) {
		double ans = number - (guess*guess);
		return ans;
	}
	public double sqRootFind(double epsilon, double number) {
		double low = -number;
		double high = number;
		double interval = high - low;
		double middle = (high + low)/2;
		while (interval > epsilon) {
			counter++;
			interval = high - low;
			middle = (high + low)/2;
			if (sqroot(number, middle) > 0.0) {
				low = middle;
			}
			else if (sqroot(number, middle) < 0.0) {
				high = middle;
			}
			else if(middle*middle == number) {
				// System.out.println(middle);
				return middle;
			}
		}
		// System.out.println(middle);
		return middle;
	}
	
	public static void main(String[] args) {
		Bisect func = new Bisect();
		double num = 4;
		double epsilon = 0.000001;
		func.sqRootFind(epsilon, num);
	}
	
}
