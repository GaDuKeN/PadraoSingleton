import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ConfiguracoesClubeTest {

    @Test
    public void deveRetornarNomeClube() {
        ConfiguracoesClube.getInstance().setNomeClube("Clube dos Amigos");
        assertEquals("Clube dos Amigos", ConfiguracoesClube.getInstance().getNomeClube());
    }

    @Test
    public void deveRetornarMembroAtivo() {
        ConfiguracoesClube.getInstance().setMembroAtivo("João Silva");
        assertEquals("João Silva", ConfiguracoesClube.getInstance().getMembroAtivo());
    }
}
