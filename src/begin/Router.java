package begin;

import javax.faces.bean.*;

@ManagedBean
public class Router {
	
	private String destination;
	
	public String findDestination(){
		if(Math.random() >= 0.5){
			destination = "b";
		}
		else {
			destination = "defeat";
		}
		return destination;
	}
	
	public String findDestinationfromB(){
		if(Math.random() >= 0.5){
			destination = "c";
		}
		else {
			destination = "defeat";
		}
		return destination;
	}
	
	public String findDestinationfromC(){
		if(Math.random() >= 0.5){
			destination = "victory";
		}
		else {
			destination = "defeat";
		}
		return destination;
	}
	

}
