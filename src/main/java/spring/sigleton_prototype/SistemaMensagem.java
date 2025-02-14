package spring.sigleton_prototype;

public class SistemaMensagem {
    private Remetente noreply;
    private Remetente financeiro;

    public void enviarConfirmacaoCadastro() {
        System.out.println(noreply);
        System.out.println("Seu cadastro foi aprovado!");
    }


    public void enviarMensagemBoasVindas() {
        financeiro.setEmail("tech@dio.com.br");
        System.out.println(financeiro);
        System.out.println("Bem-vindo à Tech Elite");
    }
}
