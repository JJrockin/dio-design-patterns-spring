package subsistema2.cep;

public class CepApi {

    private static CepApi instancia = new CepApi();
    private CepApi(){
        super();
    }

    public static CepApi getInstancia(){
        return instancia;
    }
    public String recuperarCidade(String cep){
        return "Feira de Santana";
    }
    public String recuperarEstado(String cep){
        return "BA";
    }
}
