package MyProjects;

import java.util.Arrays;

public class ArrayHomework1 {
    public static void main(String[] args) {


        //Find sum of the int array with using for loop
        // int[] a1 = new int[]{45, 12, 78, 34, 89, 21};

        int[] a1 = new int[]{45, 12, 78, 34, 89, 21};
        // index             0    1   2   3   4   5      length-1
        System.out.println(Arrays.toString(a1));
        Arrays.sort(a1);
        int sum = 0;

        for (int i = 0; i <a1.length ; i++) {
            sum+=a1[i];

        }
        System.out.println(sum);

        System.out.println("-----------------------------------------");

        //2nd way of doing this question
        //Find sum of the int array with using WHILE loop

        int[] a2 = new int[]{45, 12, 78, 34, 89, 21};

        int sum2 = 0;
        int sPoint =0;
        int ePoint = a2.length-1;

        while ( sPoint <= ePoint ){
            sum2=sum2+a1[sPoint];
            sPoint++;

        }
        System.out.println("sum is = " + sum2);


        System.out.println("---------------------------------------------");


        String [][] menu ={{"Chicken Alfredo","Shrimp Pasta","Lasagna"}, // index 0
                {"House Salad","Caesar Salad","Fruit Salad"}, //index 1
                {"Wine","Soda","Amaretto"}, //index 2
                {"Tiramisu","Panna Cotta Tart","Baklava"}}; //index 3

       // food
        for (int i = 0; i <menu[0].length ; i++) {
            System.out.println(menu[0][i]);
        }
        //salads
        for (int i = 0; i <menu[1].length ; i++) {
            System.out.println(menu[1][i]);
        }
        //drinks
        for (int i = 0; i <menu[2].length ; i++) {
            System.out.println(menu[2][i]);
        }
        //sweets
        for (int i = 0; i <menu[3].length ; i++) {
            System.out.println(menu[3][i]);
        }










        System.out.println("-----------------------------");
        //Move Zero to end of the Array
        //int [] list1={4,5,6,0,-10,0,40};
        //Expected: {4,5,6,-10,40,0,0}

        int [] list1={4,5,6,0,-10,0,40};
        //      index 0 1 2 3 4   5  6    length-1

        list1 [6] = 0;
        list1 [5] = 0;
        list1 [4] = 40;
        list1 [3] =-10;
        System.out.println(Arrays.toString(list1));
        System.out.println("------------------------------------");

        //second way of doing with for loop

            int temp =0;
            int [] ArrayToStoreAnswer = new int [list1.length];
        System.out.println(Arrays.toString(ArrayToStoreAnswer));

        for (int j = 0; j < list1.length ; j++) { //j=0 , j=1 , j=2 , j=3, j=4 , j=5

            if (list1[j] !=0 ){//list1[0]=4 , list1[1]=5 ,  list1[2]=6 ,  list1[3]=0 ,  list1[4]=-10
                               //list1[5]=0 , list1[6]=40 thats it loop is finished
                ArrayToStoreAnswer[temp]=list1[j];
                //ArrayToStoreAnswer [0] =4
                //ArrayToStoreAnswer [1] =5
                //ArrayToStoreAnswer [2] =6
                //ArrayToStoreAnswer [3] =-10
                //ArrayToStoreAnswer [4] =40
                //ending point finished

                temp++;
            }
        }
        System.out.println(Arrays.toString(ArrayToStoreAnswer));



    }
}
