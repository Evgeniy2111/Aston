public class Main {
    public static void main(String[] args) {
        Animal barsik = new Animal("Барсик");
        barsik.run(5);
        barsik.swim(21);

        Dog bobik = new Dog("Бобик");
        bobik.run(550);
        bobik.swim(25);

        Cat murzik = new Cat("Мурзик",10, false);
        murzik.run(100);
        murzik.swim(200);

        Animal.totalCount();
    }
}