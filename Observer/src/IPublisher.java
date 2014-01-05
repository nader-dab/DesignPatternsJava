// Also know as Subject.
public interface IPublisher {
	public void register(ISubsciber subscriber);
	public void unregister(ISubsciber subscriber);
	public void notifyObserver();
}
