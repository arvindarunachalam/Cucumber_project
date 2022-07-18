package com.properties;

import java.io.IOException;

public class File_Reader {
//psdp
	private File_Reader() {  //private
		
	}
    public static File_Reader getInstance_Fr() {  //static
    File_Reader fr=new File_Reader();
    return fr;
	}
    public Configuration_Prop_Reader getInstance_cr() throws IOException {  //without_static
    	Configuration_Prop_Reader cr=new Configuration_Prop_Reader();
    	return cr;
	}
    
    
}
