import java.util.Scanner;

public class HuxleyCode {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        double xA = entrada.nextDouble();
        double yA = entrada.nextDouble();
        double zA = entrada.nextDouble();
        
        double xB = entrada.nextDouble();
        double yB = entrada.nextDouble();
        double zB = entrada.nextDouble();
        
        double distancia = Math.sqrt(Math.pow(xB - xA, 2) + Math.pow(yB - yA, 2) + Math.pow(zB - zA, 2));
        
        System.out.println(distancia);
        
        entrada.close();
    }
}