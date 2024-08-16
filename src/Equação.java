import java.util.Scanner;

public class Equação {
    public int a;
    public int b;
    public int c;
    public int delta;
    public void calcDelta(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o valor de a: ");
        a = entrada.nextInt();
        System.out.println("Digite o valor de b: ");
        b = entrada.nextInt();
        System.out.println("Digite o valor de c: ");
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
