public class VideoDigital extends ItemBibliotecaDigital implements Baixavel,Visualizavel{
    protected boolean visualizado;
    protected boolean baixado;

    public VideoDigital(String titulo, String autor, boolean visualizado, boolean baixado){

        super(titulo,autor);
        this.visualizado = visualizado;
        this.baixado = baixado;
    }

    @java.lang.Override
    public String descricao() {
       return "O video " + titulo + "\nfoi criado por " + autor;
    }




    @Override
    public void baixar() {
        baixado = true;
        System.out.println("Video baixado");


    }



    @Override
    public void visualizar() {
        visualizado = true;
        System.out.println("Video visualizado");

    }
}
