public class CarroFacade {
    public static boolean verificarPendenciasVenda(Carro carro) {
        if (Mecanica.getInstancia().verificarCarroComPendencia(carro)) {
            return false;
        }
        if (Pintura.getInstancia().verificarCarroComPendencia(carro)) {
            return false;
        }
        if (Documentacao.getInstancia().verificarCarroComPendencia(carro)) {
            return false;
        }
        return true;
    }
}
