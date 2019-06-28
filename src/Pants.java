public class Pants {
    private String material;
    private String size;
    private String color;
    private String style;
    private String name;


    public  Pants (){

    }


    public Pants(String material, String size, String color, String style, String name) {
        this.material = material;
        this.size = size;
        this.color = color;
        this.style = style;
        this.name = name;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
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

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString(){
        return getName() + ":\tThese Pants are " + getSize() + " and " + getColor() + ". They are " + getMaterial() + " " + getStyle() +".";
    }
}
