import java.io.FileWriter;
import java.io.IOException;

public class SimpleFileWrite implements FileWrite {

	public void write(String file, String data) {
		FileWriter fileWriter = null;
		try {
			fileWriter = new FileWriter(file, true);
			fileWriter.write(data);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (fileWriter != null)
				try {
					fileWriter.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
		}

	}
}
