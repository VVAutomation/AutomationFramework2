package commonActions;

public class CommonUtils {

	public static int getRandomNumber() {
		double d =Math.random()*10000000;
		int num=(int)d;
		System.out.println(num);
		return num;
	}

	public static void main(String[] args) {
		getRandomNumber();
	}
}
