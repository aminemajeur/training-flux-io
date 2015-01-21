import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataFileWriter implements WriteIO<Integer> {

	private String fileName;
	private DataOutputStream dataOutputStream = null;

	public DataFileWriter(String fileName) {
		this.fileName = fileName;
	}

	@Override
	public void open() {
		try {
			FileOutputStream outputStream = new FileOutputStream(fileName);
			dataOutputStream = new DataOutputStream(outputStream);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void write(Integer data) {
		try {
			dataOutputStream.writeInt(data);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void close() {
		try {
			dataOutputStream.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
