package subsistema2.cep;

public class CepService {

	
	private static CepService cepService = new CepService();
	
	private CepService() {
		super();
	}
	
	public static CepService getInstance() {
		return cepService;
	}
	
	public String recuperarCidade(String cep) {
		return "Piracicaba";
	}
	
	public String recuperarEstado(String cep) {
		return "SP";
	}
}
