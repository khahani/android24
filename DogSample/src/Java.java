public class Java {
    public static void main(String[] args) {


        Dog popy = new Dog();
        popy.name = "popy";
        popy.age = 2;
        popy.weight = 12;
        popy.eyeColor = "blue";
        popy.favoritFood = "milk";


        System.out.println(popy.name);
        System.out.println(popy.age);

        popy.walking();
        popy.eating();


        Dog rex = new Dog();
        rex.name = "Rex";
        rex.age = 5;
        rex.eyeColor = "black";
        rex.weight = 35;
        rex.favoritFood = "Beef";

        System.out.println(rex.name);
        System.out.println(rex.eyeColor);

        rex.walking();

        rex.eating();











      /*  // Dog 1
        String name = "popy";
        int age = 2;
        int weight = 12;
        String eyeColor = "blue";

        System.out.println(name);
        System.out.println(age);

        System.out.println(name + " walking");
        System.out.println(name + " jumping");
        System.out.println(name + " jumping");
        System.out.println(name + " walking");

        // Dog 2
        String name2 = "rex";
        int age2 = 5;
        int weight2 = 35;
        String eyeColor2 = "black";

        System.out.println(name2);
        System.out.println(age2);

        System.out.println(name2 + " walking");
        System.out.println(name2 + " jumping");
        System.out.println(name2 + " jumping");
        System.out.println(name2 + " walking");

*/
    }
}
