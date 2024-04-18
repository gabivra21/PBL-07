

public class Main {
    public static void main(String[] args) {
        Ebook ebook = new Ebook("Mentes Ansiosas","Ana Beatriz", false);
        Ebook ebook1 = new Ebook("lalaland","kojo",false);

        VideoDigital videoDigital = new VideoDigital("Jacaca", "lucio",false, false);
        VideoDigital videoDigital1 = new VideoDigital("brasil do brasil","bia",false, false);

        System.out.println(ebook.descricao());
        System.out.println(videoDigital.descricao());

        System.out.println(ebook.baixado);
        ebook.baixar();
        System.out.println(ebook.baixado);












    }
}
