
public class Main {

    public static void main(String[] args) {

        Fraccion a = new Fraccion(1, 2);
        Fraccion b = new Fraccion(3, 4);

      // Fraccion resuls = a.sumar(b);
       // Fraccion resuls = a.restar(b);
        Fraccion resuls = a.multi(b);
        resuls.mostrar();

    }
}
