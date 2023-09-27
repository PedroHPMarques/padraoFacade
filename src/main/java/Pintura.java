public class Pintura extends Departamento{
    private static Pintura pintura = new Pintura();

    private Pintura() {};

    public static Pintura getInstancia() {
        return pintura;
    }
}
