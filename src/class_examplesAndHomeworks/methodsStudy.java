package class_examplesAndHomeworks;

public class methodsStudy {
    public static void main(String[] args) {
        sayiBulmaca();
        sayiBulmaca();
        sayiBulmaca();//you can do this much as you want from another class
        sayiBulmaca();

    }
    //always use camelcasing no matter what in coding
    public static void sayiBulmaca(){
        int [] sayilar = new int[]{1,2,5,7,9,0};
        int aranacak =6;
        boolean varMi=false;

        for (int sayi: sayilar){
            if (sayi==aranacak){
                varMi=true;
                break;
            }
        }
        String mesaj = "";
        if (varMi){
            mesajVer("Sayi mevcuttur : " +aranacak);
            mesajVer(mesaj);
        }else{
            System.out.println("Sayi mevcut degildir : " +aranacak);
        }
    }


    public static void mesajVer(String mesaj){
        System.out.println(mesaj);
    }
}
