public interface ReadIO<T> {

	public void open();

	public T read();

	public void close();
}
