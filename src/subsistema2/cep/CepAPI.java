package subsistema2.cep;

public class CepAPI {
    private static CepAPI instancia = new CepAPI();

    private CepAPI() {
        super();
    }

    public static CepAPI getInstancia() {
        return instancia;
    }

    public String RecuperarCidade(String cep) {
        return "Rio de Janeiro";
    }
    public String RecuperarEstado(String cep) {
        return "Rio de Janeiro";
    }
}
