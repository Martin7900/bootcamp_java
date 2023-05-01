public class Main {

    public static void main(String[] args) {
        System.out.println(suma(30,49,50));

        Coche auto = new Coche();
        auto.agregarPuerta();
        System.out.println(auto.puertas);
    }

    static int suma(int a, int b, int c) {
        return a+b+c;
    }
}

class Coche {
    int puertas = 0;

    void agregarPuerta() {
        puertas++;
    }
}
