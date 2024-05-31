package com.Property;

public class File_Reader_Manager {
	
	private File_Reader_Manager(){//Constructor to restrict of this class from another class
		
	}
	public static File_Reader_Manager getInstFileReaderManager() {
		//that returns the instance of that class,global point access to get the access of SDP.
		
		File_Reader_Manager frm = new File_Reader_Manager();
		return frm;
		}
	
	public Config_Reader getInstanceConfig() {
		
		Config_Reader cr = new Config_Reader();
		return cr;
		
	}
	
}
