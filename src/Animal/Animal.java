package Animal;

public class Animal {

    String name;
    static int totalCount;

    public Animal(String name) {
        this.name = name;
        totalCount = totalCount + 1;
    }

    public void run(int run) {
        System.out.println(name + " пробежал " + run + " м.");
    }

    public void swim(int swim) {
        System.out.println(name + " проплыл " + swim + " м.");
    }

    public static void totalCount() {
        System.out.println("Всего животных: " + totalCount + "шт.");
    }
}
