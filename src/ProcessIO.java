public class ProcessIO {

	public String process(String fileName, String data) {

		WriteIO<String> fileWrite = new SimpleFileWrite();

		fileWrite.write(fileName, data);

		ReadIO<String> fileRead = new SimpleFileRead();

		String dataRead = fileRead.read(fileName);

		return dataRead;
	}
}
