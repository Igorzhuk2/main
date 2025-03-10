public class Cat extends Animal {
    private static final int MAX_RUN_DISTANCE = 200;
    private final String name;
    private boolean isFull;


    public Cat(String name) {
        super();
        this.name = name;
        this.isFull = false;
        incrementCatCount();
    }

    public String getName() {
        return name;
    }

    public boolean isFull() {
        return isFull;
    }

    public void setFull(boolean full) {
        isFull = full;
    }

    @Override
    public void run(int runDistance) {
        if (runDistance <= MAX_RUN_DISTANCE) {
            System.out.println(name + " пробежал " + runDistance + " м.");
        } else {
            System.out.println(name + " не может пробежать " + runDistance + " м. Максимум: " + MAX_RUN_DISTANCE + " м.");
        }
    }

    @Override
    public void swim(int distance) {
        System.out.println(name + " не умеет плавать.");
    }
}