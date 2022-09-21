package genralization;

public class ImplementsMethod extends DriverClass {
	
	public static void main(String[] args) throws InterruptedException {
		
		DriverClass pg=new DriverClass();
		pg.chrome();
		pg.fireFox();
		Thread.sleep(4000);
		pg.edge();
		
	}

}
