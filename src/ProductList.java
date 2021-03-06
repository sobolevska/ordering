import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ProductList {
    private Product[] products;
    private static String fileName = "products.csv";

    public ProductList() {
        try {
            parseFile();
        } catch (FileNotFoundException e) {
            System.out.println("Could not read product file!");
        }
    }

    public void printProducts() {
        for (Product prod : products) {
            System.out.println(prod);
        }
    }

    private void parseFile() throws FileNotFoundException {
        products = new Product[6];
        File f = new File(fileName);
        Scanner fileScan = new Scanner(f);

        fileScan.nextLine(); // skips header

        int index = 0;
        while (fileScan.hasNext()) {
            String row = fileScan.nextLine();
            String[] cols = row.split(";");

            if (cols[3].equals("f")) {
                Food food = new Food();
                parseLine(cols, food);
                food.mass = Double.parseDouble(cols[4]);
                products[index] = food;
            } else if (cols[3].equals("d")) {
                Drink drink = new Drink();
                parseLine(cols, drink);
                drink.volume = Double.parseDouble(cols[5]);
                products[index] = drink;
            } else if (cols[3].equals("u")) {
                Utensil utensil = new Utensil();
                parseLine(cols, utensil);
                utensil.count = Integer.parseInt(cols[6]);
                products[index] = utensil;
            }

            index++;
        }
    }

    private void parseLine(String[] cols, Product target) {
        target.name = cols[0];
        target.price = Double.parseDouble(cols[1]);
        target.description = cols[2];
    }
}
