// Also known as Publish-Subscriber. When you need many other objects to receive
// an update when another object changes
// 
public class Main {

	public static void main(String[] args) {
		
		StockGrabber stockGrabber = new StockGrabber();
		
		StockObserver observer1 = new StockObserver(stockGrabber);
		StockObserver observer2 = new StockObserver(stockGrabber);
		
		stockGrabber.setIbmPrice(197);
		stockGrabber.setAaplPrice(677);
		stockGrabber.setGoogPrice(676);
		
		Runnable getIBM = new GetTheStock(stockGrabber, 2, "IBM", 197.00);
		Runnable getAAPL = new GetTheStock(stockGrabber, 2, "AAPL", 676.00);
		Runnable getGOOG = new GetTheStock(stockGrabber, 2, "GOOG", 197.00);
		
		new Thread(getIBM).start();
		new Thread(getAAPL).start();
		new Thread(getGOOG).start();
	
	}
}
