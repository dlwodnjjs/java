package lecture20230507;

public class Dog extends Animal{

    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString(){
        return String.format("bow-wow! bow-wow!");
    }
}
