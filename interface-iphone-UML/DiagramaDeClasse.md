# Diagrama de Classe

```mermaid
classDiagram
    IPod *-- ReprodutorMusical   
    ReprodutorMusical : + tocar()
    ReprodutorMusical : + pausar()
    ReprodutorMusical : + selecionarMusica(String musica)
    
    Phone *-- AparelhoTelefonico
    AparelhoTelefonico : + ligar()
    AparelhoTelefonico : + atender()
    AparelhoTelefonico : + iniciarCorreioVoz()

    Internet *-- NavegadorInternet
    NavegadorInternet : + exibirPagina()
    NavegadorInternet : + adicionarNovaPagina()
    NavegadorInternet : + atualizarPagina()
    
    IPhone o-- ReprodutorMusical
    IPhone o-- AparelhoTelefonico
    IPhone o-- NavegadorInternet
