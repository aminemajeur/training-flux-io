import java.io.FileWriter;
import java.io.IOException;

public abstract class FileWrite {

	public static void write(String file, String data) {

		try {
			FileWriter fileWriter = new FileWriter(file, true);
			fileWriter.write(data);
			fileWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
