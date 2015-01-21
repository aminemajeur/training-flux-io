import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public abstract class FileRead {

	public static String read(String file) {
		String data = "";

		try {
			FileReader fileReader = new FileReader(file);
			BufferedReader reader = new BufferedReader(fileReader);
			String line = null;
			while ((line = reader.readLine()) != null) {
				data += line;
			}
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return data;
	}
}
