import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class SimpleFileRead implements ReadIO<String> {

	private String fileName;
	private BufferedReader bufferedReader = null;
	
	public void BufferedReader(String fileName) {
		this.fileName = fileName;
	}
	
	public String read() {
		String data = "";
		try {
			String line = null;
			while ((line = bufferedReader.readLine()) != null) {
				data += line;
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return data;
	}

	@Override
	public void open() {
		try {
			Reader reader = new FileReader(fileName);
			bufferedReader = new BufferedReader(reader);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void close() {
		try {
			bufferedReader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
