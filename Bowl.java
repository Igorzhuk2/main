public class Bowl {
    private int foodAmount;

    public Bowl(int foodAmount) {
        this.foodAmount = foodAmount;
    }

    public void addFood(int amount) {
        if (amount > 0) {
            foodAmount += amount;
            System.out.println("В миску добавлено " + amount + " еды. Теперь в миске " + foodAmount + " еды.");
        } else {
            System.out.println("Нельзя добавить отрицательное количество еды.");
        }
    }

    public void feedCat(Cat cat, int amount) {
        if (amount <= 0) {
            System.out.println("Количество еды должно быть положительным.");
            return;
        }
        if (foodAmount >= amount) {
            foodAmount -= amount;
            cat.setFull(true);  // Кот сыт
            System.out.println(cat.getName() + " покушал " + amount + " еды. В миске осталось " + foodAmount + " еды.");
        } else {
            System.out.println("В миске недостаточно еды для " + cat.getName() + ". Нужно " + amount + ", а в миске " + foodAmount + ".");
        }
    }

    // Геттер для количества еды
    public int getFoodAmount() {
        return foodAmount;
    }
}