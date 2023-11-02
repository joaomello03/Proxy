public class DocumentoOriginal implements Documento {
    private String nomeArquivo;

    public DocumentoOriginal(String nomeArquivo) {
        this.nomeArquivo = nomeArquivo;
        carregarDoDisco();
    }

    @Override
    public void exibirDocumento() {
        System.out.println("Exibindo " + nomeArquivo);
    }

    private void carregarDoDisco() {
        System.out.println("Carregando " + nomeArquivo);
    }
}