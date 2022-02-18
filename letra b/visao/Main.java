package visao;

import java.util.InputMismatchException;
import java.util.Scanner;

import graphics.Circle;
import graphics.ErrorExceptionValue;
import graphics.Rectangle;

public class Main {
    public static void main(String[] args) {
        int valor,opcao,altura,base,raio;
        Scanner teclado = new Scanner(System.in);
        try {
            System.out.println("Escolha a figura geometrica que deseja calcular\n[1]Circulo\n[2]Retangulo");
            opcao = teclado.nextInt();
            switch(opcao) {
                case 1:{//Circulo
                    System.out.println("Digite o raio : ");
                    raio = teclado.nextInt();
                    Circle circle = new Circle(raio);
                    System.out.println(circle.getArea());
                }
                case 2:{//Rectangle
                    System.out.println("Digite a altura : ");
                    altura = teclado.nextInt();
                    System.out.println("Digite a base : ");
                    base = teclado.nextInt();
                    Rectangle rectangle = new Rectangle(altura, base);
                    System.out.println(rectangle.getArea());
                }
                default :{
                    System.out.println("Opção invalida");
                }
            }
        } catch (InputMismatchException e) {
            throw new ErrorExceptionValue();
        }
    }
}
