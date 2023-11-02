public class App {
    public static void main(String[] args) {
        Documento documento1 = new DocumentoProxy("documento1.jpg");
        Documento documento2 = new DocumentoProxy("documento2.jpg");

        //O documento será carregado do disco
        documento1.exibirDocumento();
        System.out.println("");

        //O documento apenas será exibido pois já foi carregado do disco anteriormente
        documento1.exibirDocumento();
        System.out.println("");

        //O documento será carregado do disco
        documento2.exibirDocumento();
    }
}