package day19_methods;

import MyUtils.GenerateUtils;

public class c4_LibraryTest {
    public static void main(String[] args) {

        GenerateUtils.hello();
        GenerateUtils.reverseString("java");
        GenerateUtils.reverseString("kayak");

        String word ="Hello java is Fun";
        GenerateUtils.reverseString(word);
    }
}
