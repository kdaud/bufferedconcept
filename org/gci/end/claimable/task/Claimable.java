package gci.end.claimable.task;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Claimable {
	
	private Random randomGenerator;
	
	private List<String> response;
	
	public Claimable() {
		randomGenerator = new Random();
		response = new ArrayList<String>();
		fillResponse();
	}
	
	public String generateResponse() {
		int index = randomGenerator.nextInt(response.size());
		return response.get(index);
	}
	
	public void fillResponse() {
		response.add("The gci claimable deadline is done!");
		response.add("The gci winner in OpenMRS may be Preshmesh not sure though!");
		response.add("It is a threaling experience to be a mentor with OpenMRS");
		response.add("Now GSoC is come!");
		response.add("God holds the future");
		response.add("Java is a cool language to program in");
	}
}
