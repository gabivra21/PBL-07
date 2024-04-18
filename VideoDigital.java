import java.util.ArrayList;

public class VideoDigital extends ItemBibliotecaDigital implements Baixavel,Visualizavel{
    public VideoDigital(String titulo, String autor){
        super(titulo,autor);
    }

    @java.lang.Override
    public void descricao() {
        System.out.println("O vídeo: "+ titulo);
        System.out.println("Foi criado por"+ autor);
    }

    ArrayList videosBaixados = new ArrayList<VideoDigital>();


    @java.lang.Override
    public void baixar(VideoDigital videoDigital) {
        videosBaixados.add(videoDigital);

    }

    ArrayList videosVisualizados = new ArrayList<VideoDigital>();

    @java.lang.Override
    public void visualizar(VideoDigital videoDigital) {
        videosVisualizados.add(videoDigital);
    }
}
