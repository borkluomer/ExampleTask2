package MyProjects;

public class arrayExampleCities {
    public static void main(String[] args) {

        //matrix style
        //multy dimensions

        String [] [] cities = new String[3][3];

        cities[0][0] = "San Francisco";
        cities[0][1] = "Oakland";
        cities[0][2] = "San Diego";

        cities[1][0] = "Houston";
        cities[1][1] = "Dallas";
        cities[1][2] = "San Antonio";

        cities[2][0] = "Orlando";
        cities[2][1] = "Jax";
        cities[2][2] = "Miami";

        //nested loop

        for ( int i = 0 ; i <=2 ; i++ ){
            System.out.println("---------------------");
            for (int j = 0 ; j<=2 ; j++){
                System.out.println(cities[i][j]);
            }
        }


















    }
}
