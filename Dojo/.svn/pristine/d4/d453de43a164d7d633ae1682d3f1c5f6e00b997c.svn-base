package main;

public class HelloWorld {

	private static final int _TIME = 5;

	public static void main(String[] args) throws Exception {
		HelloWorld helloWorld = new HelloWorld();
		helloWorld.imprimir();
		//helloWorld.imprimir2();

	}

	private void imprimir() throws InterruptedException {
		String helloWorld = "Hello world!";
		int _TIME = 2;
		String data = null;

		for (int i = 0; i < _TIME; i++) {
			long currentTimeMillis = System.currentTimeMillis();
			data = Long.toString(currentTimeMillis);
			data = data.substring(0, 7);
			System.out.println(helloWorld + " Time: " + currentTimeMillis + " SubString: " + data);
			Thread.sleep(10000);
		}
	}

	private void imprimir2() throws InterruptedException {

		int i = 0;
		while (i < _TIME) {

			long currentTimeMillis = System.currentTimeMillis();
			System.out.println("Hora atual: " + currentTimeMillis);
			i += 1;
			Thread.sleep(1000);

		}
	}

}
