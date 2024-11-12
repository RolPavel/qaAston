package lesson_3_aqa.task_1;

class Cat extends Animal {
    private static int catCount = 0;
    private boolean isFull;

    public Cat(String name) {
        super(name);
        this.isFull = false;
        catCount++;
    }

    @Override
    public void run(int distance) {
        if (distance > 200) {
            System.out.println(name + " не может пробежать более 200 м.");
        } else {
            super.run(distance);
        }
    }

    @Override
    public void swim(int distance) {
        System.out.println(name + " не умеет плавать.");
    }

    public void eat(FoodBowl bowl, int amount) {
        if (bowl.decreaseFood(amount)) {
            isFull = true;
            System.out.println(name + " поел " + amount + " единиц еды и теперь сыт.");
        } else {
            System.out.println(name + " не смог поесть: недостаточно еды в миске.");
        }
    }

    public boolean isFull() {
        return isFull;
    }

    public static int getCatCount() {
        return catCount;
    }
}
