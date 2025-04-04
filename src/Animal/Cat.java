package Animal;

public class Cat extends Animal {

    int appetite;
    boolean hunger;

    public Cat(String name, int appetite, boolean hunger) {
        super(name);
        this.appetite = appetite;
        this.hunger = false;
    }

    public void eat(Bowl bowl) {
        bowl.takeFood(appetite);
    }


    public void run(int run) {
        if (run > 200) {
            System.out.println("Показатель привышен. Проверьте данные.");
        }
    }

    public void swim(int swim) {
        System.out.println("Коты не умеют плавать");
    }
}
