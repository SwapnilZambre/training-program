package assignment2;

import java.util.HashMap;

public class MapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,String> state= new HashMap();
		
	
		state.put("TN", "Tamilnadu");
		state.put("MH", "MAHARASHTRA");
		state.put("KA", "kerala");
		System.out.println(state);
		
		
		HashMap<String,String> state1= new HashMap();
		
		
		state1.put("mp", "mpradesh");
		state1.put("UP", "UPRADESH");
		state1.put("TL", "TELANGANA");
		System.out.println(state1);
		
		
		if (state.containsValue("Maharashtra")){
			System.out.println("Contain the state");
		} else {
			System.out.println("Contain the state");
		}
	
	}

}
