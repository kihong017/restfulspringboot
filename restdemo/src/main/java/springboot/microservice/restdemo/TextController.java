package springboot.microservice.restdemo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TextController {
	
	@RequestMapping(value = "list", method = RequestMethod.GET)
	public List<Text> test() {
	    List<Text> list = new ArrayList<Text>();
	     
	    for(int i=1; i<=10; i++) {
	    	Text helloWorld = new Text();
	    	helloWorld.setSeq(i);
	    	helloWorld.setText("HelloWorld");
	             
	        list.add(helloWorld);
	    }
	    return list;
    }
	
	@RequestMapping(value = "text/{seq}", method = RequestMethod.GET)
	public Text detail(@PathVariable("seq") long seq) {

		Text helloWorld = new Text();
		helloWorld.setSeq(seq);
		helloWorld.setText("HelloWorld");
		
		return helloWorld;
	}

}