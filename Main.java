public class Main {
    public static void main(String[] args) {
int resultado;
resultado = suma(3, 4, 6);
        System.out.println(resultado);

    coche miCoche = new coche();
        miCoche.Aumentopuertas();
        miCoche.Aumentopuertas();
        miCoche.Aumentopuertas();
        System.out.println(miCoche.puertas);}

    public static int suma (int a, int b, int c) {
        return a+b+c;}


}

class coche{
    public int puertas = 0;
    public void Aumentopuertas(){
        this.puertas++;}}

