import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class DataFileReader implements ReadIO<Integer> {

	private String fileName;
	private DataInputStream dataInputStream = null;

	public DataFileReader(String fileName) {
		this.fileName = fileName;
	}

	@Override
	public void open() {
		InputStream inputStream;
		try {
			inputStream = new FileInputStream(fileName);
			dataInputStream = new DataInputStream(inputStream);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public Integer read() {
		int sum = 0;
		try {
			sum += dataInputStream.readInt();
			dataInputStream.read();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return sum;

	}

	@Override
	public void close() {
		try {
			dataInputStream.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
