import java.util.ArrayList;
import java.util.List;

public class Departamento {
    private List<Carro> carrosComPendencia = new ArrayList<Carro>();

    public void addCarroPendente(Carro carro) {
        this.carrosComPendencia.add(carro);
    }

    public boolean verificarCarroComPendencia(Carro carro) {
        return this.carrosComPendencia.contains(carro);
    }
}
