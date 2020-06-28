package day;

public class xiancheng extends Thread {
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println(i + "+++多线程+++");

		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		xiancheng thread = new xiancheng();
		thread.start();
		for (int i = 0; i <= 10; i++) {
			System.out.println(i + "---多线程---");

		}

	}

}
