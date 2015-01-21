import java.io.Serializable;

public interface FileWrite<T extends Serializable> {

	public void write(String file, T data);
}
