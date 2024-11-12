package lesson_3_aqa.task_1;

class FoodBowl {
    private int foodAmount;

    public FoodBowl(int foodAmount) {
        this.foodAmount = foodAmount;
    }

    public boolean decreaseFood(int amount) {
        if (foodAmount >= amount) {
            foodAmount -= amount;
            return true;
        }
        return false;
    }

    public void addFood(int amount) {
        this.foodAmount += amount;
        System.out.println("В миску добавлено " + amount + " единиц еды.");

    }

    public int getFoodAmount() {
        return foodAmount;
    }
}
