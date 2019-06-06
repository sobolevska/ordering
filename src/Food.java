public class Food extends Product {
    public double mass;

//food
//zhraaatj
    @Override
    public String toString() {
        String output = "";
        output += name + ":" + "\n";
        output += "  " + mass + "kg for " + price + " eur" + "\n";
        output += "  " + description;
        return output;
    }

//pievienoju komentaru no command linux
}
