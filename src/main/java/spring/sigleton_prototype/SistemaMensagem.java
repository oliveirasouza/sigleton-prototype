package spring.sigleton_prototype;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class SistemaMensagem {
    @Autowired
    @Qualifier("noreplyRemetente")
    private  Remetente noreply;
    @Autowired
    @Qualifier("techRemetente")
    private  Remetente techTeam;

    public SistemaMensagem(@Qualifier("noreplyRemetente") Remetente noreply,
                           @Qualifier("techRemetente") Remetente techTeam) {
        this.noreply = noreply;
        this.techTeam = techTeam;
    }

    public void enviarConfirmacaoCadastro(String mensagem) {
        System.out.println(noreply);
        System.out.println("Seu cadastro foi aprovado!");
        System.out.println(mensagem);
    }

    public void enviarMensagemBoasVindas(String mensagem) {
        techTeam.setEmail("tech@dio.com.br");
        System.out.println(techTeam);
        System.out.println("Bem-vindo à Tech Elite");
        System.out.println(mensagem);
    }
}
