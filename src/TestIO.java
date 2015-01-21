public class TestIO {

	private static final String HELLO_WORLD = "Hello world";
	private static final String FILE_NAME = "myfile";

	public static void main(String[] args) {

		ProcessIO processIO = new ProcessIO();
		String result = processIO.process(FILE_NAME, HELLO_WORLD);
		System.out.println(result);
	}
}
