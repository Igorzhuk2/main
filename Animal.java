public class Animal {
    private static int animalCount = 0;
    private static int catCount = 0;
    private static int dogCount = 0;
    public Animal() {
        animalCount++;
    }
    public void run(int runDistance) {
        System.out.println("Животное пробежало " + runDistance + " м.");
    }
    public void swim(int swimDistance) {
        System.out.println("Животное проплыло " + swimDistance + " м.");
    }
    public static int getAnimalCount() {
        return animalCount;
    }
    public static int getCatCount() {
        return catCount;
    }
    public static int getDogCount() {
        return dogCount;
    }
    protected static void incrementCatCount() {
        catCount++;
    }
    protected static void incrementDogCount() {
        dogCount++;
    }
}