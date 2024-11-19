package lesson_3_aqa.task_2;

public class Info {
    public static void main(String[] args) {
        Circle circle = new Circle(5, "red", "black");
        Rectangle rectangle = new Rectangle(4, 6, "blue", "green");
        Triangle triangle = new Triangle(3, 4, 5, "yellow", "purple");

        printShapeInfo("Круг", circle);
        printShapeInfo("Прямоугольник", rectangle);
        printShapeInfo("Треугольник", triangle);

        circle.setFillColor("orange");
        circle.setBorderColor("brown");
        rectangle.setFillColor("pink");
        triangle.setBorderColor("grey");

        System.out.println("\nИнформация после изменения цветов:");
        printShapeInfo("Круг", circle);
        printShapeInfo("Прямоугольник", rectangle);
        printShapeInfo("Треугольник", triangle);
    }

    public static void printShapeInfo(String shapeName, Shape shape) {
        System.out.println("Информация о фигуре: " + shapeName);
        System.out.println("Периметр: " + shape.getPerimeter());
        System.out.println("Площадь: " + shape.getArea());
        System.out.println("Цвет заливки: " + shape.getFillColor());
        System.out.println("Цвет границы: " + shape.getBorderColor());
        System.out.println("--------------------");
    }
}
