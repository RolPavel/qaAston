package lesson2_aqa;

class Park {
    public static class Attraction {
        private final String name;
        private final String workingHours;
        private final double cost;

        public Attraction(String name, String workingHours, double cost) {
            this.name = name;
            this.workingHours = workingHours;
            this.cost = cost;
        }

        public void printInfo() {
            System.out.println("Название аттракциона: " + name);
            System.out.println("Часы работы: " + workingHours);
            System.out.println("Стоимость: " + cost);
        }
    }
}

