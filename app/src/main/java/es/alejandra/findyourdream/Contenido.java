package es.alejandra.findyourdream;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Contenido {

    public static ArrayList<Lista_entrada> ENT_LISTA = new ArrayList<Lista_entrada>();

    public static Map<String, Lista_entrada> ENT_LISTA_HASHMAP = new HashMap<String, Lista_entrada>();

    private static void aniadirEntrada(Lista_entrada entrada){
        ENT_LISTA.add(entrada);
        ENT_LISTA_HASHMAP.put(entrada.id, entrada);
    }

    static {
        aniadirEntrada(new Lista_entrada("0", R.drawable.falling,
                "DREAMS ABOUT FALLING",
                "They are a sign that something in your life isn't going well. It might suggest that you need to rethink a choice or consider a new direction in some area of your life.",
                false,false));

        aniadirEntrada(new Lista_entrada("1", R.drawable.naked,
                "DREAMS ABOUT BEING NAKED IN PUBLIC",
                "Might indicate that you feel like a phony or that you are afraid of revealing your imperfections and shortcomings.",
                false,false));

        aniadirEntrada(new Lista_entrada("2", R.drawable.chased,
                "DREAMS ABOUT BEING CHASED",
                "Might indicate a desire to escape from your own fears or desires.Being chased by an animal might indicate that you are hiding from your own anger, passions, and other feelings.",
                false,false));

        aniadirEntrada(new Lista_entrada("3", R.drawable.teeth,
                "DREAMS ABOUT LOSING TEETH",
                "It might mean that you are worried about your attractiveness or appearance. It might also indicate that you are concerned about your ability to communicate or concerned that you might have said something embarrassing.",
                false, false));

        aniadirEntrada(new Lista_entrada("4", R.drawable.dying,
                "DREAMS ABOUT DYING",
                "They reflect anxiety about change or a fear of the unknown. Dreaming about the death of a loved one can reflect a similar fear of change, especially with regards to children reaching milestones and growing up.",
                false,false));

        aniadirEntrada(new Lista_entrada("5", R.drawable.test,
                "DREAMS ABOUT TAKING A TEST",
                "To dream of failing an exam, being late for one, or being unprepared shows that you feel unprepared for the challenges of waking life.",
                false,false));

        aniadirEntrada(new Lista_entrada("6", R.drawable.flying,
                "DREAMS ABOUT FLYING",
                "such dreams can represent feelings of freedom and independence. On the other hand, they can also indicate a desire to flee or escape from the realities of life.",
                false, false));

        aniadirEntrada(new Lista_entrada("7", R.drawable.pregnancy,
                "DREAMS ABOUT PREGNANCY",
                "Such dreams indicate that the dreamer is developing some area of potential or deepening a relationship. Sometimes represent a woman's fears of being an inadequate mother.",
                false, false));
    }

    public static class Lista_entrada{
        public String id;
        public int idImagen;
        public String titulo;
        public String texto;
        public boolean haveDream;
        public boolean likeIt;

        public Lista_entrada(String id, int idImagen, String titulo, String texto, boolean haveDream, boolean likeIt) {
            this.id = id;
            this.idImagen = idImagen;
            this.titulo = titulo;
            this.texto = texto;
            this.haveDream = haveDream;
            this.likeIt = likeIt;
        }
    }
}
