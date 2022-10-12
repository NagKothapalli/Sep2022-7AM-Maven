package gUtilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertiesData {
	Properties myprop;
	FileInputStream myfile;
	String filePath;
	public ReadPropertiesData(String path)
	{
		filePath = path;
	}
	public String readTestData(String mykey) 
	{		
		try {
			myfile = new FileInputStream(filePath);
			myprop = new Properties();
			myprop.load(myfile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		String a = myprop.getProperty(mykey);
		return a;
	}

}
