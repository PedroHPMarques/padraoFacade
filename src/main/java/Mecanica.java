public class Mecanica extends Departamento {
    private static Mecanica mecanica = new Mecanica();

    private Mecanica() {};

    public static Mecanica getInstancia() {
        return mecanica;
    }
}
