public class Jacket {
    private String matereal;
    private String size;
    private String color;
    private String name;

    public Jacket (){

    }

    public Jacket (String matereal,String size, String color, String name){
        this.matereal =matereal;
        this.size = size;
        this.color =color;
        this.name = name;
    }

    public String getMatereal() {
        return matereal;
    }

    public void setMatereal(String matereal) {
        this.matereal = matereal;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString(){
        return getName() + ":\tThis Jacket is " + getSize() + " and " + getColor() + ". it is made of " + getMatereal() + ".";
    }
}
