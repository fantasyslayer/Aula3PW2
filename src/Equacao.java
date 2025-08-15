public class Equacao {
    int a;
    int b;
    int c;
    int delta;
    double x1;
    double x2;

    void calcDelta(){
        delta = (b * b)- 4 * a * c;
    }

    String raiz(){
        if(delta < 0)
            return "não existe raiz real.";
        else if(delta == 0)
            return "existe uma raiz real.";
        else
            return "existem duas raizes reais";
    }
    void calcEquacao(){
        x1 = (-b + Math.sqrt(delta))/(2 * a);
        x2 = (-b - Math.sqrt(delta))/(2 * a);
    }

}
