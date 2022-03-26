package StudyHallSessions.Week3;

public class Session2 {

    public static void main(String[] args) {
        // verification for amazon.com title.
        String expectedTitle = "amazon.com";
        String actualTitle = "Amazon.com. Spend less. Smile more. ";

        if(expectedTitle==actualTitle){
            System.out.println("Test case passes. YAY");
        }

        else{
            System.out.println("Test case failed");
            System.out.println("Hey Houston , we have a Problem");

        }
        System.out.println("******************************");
        // lottery GAME
        int userBirthYear = 1997;
        int userAge = 2022-userBirthYear;

        int myLuckyNumber = 36;
        int userLuckyNumber = 36;

        //users age
        if (userAge>=18){ // user is 18 or older
            if(myLuckyNumber==userLuckyNumber){
                System.out.println("Congratulations you will win 1 million $$");

            }else{ // user is 18 or older
                System.out.println("Please try again");
            }

        }else { // user is younger than 18;
            System.out.println("you can not play this game because of your age");

        }

        // question 3
        // Discount and Revenue
        // Revenue can be calculated
        // revenue = price * quantity.
        // if the revenue is more than 5000 a discount 10 percent offered program should display
        //create data first
        double discount = 0;
        double revenue = 0;

        double price = 50.99;
        double quantity = 100;

        revenue = price * quantity; //created a variable
        if(revenue>5000){

            discount = 5000 * .10; // in math if you trying to find percentage you do .rakam

            revenue = revenue-discount; //used the formula
            //net revenue

            System.out.println("revenue = " +revenue);

            System.out.println("discount = " +revenue);



        }






    }
}
