import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class SimpleFileRead implements ReadIO<String> {

	public String read(String file) {
		String data = "";
		BufferedReader reader = null;
		try {
			FileReader fileReader = new FileReader(file);
			reader = new BufferedReader(fileReader);
			String line = null;
			while ((line = reader.readLine()) != null) {
				data += line;
			}
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		return data;
	}
}
