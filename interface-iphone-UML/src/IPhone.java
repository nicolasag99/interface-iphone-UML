public class IPhone implements ReprodutorMusica, AparelhoTelefonico, NavegadorInternet{

    //Sobreescrevendo os métodos das interfaces ReprodutorMusica, AparelhoTelefonico e NavegadorInternet

    public void selecionarMusica(String musica){
        System.out.println("Selecionado musica " + musica);
    }

    public void tocar(){
        System.out.println("Tocando música");
    }
    
    public void pausar(){
        System.out.println("Música pausada");
    }

    public void ligar(String numero){
        System.out.println("Ligando para " + numero);
    }

    public void atender(){
        System.out.println("Atendendo telefone");
    }

    public void iniciarCorreioVoz(){
        System.out.println("Iniciando correio de voz");
    }

    public void exibirPagina(String url){
        System.out.println("Exibindo página " + url);

    }

    public void adicionarNovaAba(){
        System.out.println("Adicionado nova aba");
    }

    public void atualizarPagina(){
        System.out.println("Atualizando a página");
    }
    
}
