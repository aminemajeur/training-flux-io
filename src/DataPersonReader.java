import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Date;

public class DataPersonReader implements ReadIO<Person> {

	private String fileName;
	private DataInputStream dataInputStream = null;

	public DataPersonReader(String fileName) {
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
	public Person read() {
		Person person = null;
		try {
			String dataLine = dataInputStream.readLine();
			String datas[] = dataLine.split(",");
			person = new Person(datas[0], datas[1], new Date(datas[2]));
			dataInputStream.read();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return person;

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
