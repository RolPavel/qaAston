package lesson_3_aqa.task_1;

class Dog extends Animal {
    private static int dogCount = 0;

    public Dog(String name) {
        super(name);
        dogCount++;
    }

    @Override
    public void run(int distance) {
        if (distance > 500) {
            System.out.println(name + " не может пробежать более 500 м.");
        } else {
            super.run(distance);
        }
    }

    @Override
    public void swim(int distance) {
        if (distance > 10) {
            System.out.println(name + " не может проплыть более 10 м.");
        } else {
            super.swim(distance);
        }
    }

    public static int getDogCount() {
        return dogCount;
    }
}
