public class ProcessIO {

	private static final String HELLO_WORLD = "Hello world";

	public static void main(String[] args) {

		String fileName = "myfile";

		Writable<String> fileWrite = new SimpleFileWrite();

		fileWrite.write(fileName, HELLO_WORLD);

		Readable<String> fileRead = new SimpleFileRead();

		String dataRead = fileRead.read(fileName);

		System.out.println(dataRead);

	}
}
