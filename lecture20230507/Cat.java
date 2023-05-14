package lecture20230507;

public class Cat extends Animal{
 private String lines;

    public String getLines() {
        return lines;
    }

    public void setLines(String lines) {
        this.lines = lines;
    }

    @Override
 public String toString(){
     return String.format("meowmeow");
 }
}
