import java.awt.List;
import java.util.ArrayList;


public class StockGrabber implements IPublisher {
	
	private ArrayList<ISubsciber> subscribers;
	private double aaplPrice;
	private double ibmPrice;
	private double googPrice;
	
	public StockGrabber(){
		subscribers = new ArrayList<ISubsciber>();
	}
	public void register(ISubsciber subscriber){
		subscribers.add(subscriber);
	}
	
	public void unregister(ISubsciber subscriber){
		subscribers.remove(subscriber);
	}
	
	public void notifyObserver(){
		
		for (ISubsciber subsciber : subscribers) {
			subsciber.update(ibmPrice, aaplPrice, googPrice);
		}
	}
	
	public void setAaplPrice(double aaplPrice){
		this.aaplPrice = aaplPrice;
		notifyObserver();
	}
	
	public void setIbmPrice(double ibmPrice){
		this.ibmPrice = ibmPrice;
		notifyObserver();
	}
	
	public void setGoogPrice(double googPrice){
		this.googPrice = googPrice;
		notifyObserver();
	}
}
