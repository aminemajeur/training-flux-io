import java.io.Serializable;

public interface WriteIO<T extends Serializable> {

	public void open();

	public void write(T data);

	public void close();
	
}
