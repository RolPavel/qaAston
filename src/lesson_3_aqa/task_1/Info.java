package lesson_3_aqa.task_1;

public class Info {
    public static void main(String[] args) {
        Dog dog = new Dog("Бобик");
        Cat cat1 = new Cat("Мурка");
        Cat cat2 = new Cat("Васька");

        dog.run(150);
        dog.swim(5);
        cat1.run(100);
        cat1.swim(10);


        FoodBowl bowl = new FoodBowl(10);
        cat1.eat(bowl, 5);
        cat2.eat(bowl, 8);
        cat1.eat(bowl, 2);

        System.out.println("Котов создано: " + Cat.getCatCount());
        System.out.println("Собак создано: " + Dog.getDogCount());
        System.out.println("Животных создано: " + Animal.getAnimalCount());
        System.out.println("Осталось еды в миске: " + bowl.getFoodAmount());
        System.out.println("Мурка сыта: " + cat1.isFull());
        System.out.println("Васька сыт: " + cat2.isFull());

        bowl.addFood(15);
        System.out.println("Осталось еды в миске после добавления: " + bowl.getFoodAmount());
    }
}
