public class ConfiguracoesClube {

    private ConfiguracoesClube() {};
    private static ConfiguracoesClube instance = new ConfiguracoesClube();
    public static ConfiguracoesClube getInstance() {
        return instance;
    }

    private String nomeClube;
    private String membroAtivo;

    public String getNomeClube() {
        return nomeClube;
    }

    public void setNomeClube(String nomeClube) {
        this.nomeClube = nomeClube;
    }

    public String getMembroAtivo() {
        return membroAtivo;
    }

    public void setMembroAtivo(String membroAtivo) {
        this.membroAtivo = membroAtivo;
    }
}
{
}
