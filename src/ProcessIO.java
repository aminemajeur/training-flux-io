import java.io.Serializable;

public class ProcessIO<T extends Serializable> {

	private WriteIO<T> writeIO;
	private ReadIO<T> readIO;

	public ProcessIO(ReadIO<T> readIO, WriteIO<T> writeIO) {
		this.readIO = readIO;
		this.writeIO = writeIO;
	}

	public T process() {

		readIO.open();
		T dataRead = readIO.read();
		readIO.close();
		
		writeIO.open();
		writeIO.write(dataRead);
		writeIO.close();


		return dataRead;
	}
}
