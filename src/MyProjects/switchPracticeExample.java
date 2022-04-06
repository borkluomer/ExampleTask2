package MyProjects;

public class switchPracticeExample {
    public static void main(String[] args) {

        //create a logic that will check the number and print the day name
        //if you have a boolean to check if block will be better option to use
        // if you are going to check equality (==) you can use switch blocker

        int number = 3;
        String dayName ;

        switch (number){
            case 1:
                dayName="monday";
                break;
            case 2:
                dayName="tuesday";
                break;
            case 3:
                dayName="wednesday";
                break;
            case 4:
                dayName="thursday";
                break;
            case 5:
                dayName="friday";
                break;
            case 6:
                dayName="saturday";
                break;
            case 7:
                dayName="sunday";
                break;
            default:
                dayName="ERROR";

        }
        System.out.println(dayName);









    }
}
