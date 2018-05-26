package holmes.holmesy.starbuzz;

public class Drink {

    private String name;
    private String desc;


    public static final Drink[] drinks =  {
            new Drink("latte","creamy"),
            new Drink("Coffee", "decaf"),
            new Drink("Tea", "English proper")
    };




    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }

    public Drink(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }
public String toString(){
        return this.name;
}

}
