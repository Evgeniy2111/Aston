public class Bowl extends Cat {

    int food;

    public Bowl(String name, int appetite, boolean hunger) {
        super(name, appetite, hunger);
        this.food = food;
    }

    public void takeFood() {
        if (food >= appetite) {
            food -= appetite;
            System.out.println("В миске осталось: " + food + " еды");
        } else if (food <= 0) {
            System.out.println("Миска пуста. Добавьте корм!");
        }
    }
}

