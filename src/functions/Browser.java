package functions;

public class Browser {

		public boolean launchBrowser(String browserName) {
			
			System.out.println("checking the browser...." + browserName);
			
			if(browserName.trim().equalsIgnoreCase("chrome")) {
				System.out.println("chrome is launched...");
				return true;
			}
			else if (browserName.trim().equalsIgnoreCase("firefox")) {
				System.out.println("firefox is launched....");
				return true;
			}

			else if (browserName.trim().equalsIgnoreCase("safari")) {
				System.out.println("safari is launched....");
				return true;
			}

			else if (browserName.trim().equalsIgnoreCase("edge")) {
				System.out.println("safari is launched....");
				return true;
			}

			else {
				System.out.println("Please pass the right browser.....");
				return false;
			}
			
		}
	
		public static void main(String[] args) {
		
			Browser br=new Browser();
			boolean flag = br.launchBrowser("chrome");
			System.out.println(flag);
		}
	
}
