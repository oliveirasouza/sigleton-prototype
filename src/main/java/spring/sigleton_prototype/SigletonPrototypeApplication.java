package spring.sigleton_prototype;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SigletonPrototypeApplication {
	public static void main(String[] args) {
		SpringApplication.run(SigletonPrototypeApplication.class, args);

		@Bean
		public CommandLineRunner run(SistemaMensagem) throws Exception {
			return args -> {
				sistema.enviarConfirmacaoCadastro("Sigleton", "Mensagem de teste do singleton");
				sistema.enviarMensagemBoasVindas("Prototype", "Mensagem de teste do prototype");
			};
		}
	}
}
