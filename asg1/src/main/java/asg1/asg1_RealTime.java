package asg1;



import java.io.IOException;

import java.util.*;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class asg1_RealTime {
	
	public static List<Data_info> searchInfo(){
		try {
		//determine website
		final Document doc = Jsoup.connect("https://ms.wikipedia.org/wiki/Malaysia").get();
		List<Data_info>  df= new ArrayList<>();
		
		//determine the table in website
		for(Element row:doc.select("#mw-content-text > div > table:nth-child(148) tr")){
			
		
			final String th = row.select("th").text(); 
			final String td = row.select("td").text(); 
			
			//retrieve data in Data_info 
			df.add(new Data_info(th,td));
		}
		return df;
		
		}catch(Exception e) {
			return null;
		}
	}
	
		
	
	}


