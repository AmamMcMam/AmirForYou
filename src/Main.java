import java.util.ArrayList;
import java.util.List;




public class Main {
	
	static ArrayList receipt = new ArrayList<Receipt>();
	private int budget = 0;
	//Create an ArrayList
	
    private static void add(List<Receipt> recs){
        for(Receipt r: recs){
            add(r);
        }
    }

	private static void add(float price, String description){
        Receipt r = new Receipt(price, description);
        add(r);
    }

    private static void add(Receipt r){
		receipt.add(r);
	}
	
	
	
	//insert into ArrayList

	//get ArrayList
	
	//Set ArrayList
	
	
	public static void main(String[] args) {
		
		add(200, "Xbox second hand");
		System.out.println("done fam");
		
		

	}

}
