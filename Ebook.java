import java.util.ArrayList;

public class Ebook extends ItemBibliotecaDigital implements Baixavel{
    public Ebook(String titulo, String autor){
        super(titulo,autor);
    }

    @java.lang.Override
    public void descricao() {
        System.out.println("O ebook "+ titulo);
        System.out.println("Este ebook foi escrito por "+ autor);
    }

    ArrayList ebooksBaixados = new ArrayList<Ebook>();
    @java.lang.Override
    public void baixar(Ebook ebook) {
        ebooksBaixados.add(ebook);

    }
}
