package utility;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Utility { 
	public static String username="admin";
	public static String password="skulocity";
	public static String Authorization="6b5eb4e73bc74a3ba307b1fecd042c3f";
	public static int connecttimeput=20000;
	
	public static  String getfullDate()
    {
            String DATE_FORMAT2 = "yyyy-MM-dd HH:mm:ss";
            SimpleDateFormat formatter = new SimpleDateFormat(DATE_FORMAT2);
            Calendar c1 = Calendar.getInstance();
            String CurrentDateTime = formatter.format(c1.getTime());
            return CurrentDateTime;

    }
	public String callUrl(String fullurl,String msg,String requesttype){
		String result="";
		System.out.println("Url Details | Url |"+fullurl+" | Data |"+msg+" Request Type |"+requesttype);
		try { 
			URL url=new URL(fullurl); 
			byte data[]=new byte[1024];
			System.out.println("url call ");
			HttpURLConnection connection = (HttpURLConnection)url.openConnection(); 
			connection.setRequestMethod(requesttype);
			connection.setRequestProperty("Accept", "application/json;charset=UTF-8");
			connection.setRequestProperty("username",username );
			connection.setRequestProperty("password", password);
			connection.setRequestProperty("Authorization",Authorization);
			//conn.setRequestProperty("X-Shopify-Access-Token", "05ae6c1ff5b4a2a4545eeb32a05fb115");
			connection.setRequestProperty("Content-Type", "application/json");
			connection.setConnectTimeout(connecttimeput); 
			connection.setReadTimeout(connecttimeput); 
			connection.setDoInput(Boolean.TRUE); 
			connection.setDoOutput(Boolean.TRUE); 
			byte[] Command=msg.getBytes(); 
			int len=Command.length;
			OutputStream outs=connection.getOutputStream();
			outs.write(Command,0,len); 
			outs.close();
			String output="";
			BufferedReader br = new BufferedReader(new InputStreamReader((connection.getInputStream())));
			while ((result = br.readLine()) != null) {
				output += result;
			}
			return output;
			 } catch (Exception e) { e.printStackTrace(); } 
			 
		return null;
		}

}
