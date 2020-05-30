package _07_tea_party;

public class Tea {

	private String name;
	private boolean isWoman;
	private boolean isKnighted;
	
	
	public String welcome(String name, boolean isWoman, boolean isKnighted) {
        
        /*Jane Austen is a woman, so say “Hello Ms. Austen”. 
        * George Orwell is a man, so say “Hello Mr. Orwell”. 
        * Isaac Newton was knighted, so say "Hello Sir Isaac Newton".
        **/
        
        if(isWoman==true && isKnighted==false) {
        	return "Hello Ms. " + name;
        }
        
        if(isWoman==false && isKnighted == false) {
        	return "Hello Mr. " +name;
        }
        
        if(isKnighted==true && isWoman==false) {
        	return "Hello Sir " + name;
        }
        
        
        return name;
    }
}
