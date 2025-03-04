import java.time.LocalDate;

public class Product {
    String name;
    LocalDate date;
    String manufacturer;
    String countryOfOrigin;
    int price;
    Boolean isReserved;
    public Product(String name, LocalDate date, String manufacturer, String countryOfOrigin, int price, Boolean isReserved) {
        this.name = name;
        this.date = date;
        this.manufacturer = manufacturer;
        this.countryOfOrigin = countryOfOrigin;
        this.price = price;
        this.isReserved = false;
    }
    public void printInfo() {
        System.out.println("Информация о товаре:");
        System.out.println("Название: " + name);
        System.out.println("Дата производства: " + date);
        System.out.println("Производитель: " + manufacturer);
        System.out.println("Страна происхождения: " + countryOfOrigin);
        System.out.println("Цена: " + price);
        System.out.println("Состояние бронирования: " + (isReserved ? "Забронирован" : "Не забронирован"));
        System.out.println();

    }

}
