public class Utensil extends Product {
    public int count;

    @Override
    public String toString() {
        String output = "";
        output += name + ":" + "\n";
        output += "  " + count + " for " + price + " eur" + "\n";
        output += "  " + description;
        return output;
    }
}
