package day20_ReturnMethods;

public class c1_UniqueLetterFromArray {

    public static void main(String[] args) {

        //write a program that can print out the unique values from a String Array
        //ex:
        //        of arr-> {"A" , "A" , "B" , "C" , "C"}
        //        output B
        //        if arr-> {"A" ,"B" ,"B", "C"}
        //        output: A
        //                C


        //if the variable is in the list for only one time that means its a unique value
        //i should only print strings that has count ==1
        //to check letter count you will need to compare with all letters and when
        // ....it equals you increase a count
        //create for loop to find the unique value
        //the one that has count ==1 are unique
        //count 0,2,3,4,5,6.... wont be unique

        String [] letters = {"A" , "A" , "B" , "C" , "C" , "D", "D", "E"};

        for (String eachLetter : letters){ //A //A //B
            int count=0; //to reset count for each letter we have count inside our loop
            for (String eachLetter2: letters){ // {"A" , "A" , "B" , "C" , "C" , "D", "D"};
                if (eachLetter2.equals(eachLetter)){
                    count++;//1 2
                }
            }
            if (count==1){ //1==1
                System.out.println(eachLetter + " is unique"); //B //E
            }
        }

        System.out.println("---------------------");
        String [] arr={"A", "C","B", "C"};
        uniqueFromArray(arr);
    }



    public static void uniqueFromArray(String [] exampleLetters){
        String [] letters = {"A" , "A" , "B" , "C" , "C" , "D", "D", "E"};

        for (String eachLetter : exampleLetters){ //A //A //B
            int count=0; //to reset count for each letter we have count inside our loop
            for (String eachLetter2: exampleLetters){ // {"A" , "A" , "B" , "C" , "C" , "D", "D"};
                if (eachLetter2.equals(eachLetter)){
                    count++;//1 2
                }
            }
            if (count==1){ //1==1
                System.out.println(eachLetter + " is unique"); //B //E
            }
        }

    }

    }

