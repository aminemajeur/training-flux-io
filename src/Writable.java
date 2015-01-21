import java.io.Serializable;

public interface Writable<T extends Serializable> {

	public void write(String file, T data);
}
