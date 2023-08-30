package com.EcommerceV1.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FilterInputStream;
import java.io.IOException;
import java.net.URI;
import java.util.Properties;

public class ReadConfig {
	Properties pro;
	public ReadConfig() {
		File src =new File("./Configurations/config.properties");
		try {
		FileInputStream file =new FileInputStream(src);
		pro=new Properties();
		pro.load(file);
	}catch(Exception e) {
		System.out.println("EXECEPTION IS "+e.getMessage());
	}
	
}

	
	public String getUrl() {
String url=pro.getProperty("Url");
return url;

	}
	public String username() {
String username=pro.getProperty("username");
return username;
	}
	public String password() {
String password=pro.getProperty("password");
return password;
	}
	
	public String chromepath() {
String chromepath=pro.getProperty("chromepath");
return chromepath;
	}
	public String msedgepath() {
		String msedgepath=pro.getProperty("msedgepath");
		return msedgepath;
	}
	
}
