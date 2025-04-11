package Animal;

public class Main {
    public static void main(String[] args) {
        Animal barbos = new Dog("Барбос");
        barbos.run(5);
        barbos.swim(8);
        System.out.println();

        Dog bobik = new Dog("Бобик");
        bobik.run(550);
        bobik.swim(25);
        System.out.println();

        Cat murzik = new Cat("Мурзик", 10, false);
        murzik.run(100);
        murzik.swim(200);
        System.out.println();

        Animal.totalCount();
        System.out.println();
        Cat.totalCount();
        System.out.println();
        Dog.totalCount();
        System.out.println();

        Cat[] cats = new Cat[4];
        cats[0] = new Cat("Барсик", 5, false);
        cats[1] = new Cat("Мурзик", 6, false);
        cats[2] = new Cat("Филя", 7, false);
        cats[3] = new Cat("Тимоша", 8, false);

        Bowl bowl = new Bowl(25);
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