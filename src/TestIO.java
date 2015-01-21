public class TestIO {

	// private static final String HELLO_WORLD = "Hello world";
	private static final String FILE_NAME = "myfile";
	private static final String FILE_NAME2 = "myfile2";

	public static void main(String[] args) {

		ReadIO<Person> readIO = new DataPersonReader(FILE_NAME);
		WriteIO<Person> writeIO = new DataPersonWriter(FILE_NAME2);
		ProcessIO<Person> processIO = new ProcessIO<Person>(readIO, writeIO);
		System.out.println(processIO.process());

	}
}
