package core.java.examples.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.yaml.snakeyaml.Yaml;

public class ReadYAMLFile {

	@SuppressWarnings({ "unchecked" })
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   // Load the YAML file
        Yaml yaml = new Yaml();
        String yamlFilepath = System.getProperty("user.dir")+File.separator+"config"+"\\stageconfig.yml";
        System.out.println(yamlFilepath);
try (FileInputStream inputStream = new FileInputStream (new File(yamlFilepath))) {
            
            if (inputStream == null) {
                System.out.println("Unable to find config.yml file");
                return;
            }
            // Parse the YAML file into a Map
            Map<String, Object> config = yaml.load(inputStream);
            // Access and print the YAML data
            Map<String, Object> app = (Map<String, Object>) config.get("app");
            System.out.println("App Name: " + app.get("name"));
            System.out.println("App Version: " + app.get("version"));
            System.out.println("App Enabled: " + app.get("enabled"));
            //reading the browsers list
            List<Map<String, Object>> browsers = (List<Map<String, Object>>) config.get("browsers");
            for (Map<String, Object> browser : browsers) {
                System.out.println("Browser Name: " + browser.get("name"));
                System.out.println("Browser Version: " + browser.get("version"));
                System.out.println("Is Headless: " + browser.get("headless"));
                // reading nested data
                Map<String, Object> environment = (Map<String, Object>) config.get("environment");
                System.out.println("Environment URL: " + environment.get("url"));

                Map<String, String> credentials = (Map<String, String>) environment.get("credentials");
                System.out.println("Username: " + credentials.get("username"));
                System.out.println("Password: " + credentials.get("password"));
            }

		
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

}
	
}
