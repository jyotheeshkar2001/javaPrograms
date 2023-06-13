package com.dress.user.util;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import org.springframework.stereotype.Component;

import com.dress.user.UserDT;
@Component
public class CSVHelper {
	public static final String TYPE="text/csv";

    public static String[] headers= {"firstName","middleName","lastName","dateOfBirth","city","email","favouritecricketer"};
    public List<UserDT> getUserDTList(String fileName){
    	List<UserDT> userDt=new ArrayList<>();
    	try(FileReader reader=new FileReader(fileName);
    			BufferedReader bufferReader=new BufferedReader(reader);
    			CSVParser parser=new CSVParser(bufferReader,CSVFormat.DEFAULT.withFirstRecordAsHeader().withTrim());){
    		
    		 List<CSVRecord> records=parser.getRecords();
    		 for(CSVRecord csvRecord:records)
    		 {
    			 String firstName=csvRecord.get("firstName");
    			 String middleName=csvRecord.get("middleName");
    			 String lastName=csvRecord.get("lastName");
    			 String dateOfBirth=csvRecord.get("dateOfBirth");
    			 String city=csvRecord.get("city");
    			 String email=csvRecord.get("email");
    			 String favouritecricketer=csvRecord.get("favouritecricketer");
    			 UserDT userDT=new UserDT(firstName,middleName,lastName,dateOfBirth,city,email,favouritecricketer);
    			 
    			 userDt.add(userDT);
    			 		
    			 
    		 }
    		 return userDt;
    	}catch(Exception e)
    	{
    		e.printStackTrace();
    		throw new RuntimeException();
    	}
    }
    public String getCSVFile(String fileName)
    {
    	return fileName;
    			
    }
    

}
