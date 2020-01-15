import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MyMain {
    public static void main(String args[]){
//        Minion Bob = new Minion("Bob", 3.2, 3);
//        System.out.println(Bob.getMinionName());
//
//        System.out.println(Bob.getMinionHeight());
//
//        System.out.println(Bob.getNumEvilDeedsComp());
//
//        System.out.println(Bob.toString());
        List<Minion> minionList = new ArrayList<>();

        Scanner input = new Scanner(System.in);

        boolean canContinue = true;

        while(canContinue){
            int choice = input.nextInt();
            String inputName;
            double inputHeight;
            switch(choice){
                case 1:
                    System.out.println("List of minions");
                    System.out.println(("*"));
                    for(int i=1; i<=minionList.size(); i++){
                        System.out.println(i + ". " + minionList.get(i-1).getMinionName()
                            + ", " + minionList.get(i-1).getMinionHeight() + ", "
                            + minionList.get(i-1).getNumEvilDeedsComp() + "evil deed(s)");
                    }
//                case 2:
//                    System.out.println("Enter minion's name: ");
////                    inputName = input.next();
//
//                    System.out.println("Enter minion's height");
            }
        }
    }
}
