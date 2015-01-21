public class IOMain {

	private static final String HELLO_WORLD = "Hello world";

	public static void main(String[] args) {

		String fileName = "myfile";

		FileWrite.write(fileName, HELLO_WORLD);

		String dataRead = FileRead.read(fileName);

		System.out.println(dataRead);

	}
}
