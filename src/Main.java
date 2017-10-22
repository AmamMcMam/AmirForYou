import java.util.ArrayList;




public class Main {
	
	ArrayList receipt = new ArrayList<Receipt>();
	private int budget = 0;
	//Create an ArrayList
	
    private void add(List<Receipt> recs){
        for(Receipt r: recs){
            add(r);
        }
    }

	private void add(float price, String description){
        Receipt r = new Recept(price, description);
        add(r);
    }

    private void add(Receipt r){
		receipt.add(r);
	}
	
	
	
	//insert into ArrayList

	//get ArrayList
	
	//Set ArrayList
	
	
	public static void main(String[] args) {
		
		

	}

}
