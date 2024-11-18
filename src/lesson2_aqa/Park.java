package lesson2_aqa;

import java.util.ArrayList;
import java.util.List;

class Park {
    private final List<Attraction> attractions;

    public Park() {
        this.attractions = new ArrayList<>();
    }

    public void addAttraction(Attraction attraction) {
        attractions.add(attraction);
    }

    public void printAllAttractions() {
        for (Attraction attraction : attractions) {
            attraction.printInfo();
            System.out.println();
        }
    }

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
