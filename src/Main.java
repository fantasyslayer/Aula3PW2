import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Equacao valores = new Equacao();

        System.out.println("====Equação de 2 grau====\n");
        System.out.println("Exemplo: ax² + bx + c = 0 ");
        System.out.println("Digite o valor a: ");
        valores.a = (leitor.nextInt());
        System.out.println("Digite o valor b: ");
        valores.b = (leitor.nextInt());
        System.out.println("Digite o valor c: ");
        valores.c = (leitor.nextInt());

        valores.calcDelta();
        System.out.println(valores.raiz());

        valores.calcEquacao();
        System.out.println("X1 = " + valores.x1);
        System.out.println("X2 = " + valores.x2);
    }
}