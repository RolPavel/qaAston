package lesson_3_aqa.task_2;

public class Info {
    public static void main(String[] args) {
        Circle circle = new Circle(5, "red", "black");
        Rectangle rectangle = new Rectangle(4, 6, "blue", "green");
        Triangle triangle = new Triangle(3, 4, 5, "yellow", "purple");

        System.out.println("Информация о круге:");
        circle.displayInfo();

        System.out.println("Информация о прямоугольнике:");
        rectangle.displayInfo();

        System.out.println("Информация о треугольнике:");
        triangle.displayInfo();

        circle.setFillColor("orange");
        circle.setBorderColor("brown");
        rectangle.setFillColor("pink");
        triangle.setBorderColor("grey");

        System.out.println("\nИнформация после изменения цветов:");

        System.out.println("Информация о круге:");
        circle.displayInfo();

        System.out.println("Информация о прямоугольнике:");
        rectangle.displayInfo();

        System.out.println("Информация о треугольнике:");
        triangle.displayInfo();
    }
}
