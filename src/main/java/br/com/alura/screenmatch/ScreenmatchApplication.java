package br.com.alura.screenmatch;

import br.com.alura.screenmatch.serivce.ConsumoApi;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ScreenmatchApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ScreenmatchApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		var ConsumoApi = new ConsumoApi();
	//	var json = ConsumoApi
	//				.obterDados("http://www.omdbapi.com/?t=gilmore+girls&apikey=66106cea");
	//	System.out.println(json);
	}
}
