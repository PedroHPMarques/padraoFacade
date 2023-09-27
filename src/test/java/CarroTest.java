import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CarroTest {
    @Test
    void deveRetornarPendenciaMecanicaVenda() {
        Carro carro = new Carro();
        Mecanica.getInstancia().addCarroPendente(carro);

        assertEquals(false, carro.vender());
    }

    @Test
    void deveRetornarPendenciaPinturaVenda() {
        Carro carro = new Carro();
        Pintura.getInstancia().addCarroPendente(carro);

        assertEquals(false, carro.vender());
    }

    @Test
    void deveRetornarPendenciaDocumentacaoVenda() {
        Carro carro = new Carro();
        Documentacao.getInstancia().addCarroPendente(carro);

        assertEquals(false, carro.vender());
    }

    @Test
    void deveRetornarCarroSemPendenciaVenda() {
        Carro carro = new Carro();

        assertEquals(true, carro.vender());
    }

}