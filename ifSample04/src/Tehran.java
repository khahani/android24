public class Tehran {
    public static void main(String[] args) {

        int entekhabKarbar = 200;

        if (entekhabKarbar == 1){
            System.out.println("Dar 1");
            entekhabKarbar = 2;
            if (entekhabKarbar == 2){
                System.out.println("Dar 2");
            }else if (entekhabKarbar == 3){
                System.out.println("Dar 3");
            }
        }else if (entekhabKarbar == 99){
            System.out.println("Rahro");
        }else{
            System.out.println("!!!!");
        }

    }
}
