public class Tehran {
    public static void main(String[] args) {

        int a = 10;
        int b = 10;

        if (a > 10){
            System.out.printf("> 10");
        }

        if (a == 10){
            System.out.println("= 10");
        }

        if (a == b){
            System.out.println("a = b");
        }

        if (a < 0){
            System.out.println("< 0");
        }else if (a == 10){
            System.out.println("= 10");
        }else if (a > 10){
            System.out.println(">10");
        }else if (a == b){
            System.out.println("a = b");
        }else {
            System.out.println("nemidonam chi kar konam");
        }
    }
}
