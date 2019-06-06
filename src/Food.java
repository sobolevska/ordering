public class Food extends Product {
    public double mass;
//nnooooooooo
    @Override
    public String toString() {
        String output = "";
        output += name + ":" + "\n";
        output += "  " + mass + "kg for " + price + " eur" + "\n";
        output += "  " + description;
        return output;
    }
}
