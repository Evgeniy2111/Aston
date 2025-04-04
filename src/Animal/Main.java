package Animal;

public class Main {
    public static void main(String[] args) {
        Animal barsik = new Animal("Барсик");
        barsik.run(5);
        barsik.swim(21);

        Dog bobik = new Dog("Бобик");
        bobik.run(550);
        bobik.swim(25);

        Cat murzik = new Cat("Мурзик", 10, false);
        murzik.run(100);
        murzik.swim(200);

        Animal.totalCount();


        Cat[] cats = new Cat[4];
        cats[0] = new Cat("Барсик", 5, false);
        cats[1] = new Cat("Мурзик", 6, false);
        cats[2] = new Cat("Филя", 7, false);
        cats[3] = new Cat("Тимоша", 8, false);

        Bowl bowl = new Bowl(10);
        bowl.infoBowl();
        for (int i = 0; i < cats.length; i++) {
            if (cats[i].hunger == false && cats[i].appetite < bowl.food) {
                cats[i].eat(bowl);
                System.out.println(cats[i].name + " - покушал");
            } else {
                System.out.println(cats[i].name + " - не покушал");
            }
        }
        bowl.infoBowl();
        bowl.addFood(10);
        bowl.infoBowl();
    }
}