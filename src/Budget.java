import com.sun.org.apache.regexp.internal.RE;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Budget {

    static ArrayList receipt = new ArrayList<Receipt>();
    private int budget = 0;
    //Create an ArrayList

    public static void add(List<Receipt> recs) {
        for (Receipt r : recs) {
            add(r);
        }
    }

    public static void add(float price, String description) {
        Receipt r = new Receipt(price, description);
        add(r);
    }

    public static void add(Receipt r) {
        receipt.add(r);
    }


    //insert into ArrayList

    //get ArrayList

    //Set ArrayList

    public Budget(float limit, String number) {
        boolean exit = false;
        Scanner scanner = new Scanner(System.in);


        while (!exit) {
            System.out.println("Enter a new Receipt: ");
            System.out.print("Description: ");
            String sb = scanner.next();


            if (sb.equals("e")) {
                exit = true;
            } else {
                System.out.print("Price: ");
                float si = scanner.nextFloat();
                add(si, sb);
            }
        }

        System.out.print("\n\n"+receipt);
    }

    @Override
    public String toString() {
        String rtn = "";
        for (int i=0; i<receipt.size();i++){
            rtn += "\n"+receipt.get(i).toString();

        }
        return rtn;
    }
}
