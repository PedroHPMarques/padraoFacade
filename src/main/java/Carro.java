public class Carro {
    public boolean vender() {
        return CarroFacade.verificarPendenciasVenda(this);
    }
}
