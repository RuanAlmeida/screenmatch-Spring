package br.com.alura.screenmatch;

import br.com.alura.screenmatch.model.DadosSerie;
import br.com.alura.screenmatch.serivce.ConsumoApi;
import br.com.alura.screenmatch.serivce.ConverterDados;
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

		var Json = ConsumoApi
					.obterDados("http://www.omdbapi.com/?t=gilmore+girls&apikey=66106cea");

		System.out.println(Json);
		ConverterDados conversor = new ConverterDados();
		DadosSerie dados = conversor.obterDados(Json, DadosSerie.class);
		System.out.println(dados);



	}
}
