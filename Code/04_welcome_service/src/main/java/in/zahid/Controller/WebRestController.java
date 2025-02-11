package in.zahid.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebRestController {
	
	@Autowired
	private Environment env;
	
	@GetMapping("/welcome")
	
	public String getWelcomeMsg() {
		
		String port =  env.getProperty("server.port");
		String msg = "Welcome...( " + port + " ) " ;
		return msg;
		
	}

}
// Older Code
//package in.zahid.Controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.core.env.Environment;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//public class WebRestController {
//	
//	@GetMapping("/welcome")
//	
//	public String getWelcomeMsg() {
//		
//		
//		String msg = "Welcome.." ;
//		return msg;
//		
//	}
//
//}
