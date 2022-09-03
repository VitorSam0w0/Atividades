package aula0109;

public class aula0109 {
    
    public static void main(String[] args) {

        System.out.println("Sistema Logico");

        int a = 10;
        int b = 20;
        int c = 30;
        int d = 40;
        int e = 50;

        if (a>b&&b<a) {
            System.out.println("a");

        } else if(a>b&&c<b) {
            System.out.println("b");

        }else if(c>b&&a>e) {
            System.out.println("c");

        } else {
            System.out.println("d");
        }
    }


}
