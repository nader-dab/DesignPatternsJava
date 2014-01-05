import java.text.DecimalFormat;


public class GetTheStock implements Runnable {

	private int startTime;
	private String stock;
	private double price;
	
	private IPublisher stockGrabber;
	
	public GetTheStock(IPublisher stockGrabber, int newStartTime, String newStock, double newPrice){
		this.stockGrabber = stockGrabber;
		this.startTime = newStartTime;
		this.stock = newStock;
		this.price = newPrice;
		
	}
	@Override
	public void run() {
	
		for(int i =1; i <= 20; i++){
			try{
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO: handle exception
			}
			
			double randomNum = (Math.random() * (.06)) - .03;
			
			DecimalFormat df = new DecimalFormat("#.##");
			
			price = Double.valueOf(df.format(price + randomNum));
			
			if(stock == "IBM"){
				((StockGrabber)stockGrabber).setIbmPrice(price);
			}
			
			if(stock == "AAPL"){
				((StockGrabber)stockGrabber).setAaplPrice(price);
			}
			
			if(stock == "GOOG"){
				((StockGrabber)stockGrabber).setGoogPrice(price);
			}
			
			System.out.println(stock + ": " + df.format((price + randomNum)) + " " + df.format(randomNum));
			System.out.println();
		
		}
		
	}

}
