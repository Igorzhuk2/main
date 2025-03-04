import java.lang.reflect.Array;
import java.time.LocalDate;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Product[] productsArray = new Product[5];
        productsArray[0] = new Product("Ноутбук", LocalDate.of(2023, 5, 15), "Apple", "США", 1500, true);
        productsArray[1] = new Product("Смартфон", LocalDate.of(2023, 8, 20), "Samsung", "Южная Корея", 800, true);
        productsArray[2] = new Product("Планшет", LocalDate.of(2023, 10, 1), "Lenovo", "Китай", 500,true);
        productsArray[3] = new Product("Наушники", LocalDate.of(2023, 3, 10), "Sony", "Япония", 200, false);
        productsArray[4] = new Product("Монитор", LocalDate.of(2023, 7, 25), "LG", "Южная Корея", 352,true);
        for (Product product : productsArray) {
            product.printInfo();
        }
    }
    }