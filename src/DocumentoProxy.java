public class DocumentoProxy implements Documento {
    private DocumentoOriginal documentoOriginal;
    private String nomeArquivo;

    public DocumentoProxy(String nomeArquivo) {
        this.nomeArquivo = nomeArquivo;
    }

    @Override
    public void exibirDocumento() {
        if (documentoOriginal == null) {
            documentoOriginal = new DocumentoOriginal(nomeArquivo);
        }
        documentoOriginal.exibirDocumento();
    }
}