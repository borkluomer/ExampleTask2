package JAVAEXERCISE;

public class java112 {
    public static void main(String[] args) {

        //Task 2; if else
        // John and Mike both play basketball in different teams.
        // In the latest 3 games, John's team scored 89,
        // 120 and 103 points, while Mike's team scored 116, 94, and 123 points.

        int johnTeam = (89+120+103)/3;
        int mikesTeam = (116+94+123)/3;

        System.out.println("Johns Team score is : " +johnTeam);
        System.out.println("Mikes Team score is : " +mikesTeam);

        if (johnTeam>mikesTeam){
            System.out.println("Congratulations " +johnTeam);
        }
        else if (johnTeam<mikesTeam){
            System.out.println("Congratulations " +mikesTeam);
        }
        else{
            System.out.println("Tie Game good job for both teams");
        }
    }
}
