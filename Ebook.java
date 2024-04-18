import java.util.ArrayList;

public class Ebook extends ItemBibliotecaDigital implements Baixavel{
    protected boolean baixado;
    public Ebook(String titulo, String autor, boolean baixado){

        super(titulo,autor);
        this.baixado = baixado;

    }

    @Override
    public String descricao() {
        return "O ebook " + titulo + "\nfoi escrito por " + autor;
    }


    @Override
    public void baixar() {
        baixado = true;
        System.out.println("Ebook baixado");

    }
}
