package Animal;

public class Dog extends Animal {
    static int dogCount;

    public Dog(String name) {
        super(name);
        dogCount++;
    }

    public void run(int run) {
        if (run > 500) {
            System.out.println("Показатель привышен. Проверьте данные.");
        } else {
            System.out.println(name + " пробежал " + run + " м.");
        }
    }

    public void swim(int swim) {
        if (swim > 10) {
            System.out.println("Показатель привышен. Проверьте данные.");
        } else {
            System.out.println(name + " проплыл " + swim + " м.");
        }
    }

    public static void totalCount() {
        System.out.println("Всего собак: " + dogCount + "шт.");
    }
}
