public class Park {
    public static void main(String[] args) {
        Attraction[] attractionArray = new Attraction[3];
        attractionArray[0] = new Attraction("Американские горки", "10:00 - 20:00", 5);
        attractionArray[1] = new Attraction("Колесо обозрения", "11:00 - 22:00", 3);
        attractionArray[2] = new Attraction("Автодром", "10:30 - 20:00", 4);

        for (Attraction attraction : attractionArray) {
            attraction.printInfo();
        }
    }

    public static class Attraction {
        private final String name;
        private final String workingHours;
        private final int price;

        public Attraction(String name, String workingHours, int price) {
            this.name = name;
            this.workingHours = workingHours;
            this.price = price;
        }

        public void printInfo() {
            System.out.println("Название: " + name);
            System.out.println("Время работы: " + workingHours);
            System.out.println("Стоимость: " + price + " BYN");
            System.out.println();
        }
    }
}
