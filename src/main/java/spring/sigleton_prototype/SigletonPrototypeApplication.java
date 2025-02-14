package spring.sigleton_prototype;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
@SpringBootApplication
public class SigletonPrototypeApplication {

	public static void main(String[] args) {
		SpringApplication.run(SigletonPrototypeApplication.class, args);
	}

	@Bean
	public Remetente noreplyRemetente() {
		return new Remetente("noreply", "noreply@example.com");
	}

	@Bean
	public Remetente techRemetente() {
		return new Remetente("Tech Team", "tech@example.com");
	}

	@Bean
	public CommandLineRunner run(SistemaMensagem sistema) {
		return args -> {
			sistema.enviarConfirmacaoCadastro("Mensagem de teste do singleton");
			sistema.enviarMensagemBoasVindas("Mensagem de teste do prototype");
		};
	}
}
