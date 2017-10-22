import com.sun.org.apache.regexp.internal.RE;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Budget {

    static ArrayList receipt = new ArrayList<Receipt>();
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
        while (getTotal()<limit){
            float f = limit - getTotal();
            System.out.print("You have "+f+" left");
            System.out.println("add more stuff");
            add(limit);
        }

        System.out.print("\n\n"+receipt);
    }

    public float getTotal(){
        float rtn =0;
        for (int i=0; i<receipt.size();i++){
            Receipt r = (Receipt) receipt.get(i);
            rtn += r.getPrice();
        }
        return rtn;
    }

    public boolean add(float f){
        boolean exit = false;
        Scanner scanner = new Scanner(System.in);
        boolean b = f<getTotal();


        while (!exit) {
            System.out.println("Enter a new Receipt: ");
            System.out.print("Description: ");
            String sb = scanner.next();

            if (sb.equals("e")) {
                exit = true;
            } else if(b) {
                    exit = true;
            } else {
                System.out.print("Price: ");
                float si = scanner.nextFloat();
                add(si, sb);
                b = f<getTotal();
            }

        }
        if (b){
            System.out.println("YOU HAVE GONE OVER BUDGET!");
        }
        return (b);
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
