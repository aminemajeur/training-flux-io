import java.io.FileWriter;
import java.io.IOException;

public class SimpleFileWrite implements WriteIO<String> {

	private String fileName;
	private FileWriter fileWriter = null;

	public SimpleFileWrite(String fileName) {
		this.fileName = fileName;
	}

	public void write(String data) {
		try {
			fileWriter.write(data);
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}

	@Override
	public void open() {
		try {
			fileWriter = new FileWriter(fileName, true);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void close() {
		try {
			fileWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
