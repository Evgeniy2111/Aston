package Animal;

public class Cat extends Animal {

    int appetite;
    boolean hunger;
    static int catCount;

    public Cat(String name, int appetite, boolean hunger) {
        super(name);
        this.appetite = appetite;
        this.hunger = false;
        catCount++;

    }

    public void eat(Bowl bowl) {
        bowl.takeFood(appetite);
    }

    public void run(int run) {
        if (run > 200) {
            System.out.println("Показатель привышен. Проверьте данные.");
        } else {
            System.out.println(name + " пробежал " + run + " м.");
        }
    }

    public void swim(int swim) {
        System.out.println("Коты не умеют плавать");
    }

    public static void totalCount() {
        System.out.println("Всего котов: " + catCount + "шт.");
    }
}
