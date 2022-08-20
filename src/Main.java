import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String color;
        double lado;
        double base;
        double altura;
        Scanner x = new Scanner(System.in);

        System.out.println("Ingrese el color del cuadrado");
        color = x.next();
        System.out.println("Ingrese el lado del cuadrado");
        lado = x.nextDouble();

        Cuadrado c1 = new Cuadrado(color, lado);
        System.out.println("El Area del Cuadrado es: " +c1.calcularArea());
        System.out.println("El Color del Cuadrado 1 es: " +c1.getColor());

        Cuadrado c2 = new Cuadrado("Azul", 2.3);
        System.out.println("El Area del Cuadrado es: " +c2.calcularArea());
        System.out.println("El Color del Cuadrado 1 es: " +c2.getColor());

        System.out.println("Ingrese el color del triangulo: ");
        color = x.next();
        System.out.println("Ingrese la base del triangulo: ");
        base = x.nextDouble();
        System.out.println("Ingrese la altura del triangulo: ");
        altura = x.nextDouble();

        Triangulo tr = new Triangulo(color,base,altura);
        System.out.println("El Area del Triangulo es: " +tr.calcularArea());
        System.out.println("El Color del Triangulo es: " +tr.getColor());
    }
}
