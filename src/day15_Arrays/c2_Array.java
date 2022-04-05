package day15_Arrays;

public class c2_Array {
    public static void main(String[] args) {

        //declaration of ARRAY
        //DataType [] name = {...........}

        int [] numbersList = {10,20,30,40};
                            // 0, 1, 2, 3

        String [] names = {"Java","Python","C#", "OMER" , "BARIS" , "TAYLAN", "SERAP"};
                         //   0      1       2    index number of container
        //print Python
        System.out.println("names[1]" + names[1]);

        //print 30
        System.out.println("numberList[2] = " +numbersList[2]);

        //print all the names
        //then we can use the loops
        //starting point will be index 0
        //ending point last index= will be length-1

        for ( int i = 0 ;  i <=6;  i++ ){
            System.out.println(names[i]);
        }

        int [] numbers ={1,5,19,20,35,5,0,100,200,400}; //19 >  5 TRUE

        //numbers [4] == means to you? IT MEANS INDEX NUMBER 4 FROM NUMBERS!!!!!!!!!
        if (numbers[2]>numbers[5]){
            //index number is bigger then index number 5 this is what this equation means
            System.out.println("2nd index from numbers list is bigger then index number 5");
        }else{
            System.out.println("2nd index from numbers list is smaller then index number 5");
        }

        String engineer = new String(); // this will only store a one engineer
        String [] engineers = new String[5]; // size for this container define as a 5 // index number==01234
        //array size is fixed!!!!!! you need to specify the length when you create array
        //size has to be passed []
        //for engineers arrays= you have size == 5 (numbers will be assigned as soon as you create the array)
        //since we didnt define index numbers all the index will be null

        System.out.println("Engineers[2] " +engineers[2]);  //null
        engineers[2] = "SDET2";
        System.out.printf("engineers[2]", engineers[2]);//it wont be null anymore because we reassign to SDET2

        engineers[4] = "DEV1";
        System.out.printf("engineers[5]"+ engineers[4]);

        //length of array
        int  length = engineers.length;
        System.out.println("length =" +length);

        //print all the engineers

        for (int i=0; i<=engineers.length-1 ; i++){
            System.out.println(engineers[i]);
        }

        //can i create a boolean container ?
        //boolean [] listOfBooleans = {true,false,true,false,true};
        boolean [] listOfBooleans2 = new boolean[3];
        //if you dont assign anything to the booleans JAVA will take false as a default
        System.out.println(listOfBooleans2[0]); //default value is false
        listOfBooleans2 [0] = true;
        listOfBooleans2 [1] = true;
        listOfBooleans2[2] = false;
        System.out.println(listOfBooleans2[0]);
        System.out.println(listOfBooleans2[1]);
        System.out.println(listOfBooleans2[2]);

        System.out.println("---------------------------------");

        boolean [] list1 = {true,false,true,true,true,false,true,true};

        //create a java program that will check boolean values
                   // if value is true print passed
                   // if value is false print failed

        for (int i = 0 ; i < list1.length-1 ; i++ ){

            if (list1[i]){
                System.out.println("PASSED"); //0 2 3 4 5
            }else{
                System.out.println("FAILED"); // 1
            }


        }






    }
}
