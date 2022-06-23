package mypkg;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
@RestController

public class HomeController {
//	@Value("${server.port}")
//	public String port;
//	@GetMapping("/demo")
//	public String getDemo() {
//		return port;
//	}
	
	@Autowired
	//@LoadBalanced
	private RestTemplate restTemplate;


	@GetMapping("/home")
	public String home()
	{ 
		
		return restTemplate.getForObject("http://PRODUCT-MICROSERVICE/products", String.class);
		//return "hello jarvis";
	}
}
