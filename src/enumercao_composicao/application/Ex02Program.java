package enumercao_composicao.application;

import enumercao_composicao.entities.Comentario;
import enumercao_composicao.entities.Post;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;

public class Ex02Program {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf =new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Comentario c1 = new Comentario("Teste 1");
        Comentario c2 = new Comentario("Teste 2");
    Post p1 = new Post(sdf.parse("21/06/2019 13:05:44"),
            "Teste1",
            "Vou visitar esse pais maravilhoso",
            12);
    p1.addComentario(c1);
    p1.addComentario(c2);
        System.out.println(p1   );
    }
}
