public class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    // Implementação dos métodos da interface ReprodutorMusical
    @Override
    public void tocar() {
        System.out.println("Tocando música...");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando música...");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecionando música: " + musica);
    }
    // Implementação dos métodos da interface AparelhoTelefonico
    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo chamada...");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz...");
    }
    // Implementação dos métodos da interface NavegadorInternet
    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo página: " + url);
    }
    @Override
    public void adicionarNovaAba() {
        System.out.println("Abrindo nova aba...");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página...");
    }
    // Método específico da classe iPhone
    public void desbloquear() {
        System.out.println("Desbloqueando o iPhone...");
    }
    public static void main(String[] args) {
        iPhone meuiPhone = new iPhone();
        meuiPhone.tocar();
        meuiPhone.ligar("123456789");
        meuiPhone.exibirPagina("https://www.example.com");
        meuiPhone.desbloquear();
    }
}

