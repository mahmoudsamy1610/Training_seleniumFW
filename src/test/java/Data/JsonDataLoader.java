package Data;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonIOException;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;




public class JsonDataLoader {
	
public	JsonElement FN , LN , Email , PASS ;
	
	public void JsonDataReader () throws FileNotFoundException, IOException, ParseException  {
		
		String filePath = System.getProperty("user.dir")+"\\src\\test\\java\\Data\\userdata.json" ;
		File srcFile = new File(filePath) ;
		
		
		JSONParser parser = new JSONParser();
		JSONArray JArray = (JSONArray)parser.parse(new FileReader(srcFile)) ; 

		

		for (Object JsonObj :JArray) 
		{
			
			//JSONObject person = new JSONObject() ;
			//JSONObject person = (JSONObject) JsonObj ; //wrong by Moataz Nabil
			
			JSONObject person = (JSONObject) JsonObj;
			
			FN = (JsonElement) person.get("FN") ;
			System.out.println(FN) ;
			
			LN = (JsonElement) person.get("LN") ;
			System.out.println(LN) ;
			
			Email = (JsonElement) person.get("Email") ;
			System.out.println(Email) ;
			
			PASS = (JsonElement) person.get("PASS") ;
			System.out.println(PASS) ;
			
			
		}
		
		
	}

}
