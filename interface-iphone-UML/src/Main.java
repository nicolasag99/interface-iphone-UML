public class Main {
    public static void main(String[] args) throws Exception {
        ReprodutorMusica reprodutor = new IPhone();
        AparelhoTelefonico telefone = new IPhone();
        NavegadorInternet navegador = new IPhone();


        //Chamando os métodos de ReprodutorMusica
        reprodutor.selecionarMusica("Supernova");
        reprodutor.tocar();
        reprodutor.pausar();
        
        //Chamando os métodos de NavegadorInternet
        navegador.exibirPagina("www.google.com");
        navegador.adicionarNovaAba();
        navegador.atualizarPagina();

        //Chamando os métodos de AparelhoTelefonico
        telefone.ligar("91919191");
        telefone.atender();
        telefone.iniciarCorreioVoz();
    }
}


