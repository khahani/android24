package model;

public class Teacher extends Person
    implements Jandar, Drivable{

    public int age;

    @Override
    public void walking() {
        System.out.println("Teacher dare rahmire..");
    }

    @Override
    public void eating() {
        System.out.println(name + " eating");
    }

    @Override
    public void stop() {

    }

    @Override
    public void start() {

    }

    @Override
    public void gaz() {

    }
}
