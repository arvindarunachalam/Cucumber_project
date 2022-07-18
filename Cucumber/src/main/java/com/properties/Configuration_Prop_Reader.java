 package com.properties;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Configuration_Prop_Reader {
	public static Properties p;

	public Configuration_Prop_Reader() throws IOException {

		File f = new File(
				"E:\\eclipse-workspace\\Arvind_Maven\\src\\main\\java\\com\\properties\\config.properties");
		FileInputStream fis = new FileInputStream(f);
		p = new Properties();
		p.load(fis);
	}
     public String get_browser() {
      String brow = p.getProperty("browser");
      return brow;
	}
	public String get_url() {
		String Url = p.getProperty("url");
		return Url;

	}

	public String get_uname() {
		String Uname = p.getProperty("username");
		return Uname;
	}
	public String get_pass() {
      String pass = p.getProperty("password");
      return pass;
	}
	public String get_dropdown() {
     String dd = p.getProperty("dropdown");
     return dd;
	}
}
