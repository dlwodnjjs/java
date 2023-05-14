package lecture20230507;

public class AnimalTest {
    public static void main(String[] args){
        Animal ani = new Animal();
        //ani.name = "Teddy";
        ani.setName("Teddy");
        ani.setWeight(20);

        Dog d = new Dog();
        d.setName("CoCo");
        d.setWeight(5);
        d.setAge(3);

        Cat c = new Cat();
        c.setName("Nabi");
        c.setWeight(4);
        c.setLines("stripe");

        Bird b = new Bird();
        b.setName("fried");
        b.setWeight(3);
        b.setWings(2);

        System.out.println(ani.getName());
        System.out.println(ani.getWeight());
        System.out.println(ani.toString());

        System.out.println(d.getName());
        System.out.println(d.getWeight());
        System.out.println(d.toString());
        System.out.println(d.getAge());

        System.out.println(c.getName());
        System.out.println(c.getWeight());
        System.out.println(c.toString());
        System.out.println(c.getLines());

        System.out.println(b.getName());
        System.out.println(b.getWeight());
        System.out.println(b.toString());
        System.out.println(b.getWings());
    }
}
