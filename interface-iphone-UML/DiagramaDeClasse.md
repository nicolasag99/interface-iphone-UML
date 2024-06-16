# Diagrama de Classe 

```mermaid
classDiagram
    ReprodutorMusical <|-- IPod 
    ReprodutorMusical : + tocar()
    ReprodutorMusical : + pausar()
    ReprodutorMusical : + selecionarMusica(String musica)

    AparelhoTelefonico <|-- Phone
    AparelhoTelefonico : + ligar()
    AparelhoTelefonico : + atender()
    AparelhoTelefonico : + iniciarCorreioVoz()

    NavegadorInternet <|-- Internet
    NavegadorInternet : + exibirPagina()
    NavegadorInternet : + adicionarNovaAba()
    NavegadorInternet : + atualizarPagina()

    IPhone o-- ReprodutorMusical
    IPhone o-- AparelhoTelefonico
    IPhone o-- NavegadorInternet

    class IPhone {
    }
