package iphone;

import java.util.ArrayList;
import java.util.List;

import iphone.aplications.AparelhoTelefonico;
import iphone.aplications.NavegadorInternet;
import iphone.aplications.RepodutorMusicial;

public class Iphone implements RepodutorMusicial, AparelhoTelefonico, NavegadorInternet {
    private List<String> listaDeMusicas;

    public Iphone() {
        this.listaDeMusicas = new ArrayList<>();
        listaDeMusicas.add("Daft Punk - Around the World");
        listaDeMusicas.add("The Beatles - Yesterday");
        listaDeMusicas.add("Bob Dylan - Like a Rolling Stone");
        listaDeMusicas.add("Elvis Presley - Jailhouse Rock");
        listaDeMusicas.add("Michael Jackson - Thriller");
        listaDeMusicas.add("Queen - Bohemian Rhapsody");
        listaDeMusicas.add("Pink Floyd - Comfortably Numb");
        listaDeMusicas.add("Nirvana - Smells Like Teen Spirit");
        listaDeMusicas.add("The Rolling Stones - (I Can't Get No) Satisfaction");
        listaDeMusicas.add("Johann Sebastian Bach - Suíte No. 3 em Ré Maior, BWV 1068");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo página web: " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando uma nova aba de navegação.");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando a página.");
    }

    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para o número: " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo uma chamada telefônica.");
    }

    @Override
    public void iniciarCorreioDeVoz() {
        System.out.println("Iniciando correio de voz.");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando música.");
    }

    @Override
    public void pausar() {
        System.out.println("Música pausada.");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecionando a música: " + musica);
    }
    public static void main(String[] args) {
    	Iphone meuIphone = new Iphone();

        // Teste dos métodos
        meuIphone.ligar("123456789");
        meuIphone.atender();
        meuIphone.iniciarCorreioDeVoz();
        
        System.out.println();
        
        meuIphone.exibirPagina("www.google.com");
        meuIphone.adicionarNovaAba();
        meuIphone.atualizarPagina();
        
        System.out.println();
        
        meuIphone.tocar();
        meuIphone.selecionarMusica("Daft Punk - Around the World");
        meuIphone.pausar();
    }
}
