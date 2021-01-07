package com.qa.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ConfigReader {

	private Properties prop;

	public Properties get_prop() {
		prop = new Properties();
		try {
			FileInputStream fis = new FileInputStream("./src/test/resources/Config/config.properties");
			prop.load(fis);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return prop;
	}

}
