package ch11.exam07;

import java.util.Properties;
import java.util.Set;

public class GetPropertyExample {

	public static void main(String[] args) {
		String osName = System.getProperty("os.name");
		System.out.println(osName);
		
		
		String userName = System.getProperty("user.name");
		System.out.println(userName);
		
		
		String userHome = System.getProperty("user.home");
		System.out.println(userHome);
		
		
		Properties props = System.getProperties();
		Set keys = props.keySet();
		for(Object objkey : keys) {
			String key = (String) objkey;
			System.out.print(key);
			System.out.print(" : ");
			String value = System.getProperty(key);
			System.out.println(value);
		}
	}

}
