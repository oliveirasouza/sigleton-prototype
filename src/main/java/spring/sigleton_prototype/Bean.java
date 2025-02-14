package spring.sigleton_prototype;

import org.springframework.context.annotation.Configuration;

@Configuration
public class Bean {
    public Remetente remetente() {
        System.out.println("CRIANDO UM OBJETO REMETENTE");
        Remetente remetente = new Remetente();
        remetente.setEmail("noreply@dio.com");
        remetente.setNome("Digital Inovation One");
        return remetente;

    }
}
