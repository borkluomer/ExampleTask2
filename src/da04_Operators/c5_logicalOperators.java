package da04_Operators;

public class c5_logicalOperators {

    // && -- and
    // || -- or                    BASICALLY && AND || is OPPOSITE
    // ! -- not

    public static void main(String[] args) {
        System.out.println( (4>2)  &&  (2>4)); // true && true then result is FALSE
        System.out.println((10<=5) &&  (0==0)); // false && true then result is FALSE
        System.out.println((1>=2) && (2!=2));  // false && false then result is FALSE
        System.out.println((10>=10) && (10<=10)); // true && true then result is TRUE

        // if you are using and operator && only option that you will get true results all condition are true

        System.out.println("************************");

        //|| operator || sign means or
        System.out.println( (4>2)  ||  (2>4)); // true || true then result is //TRUE
        System.out.println((10<=5) ||  (0==0)); // false || true then result is  //TRUE
        System.out.println((1>=2) || (2!=2));  // false || false then result is //FALSE
        System.out.println((10>=10) || (10<=10)); // true || true then result is  //TRUE


        //false || false || false || true == you have option to choose TRUE

        //! -- not
        System.out.println("************************");

        boolean bool1 = true;

        boolean bool2 = !(10!=15); // !(true) == false

        System.out.println(bool1 && bool2); // true && false == false

        boolean b3 = !!!!!!!bool1; // 6times ! (true)
        // !!!!! you have it 5 times (false)
        //!!!! you have 4 times not (true) again so even numbers wont chage the results
        boolean b4 = !(15>=15); // !(true) but you have opposite sign in the begining which is false ==false

        System.out.println((b3||b4) && true);
                        // (true || false) && true
                       // true       &&  true== true

        System.out.println(("maryam" == "abe") || ("murat"== "Murat"));
                          // false || false == false
        //java is case sensitive to be able to have true it has to exact math.

        System.out.println("1@HELLO"=="1@HELLO");




    }
}
