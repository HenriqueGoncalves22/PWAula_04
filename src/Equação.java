import java.util.Scanner;

public class Equação {
    public int a;
    public int b;
    public int c;
    public int delta;
    public void calcDelta(){
        Scanner entrada = new Scanner(System.in);
        a = entrada.nextInt();
        b = entrada.nextInt();
        c = entrada.nextInt();
        delta= (b*b) -4*a*c;
        System.out.println("Delta = " + delta);
    }
    public String raiz(){
        if (delta<0){
           System.out.println("Não existe raiz real");
        }
        else if (delta==0) {
            System.out.println("Existe uma raiz real");
        }
        else {
            System.out.println("Existem duas raízes reais");
        }
        return "";
    }


}
