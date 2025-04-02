public class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    public void run(int run) {
        if (run > 500) {
            System.out.println("Показатель привышен. Проверьте данные.");
        }
    }

    public void swim(int swim) {
        if (swim > 10) {
            System.out.println("Показатель привышен. Проверьте данные.");
        }
    }
}
