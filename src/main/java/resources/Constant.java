package resources;

public class Constant {
	
	public final static String userName = "admin";
	public final static String password = "password";
	
	public final static long explicitWait = 100;
	public final static long impliciteWait = 100;
	
	public static String getUsername() {
		return userName;
	}
	public static String getPassword() {
		return password;
	}
	public static long getExplicitwait() {
		return explicitWait;
	}
	public static long getImplicitewait() {
		return impliciteWait;
	}

	/**Config Properties file **/
	public final static String CONFIG_PROPERTIES_DIRECTORY = "resources\\data.properties";
	
	public final static String GECKO_DRIVER_DIRECTORY = System.getProperty("user.dir") + "\\src\\test\\java\\drivers\\geckodriver.exe";
	
	public final static String CHROME_DRIVER_DIRECTORY = System.getProperty("user.dir") + "\\src\\test\\java\\drivers\\chromedriver.exe";

}
