package lecture20230507;

public class Bird extends Animal{
    private int wings;

    public int getWings() {
        return wings;
    }

    public void setWings(int wings) {
        this.wings = wings;
    }
    @Override
    public String toString(){
        return String.format("GooGoo");
    }
}
