package utility;

import java.io.FileReader;
import java.io.IOException;

import com.google.gson.Gson;

public class JsonFileReader 
{
	public static TestData readTestData(String filepath) throws IOException, IOException
	{
		try(FileReader reader=new FileReader(filepath))
		{
			Gson gson=new Gson();
			return gson.fromJson(reader,TestData.class);
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return null;
		}
		
		
	}
	
}


