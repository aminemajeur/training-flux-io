public class IOMain {

	private static final String HELLO_WORLD = "Hello world";

	public static void main(String[] args) {

		String fileName = "myfile";

		FileWrite<String> fileWrite = new SimpleFileWrite();

		fileWrite.write(fileName, HELLO_WORLD);

		FileRead<String> fileRead = new SimpleFileRead();

		String dataRead = fileRead.read(fileName);

		System.out.println(dataRead);

	}
}
