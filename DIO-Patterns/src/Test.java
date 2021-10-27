import br.com.codered.gof.facade.Facade;
import br.com.codered.gof.singleton.SingletonEager;
import br.com.codered.gof.singleton.SingletonLazy;
import br.com.codered.gof.singleton.SingletonLazyHolder;
import br.com.codered.gof.strategy.ComportamentoDefensivo;
import br.com.codered.gof.strategy.ComportamentoNormal;
import br.com.codered.gof.strategy.Robo;

public class Test {

	public static void main(String[] args) {

		
		// Singleton tests 
		
		SingletonLazy lazy = SingletonLazy.getInstance();
		System.out.println(lazy);
		
		lazy = SingletonLazy.getInstance();
		System.out.println(lazy);

		SingletonEager eager = SingletonEager.getInstance();
		System.out.println(eager);
		
		eager = SingletonEager.getInstance();
		System.out.println(eager);

		
		SingletonLazyHolder holder = SingletonLazyHolder.getInstance();
		System.out.println(holder);
		
		holder = SingletonLazyHolder.getInstance();
		System.out.println(holder);
		
		
		// Strategy Tests
		ComportamentoNormal normal = new ComportamentoNormal();
		ComportamentoDefensivo defensivo = new ComportamentoDefensivo();
		
		Robo robo = new Robo();
		robo.setComportamento(normal);
		robo.mover();
		robo.mover();
		
		robo.setComportamento(defensivo);
		robo.mover();

		
		// Facade
		
		Facade facade = new Facade();
		
		facade.migrarCliente("Mauricio", "13418-415");
	}

}
