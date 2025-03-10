//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Cat[] cats = {
                new Cat("Барсик"),
                new Cat("Мурзик"),
                new Cat("Васька")
        };

        Dog dog1 = new Dog();
        Dog dog2 = new Dog();

        cats[0].run(150);
        cats[1].run(260);
        cats[2].swim(10);

        dog1.run(330);
        dog2.run(501);
        dog1.swim(10);
        dog2.swim(15);

        System.out.println("Всего животных: " + Animal.getAnimalCount());
        System.out.println("Всего котов: " + Animal.getCatCount());
        System.out.println("Всего собак: " + Animal.getDogCount());

        Bowl bowl = new Bowl(25);

        for (Cat cat : cats) {
            bowl.feedCat(cat, 10);
        }

        System.out.println("Информация о сытости котов:");
        for (Cat cat : cats) {
            System.out.println(cat.getName() + " сыт: " + cat.isFull());
        }

        bowl.addFood(25);

        for (Cat cat : cats) {
            bowl.feedCat(cat, 10);
        }
        System.out.println("Информация о сытости котов после добавления еды:");
        for (Cat cat : cats) {
            System.out.println(cat.getName() + " сыт: " + cat.isFull());
        }
        }


    }