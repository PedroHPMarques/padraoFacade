public class Documentacao extends Departamento{
    private static Documentacao documentacao = new Documentacao();

    private Documentacao() {};

    public static Documentacao getInstancia() {
        return documentacao;
    }
}
