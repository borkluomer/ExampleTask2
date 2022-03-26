package MyProjects;

public class StringStudy {
    public static void main(String[] args) {

        String s1 = "Omer Borklu";
        String str = "";

        for (int i = (s1.length()-1) ; i>=0; i--){
            str += s1.charAt(i);


        }

        System.out.println(s1);
        System.out.println(str);



    }
}
