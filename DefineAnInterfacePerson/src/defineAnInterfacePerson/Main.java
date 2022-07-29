package defineAnInterfacePerson;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numOfPeople = Integer.parseInt(scan.nextLine());

        Map<String,Buyer> buyers = new HashMap<>();

        for (int i = 0; i < numOfPeople; i++) {
            String[] input = scan.nextLine().split(" ");
            String name = input[0];
            Buyer buyer;
            if (input.length == 3){
               buyer = new Rebel(name);
            }else{
                buyer = new Citizen(name);
            }
            buyers.put(name,buyer);
        }
        while (true){
            String buyersName = scan.nextLine();

            if (buyersName.equals("End")){
                break;
            }

            Buyer buyer = buyers.get(buyersName);

            if (buyer != null){
                buyer.buyFood();
            }
        }

        int totalFood = buyers.values().stream().mapToInt(Buyer::getFood).sum();
        System.out.println(totalFood);

    }
}
