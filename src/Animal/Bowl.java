package Animal;

public class Bowl {

    int food;

    public Bowl(int food) {
        this.food = food;
    }

    public void takeFood(int appetite) {
        if (food >= appetite) {
            food -= appetite;
        } else {
            System.out.println("В миске мало еды или она закончилась.");
        }
    }

    public void addFood(int eat) {
        if (eat <= 0) {
            System.out.println("НЕ корректно введено количество. проверьте данные.");
        } else {
            food += eat;
            System.out.println("Было добавлено " + eat + " единиц еды");
        }
    }

    public void infoBowl() {
        System.out.println("Еды осталось в миске: " + food);
    }
}

