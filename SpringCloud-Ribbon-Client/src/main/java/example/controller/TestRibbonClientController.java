package example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("ribbon")
public class TestRibbonClientController {

	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping("/get")
	public String visitService() {
		String url = "http://myservice/service/info";
		String ret = restTemplate.getForObject(url, String.class);
		return ret;
	}
}
