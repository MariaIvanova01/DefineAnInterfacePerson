package defineAnInterfacePerson;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Birthable> birthables = new ArrayList<>();

        while (true){
            String[] input = scan.nextLine().split(" ");

            if (input[0].equals("End")){
                break;
            }

            Birthable birthable = input.length == 3
                    ? new Pet(input[1],input[2])
                    : new Citizen(input[1],Integer.parseInt(input[2]),input[3],input[4]);


            birthables.add(birthable);
        }
        String year = scan.nextLine();

        birthables.stream().forEach(birthable -> {
            if(birthable.getBirthDate().contains(year)){
                System.out.println(birthable.getBirthDate());
            }
        });
    }
}
