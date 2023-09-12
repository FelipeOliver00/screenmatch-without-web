package br.com.felipinho.screenmatch;

import br.com.felipinho.screenmatch.model.DadosSerie;
import br.com.felipinho.screenmatch.service.ConsumoApi;
import br.com.felipinho.screenmatch.service.ConverterDados;
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
		//BASICAMENTE UM MÉTODO MAIN
//		System.out.println("Primeiro projeto Spring sem web");

		var consumoApi = new ConsumoApi();
		var json = consumoApi.obterDados("https://www.omdbapi.com/?t=gilmore+girls&apikey=6585022c");

//		json = consumoApi.obterDados("https://coffee.alexflipnote.dev/random.json");
		System.out.println(json);

		ConverterDados converterDados = new ConverterDados();
		DadosSerie dados = converterDados.obterDados(json, DadosSerie.class);
		System.out.println(dados);
	}
}
