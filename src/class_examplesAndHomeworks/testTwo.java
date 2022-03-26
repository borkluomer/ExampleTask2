package class_examplesAndHomeworks;

public class testTwo {
    public static void main(String[] args) {


        int johnsTeam = (89+120+103)/3;
        int mikesTeam = (116+94+123)/3;

        System.out.println("JohnsTeams  score is: " + johnsTeam);
        System.out.println("mikesteam  scare is: " + mikesTeam);

        if(johnsTeam>mikesTeam){
            System.out.println("Congratulations The winner is Johns Team:" + johnsTeam);

        }
        else if (johnsTeam<mikesTeam){
            System.out.println("Congratulations The winner is mikes Team:" + mikesTeam);
        }
        else {
            System.out.println("Good job to both teams");
        }


        }
}
