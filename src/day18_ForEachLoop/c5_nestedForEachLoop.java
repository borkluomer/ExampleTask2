package day18_ForEachLoop;

public class c5_nestedForEachLoop {
    public static void main(String[] args) {


        int [] arr = {10,5,10};

        for (int each : arr){
            System.out.println(each); //this will print each one of them
        }


        int [][] arr2D = {{1,2,3},{4,5},{6,7,8,9,10,11,12}};
        //containers 0,1,2
        //

        for (int [] each1D : arr2D) { //this will store each child container

            for (int eachData : each1D){ // this one will store each number from each container
                //container 0[]first   [] 0  1 2
                //container 1[]second  [] 0  1
                //container 2[]third   [] 0 1 2 3 4 5 6
                System.out.print(eachData+ " ");
            }

        }


    }
}
