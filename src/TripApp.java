import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class TripApp {

    private static Scanner scan  = new Scanner(System.in);
    private static String input;
    private static boolean pick;
    private static String result;
    private static Random random = new Random();
    private static int randShoe =0;
    private static boolean pickJ;
    private static boolean pickP;
    private static boolean pickS;
    private static boolean pickSh;



    public static void main(String[]args){

        Shirt shirt1 =new Shirt("Shirt1","large", "Blue", "Cotton", "Long-Sleeve");
        Shirt shirt2 =new Shirt("Shirt2","Medium", "Red", "Denim", "Short-Sleeved");
        Shirt shirt3 =new Shirt("Shirt3","large", "Black", "Cotton", "No-Sleeves");


        Jacket jacket1 = new Jacket("Lether" ,"Medium", "Black", "Jacket1");
        Jacket jacket2 = new Jacket("Windbreaker" ,"Large", "Yellow", "Jacket2");
        Jacket jacket3 = new Jacket("Fleece" ,"Medium", "Grey", "Jacket3");

        Pants pants1 = new Pants("Polyester", "Large", "Red", "Shorts", "Pants1");
        Pants pants2 = new Pants("Jeans", "Large", "Blue", "Pants", "Pants2");
        Pants pants3 = new Pants("Nylon", "Medium", "White", "Leggings", "Pants3");

        Shoes shoe1 = new Shoes("Flippy-Floppy International", 10, "Green", "Flip-Flop", "Shoe1");
        Shoes shoe2 = new Shoes("New Balance", 9, "White", "Normal", "Shoe2");
        Shoes shoe3 = new Shoes("Jordan", 13, "Black", "Normal", "Shoe3");

        //ShoeChoice choice = new ShoeChoice();

//         ArrayList<Shoes> shoeCollection = new ArrayList<>();
//        shoeCollection.add(shoe1);
//        shoeCollection.add(shoe2);
//        shoeCollection.add(shoe3);
//
//        shoeCollection = choice.Shoetype(scan,shoeCollection);





        Closet summer = new Closet(jacket1,shirt1,pants1,shoe1);
        Closet winter = new Closet(jacket2,shirt2,pants2,shoe2);
        Closet fall = new Closet(jacket3,shirt3,pants3,shoe3);

        while (true) {
            pick=false;
            while (!pick) {
                System.out.println("\nWhich Closet would you like to look at? Winter Fall or Summer?");
                input = scan.nextLine().toLowerCase();


                switch (input) {

                    case "summer":

//                    System.out.println("You need a second pair of shoes");
//                    randShoe = random.nextInt(2);
//                    if(randShoe== 1){
//                        summer.setShoeList(shoe2);
//                    }
//                    else{
//                        summer.setShoeList(shoe3);
//                    }

                        System.out.println(summer.toString());
                        break;

                    case "winter":
                        System.out.println(winter.toString());
                        break;

                    case "fall":
                        System.out.println(fall.toString());
                        break;

                    default:
                        System.out.println("That is not an option");
                        pick = false;
                        break;
                }
                System.out.println("\nDo you want to look at a different closet? (Y/N) ");
                input = scan.nextLine().toLowerCase();
                if (input.equals("n")) {
                    pick = false;
                    break;
                }
            }

           // Closet trip = new Closet(jacket1, shirt1, pants1, shoe1);
            Closet trip = new Closet();
            pickS=false;
            pickJ=false;
            pickP=false;
            pickSh=false;
            trip.clearShoeList(shoe1);

            while (!pickJ) {
                System.out.println("\nWhich Jacket would you like to add?");
                input = scan.nextLine().toLowerCase();

                switch (input) {

                    case "jacket1":
                        trip.setJacket(jacket1);
                        pickJ = true;
                        break;
                    case "jacket2":
                        trip.setJacket(jacket2);
                        pickJ = true;
                        break;
                    case "jacket3":
                        trip.setJacket(jacket3);
                        pickJ = true;
                        break;
                    default:
                        System.out.println("That is not an option, Try again.");
                        break;
                }


            }

            while (!pickS) {
                System.out.println("\nWhich Shirt would you like to add?");
                input = scan.nextLine().toLowerCase();

                switch (input) {

                    case "shirt1":
                        trip.setShirt(shirt1);
                        pickS = true;
                        break;
                    case "shirt2":
                        trip.setShirt(shirt2);
                        pickS = true;
                        break;
                    case "shirt3":
                        trip.setShirt(shirt3);
                        pickS = true;
                        break;
                    default:
                        System.out.println("That is not an option, Try again.");
                        break;
                }


            }
            while (!pickP) {
                System.out.println("\nWhich Pants would you like to add?");
                input = scan.nextLine().toLowerCase();

                switch (input) {

                    case "pants1":
                        trip.setPants(pants1);
                        pickP = true;
                        break;
                    case "pants2":
                        trip.setPants(pants2);
                        pickP = true;
                        break;
                    case "pants3":
                        trip.setPants(pants3);
                        pickP = true;
                        break;
                    default:
                        System.out.println("That is not an option, Try again.");
                        break;
                }


            }
            while (!pickSh) {
                System.out.println("\nWhich Shoes would you like to add?");
                input = scan.nextLine().toLowerCase();
                switch (input) {

                    case "shoe1":
                        trip.setShoeList(shoe1);
                        System.out.println("\nYou cant just bring flip-flops, lets add an extra pair");
                        randShoe=random.nextInt(2);
                        if(randShoe==0){
                        trip.setShoeList(shoe2);}
                        else{trip.setShoeList(shoe3);}


                        pickSh = true;
                        break;
                    case "shoe2":
                        trip.setShoeList(shoe2);
                        pickSh = true;
                        break;
                    case "shoe3":
                        trip.setShoeList(shoe3);
                        pickSh = true;
                        break;
                    default:
                        System.out.println("That is not an option, Try again.");
                        break;
                }


            }
            System.out.println(trip.tripToString());
            System.out.println("Would you like to pack for another trip? (Yes/No)");
            input = scan.nextLine().toLowerCase();
            if (input.equals("no")) {
                System.out.println("\nHave a good trip.\nGoodbye.");
                break;
            }
        }
    }
}
