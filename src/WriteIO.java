import java.io.Serializable;

public interface WriteIO<T extends Serializable> {

	public void write(String file, T data);
}
