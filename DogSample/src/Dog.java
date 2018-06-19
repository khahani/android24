public class Dog {
    //properties
    /*
        - eyeColor
        - weight
        - age
        - name
        - favorite food
     */
    public String eyeColor;
    public int weight;
    public int age;
    public String name;
    public String favoritFood;
    // method
    /*
        - walking
        - eating
     */
    public void walking(){
        System.out.println(name + " walking");
        System.out.println(name + " jumping");
        System.out.println(name + " jumping");
        System.out.println(name + " jumping");
        System.out.println(name + " walking");
    }

    public void eating(){
        System.out.println(name + " eating " + favoritFood);
    }

}
