import java.util.ArrayList;

public class Closet {
     private Jacket jacket;
     private Shirt shirt;
     private Pants pants;
     private ArrayList<Shoes> shoeList = new ArrayList<>();

    public Closet() {
//        shoeList = new ArrayList<>();
    }

    public Closet(Jacket jacket, Shirt shirt, Pants pants, Shoes shoes) {
        this.jacket = jacket;
        this.shirt = shirt;
        this.pants = pants;
        shoeList = new ArrayList<>();
        setShoeList(shoes);
    }


    public Jacket getJacket() {
        return jacket;
    }

    public void setJacket(Jacket jacket) {
        this.jacket = jacket;
    }

    public Shirt getShirt() {
        return shirt;
    }

    public void setShirt(Shirt shirt) {
        this.shirt = shirt;
    }

    public Pants getPants() {
        return pants;
    }

    public void setPants(Pants pants) {
        this.pants = pants;
    }

    public ArrayList<Shoes> getShoeList() {
        return shoeList;
    }

    public void setShoeList(Shoes shoes) {
        if(shoeList.size()>=2){
            shoeList.clear();
        }
        this.shoeList.add(shoes);
    }

    @Override
    public String toString(){
        String str = "";
        for (Shoes s : shoeList){
            str += s.toString();
        }

        return "\nThis closet Contains: \n" + jacket.toString() + "\n" + shirt.toString() + "\n" + pants.toString() + "\n"
                + str;
    }

    public String tripToString(){
        String str = "";
        for (Shoes s : shoeList){
            str += s.toString();
        }

        return "\nFor your trip you are bringing \n" + jacket.toString() + "\n" + shirt.toString() + "\n" + pants.toString() + "\n"
                + str;
    }

}


