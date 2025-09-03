import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;
public class ArrayList3 {
    public static void main(String[] args) {
        ArrayList<String> products = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the no. of products");
        int n = scan.nextInt();
        for(int i =0; i<n; i++){
            products.add(scan.next());
        }
        Iterator itr = products.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());;
        }
        products.addLast("Lichi");
        products.addFirst("kiwi");
        products.addLast("papaya");
        Collections.sort(products);
        System.out.println(products);
        System.out.println(products.getFirst());
        System.out.println(products.getLast());
        System.out.println(products.get(3));


    }
}