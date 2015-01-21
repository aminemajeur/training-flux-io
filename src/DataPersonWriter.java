import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataPersonWriter implements WriteIO<Person> {

	private static final String SEPARATOR = "-----------------------------------";
	private String fileName;
	private DataOutputStream dataOutputStream = null;

	public DataPersonWriter(String fileName) {
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
	public void write(Person data) {
		try {
			String dataPerson = data + SEPARATOR;
			dataOutputStream.writeUTF(dataPerson);
			;
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
