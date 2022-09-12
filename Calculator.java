import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("Lütfen ilk sayıyı giriniz : ");
        int a = num.nextInt();
        System.out.println("Lütfen ikinci sayıyı giriniz :");
        int b = num.nextInt();
        System.out.println("Lütfen yapmak istediğiniz işlemin numarasını girin :");
        System.out.println("1: Toplama\n2: Çıkarma\n3: Çarpma\n4: Bölme");
        int c = num.nextInt();
        switch (c){
            case 1 :
                System.out.println("Sonuç : "+(a+b));
                break;
            case 2 :
                System.out.println("Sonuç : "+(a-b));
                break;
            case 3 :
                System.out.println("Sonuç : "+(a*b));
                break;
            case 4 :
                System.out.println("Sonuç : "+(a/b));
                break;
            default :
                System.out.println("Hatalı işlem girişi");
        }
    }
}
