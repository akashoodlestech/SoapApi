package utility;

import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Properties;

public class ConfigLoad {
	
	public void loadProperties(){
		try{
			Properties prop = new Properties();
			String propFileName = "config.properties";
			System.out.println("Hello |"+getClass().getClassLoader());
			InputStream inputStream = getClass().getClassLoader().getResourceAsStream(propFileName);
			 
			if (inputStream != null) {
				prop.load(inputStream);
			} else {
				throw new FileNotFoundException("property file '" + propFileName + "' not found in the classpath");
			}
			
			UrlMapping.CREATE_ORDER= prop.getProperty("CREATE_ORDER");
			UrlMapping.CANCEL_ORDER=prop.getProperty("CANCEL_ORDER");
			UrlMapping.CREATE_RETURN=prop.getProperty("CREATE_RETURN");
			UrlMapping.INVOICE_STATUS=prop.getProperty("INVOICE_STATUS");
			UrlMapping.RETURN=prop.getProperty("RETURN");
			UrlMapping.SEARCH_PRODUCT=prop.getProperty("SEARCH_PRODUCT");
			UrlMapping.ORDER_STATUS=prop.getProperty("ORDER_STATUS");
			Utility.username=prop.getProperty("username");
			Utility.password=prop.getProperty("password");
			Utility.Authorization=prop.getProperty("Authorization");
			String connecttimeout=prop.getProperty("connecttimeout");
			if(connecttimeout!=null){
			 Utility.connecttimeput=Integer.parseInt(connecttimeout);}
			
		System.out.println("Load Config |"+UrlMapping.CREATE_ORDER+"| Utility.username |"+Utility.username);
			
		}catch(Exception ex){
			ex.printStackTrace();
		}
	}

}
