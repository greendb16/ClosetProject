import java.util.ArrayList;

public class Shoes {
    private ArrayList<Shoes> shoeList;
    private String brand;
    private int size;
    private String color;
    private String type;
    private String name;

//Constructors
    public Shoes(String brand, int size, String color, String type, String name) {
        this.brand = brand;
        this.size = size;
        this.color = color;
        this.type = type;
        this.name = name;
    }


    public Shoes() {
    }



    //Getters and Setters


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public ArrayList<Shoes> getShoeList() {
        return shoeList;
    }

    public void setShoeList(ArrayList<Shoes> shoeList) {
        this.shoeList = shoeList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString(){
        return getName()+ ":\tThese Shoes are "  +"size " + getSize() + " and " + getColor()   + ". They are made by " + getBrand() + ".\n";
    }

}
