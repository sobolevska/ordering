public class Drink extends Product {
    public double volume;

    @Override
    public String toString() {
        String output = "";
        output += name + ":" + "\n";
        output += "  " + volume + "l for " + price + " eur" + "\n";
        output += "  " + description;
        return output;
    }
}
