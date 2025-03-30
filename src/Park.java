public class Park {

    public static class Attraction {
        private String nameAttraction;
        private String workTime;
        private double price;

        public Attraction(String nameAttraction, String workTime, double price) {
            this.nameAttraction = nameAttraction;
            this.workTime = workTime;
            this.price = price;
        }

        public String getNameAttraction() {return nameAttraction;}

        public void setNameAttraction(String nameAttraction) {
            this.nameAttraction = nameAttraction;
        }

        public String getWorkTime() {return workTime;}

        public void setWorkTime(String workTime) {
            this.workTime = workTime;
        }

        public double getPrice() {return price;}

        public void setPrice(double price) {
            this.price = price;
        }

        public void toInfo() {
            System.out.println("Наименование атракциона : " + "'" + nameAttraction + "'" +
                    "\nВремя работы : " + workTime + "\nСтоимость одного сеанса : " + price + "y.e." );
        }
    }
}
