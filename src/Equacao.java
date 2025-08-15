public class Equacao {
    int a;
    int b;
    int c;
    int delta;

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
}
