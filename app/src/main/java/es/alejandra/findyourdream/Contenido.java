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
                "They are a sign that something in your life isn't going well. It might suggest that you need to rethink a choice or consider a new direction in some area of your life. It is a symbol of fear in real life - perhaps of failing at work or in your love life, often expresses a need to let yourself go more and enjoy life more.",
                false,false));

        aniadirEntrada(new Lista_entrada("1", R.drawable.naked,
                "DREAMS ABOUT BEING NAKED IN PUBLIC",
                "Might indicate that you feel like a phony or that you are afraid of revealing your imperfections and shortcomings.",
                false,false));

        aniadirEntrada(new Lista_entrada("2", R.drawable.chased,
                "DREAMS ABOUT BEING CHASED",
                "Might indicate a desire to escape from your own fears or desires. Being chased by an animal might indicate that you are hiding from your own anger, passions, and other feelings. f your pursuer is a mysterious, unknown figure, it might represent a childhood experience or past trauma. If you are being chased by someone of the opposite sex, it means you are afraid of love or haunted by a past relationship.",
                false,false));

        aniadirEntrada(new Lista_entrada("3", R.drawable.teeth,
                "DREAMS ABOUT LOSING TEETH",
                "It might mean that you are worried about your attractiveness or appearance. It might also indicate that you are concerned about your ability to communicate or concerned that you might have said something embarrassing. f your teeth fall out, you lose personal power and your ability to be assertive, decisive, and self-protective.",
                false, false));

        aniadirEntrada(new Lista_entrada("4", R.drawable.dying,
                "DREAMS ABOUT DYING",
                "They reflect anxiety about change or a fear of the unknown. Dreaming about the death of a loved one can reflect a similar fear of change, especially with regards to children reaching milestones and growing up. Such changes indicate that a child is growing up and a parent's mind begins to wonder where the younger version of the child went. Such dreams of dying, therefore, reflect a sort of mourning for the inevitable passage of time.",
                false,false));

        aniadirEntrada(new Lista_entrada("5", R.drawable.test,
                "DREAMS ABOUT TAKING A TEST",
                "To dream of failing an exam, being late for one, or being unprepared shows that you feel unprepared for the challenges of waking life. It might reveal an underlying fear of failure",
                false,false));

        aniadirEntrada(new Lista_entrada("6", R.drawable.flying,
                "DREAMS ABOUT FLYING",
                "such dreams can represent feelings of freedom and independence. On the other hand, they can also indicate a desire to flee or escape from the realities of life. But because it often involves positive feelings of pleasure, flying may depict our sexuality…especially aspects of it expressing freedom from social norms and restraints.",
                false, false));

        aniadirEntrada(new Lista_entrada("7", R.drawable.pregnancy,
                "DREAMS ABOUT PREGNANCY",
                "Such dreams indicate that the dreamer is developing some area of potential or deepening a relationship. Sometimes represent a woman's fears of being an inadequate mother. These dreams may also presage difficult times.",
                false, false));

        aniadirEntrada(new Lista_entrada("8", R.drawable.war,
                "DREAMS ABOUT WAR",
                "Foretells unfortunate conditions in business, and much disorder and strife in domestic affairs. To dream that your country is defeated in war, is a sign that it will suffer revolution of a business and political nature.",
                false, false));

        aniadirEntrada(new Lista_entrada("9", R.drawable.grandparents,
                "DREAMS ABOUT GRANDPARENTS",
                "To dream of meeting your grandparents and conversing with them, you will meet with difficulties that will be hard to surmount, but by following good advice you will overcome many barriers.",
                false, false));
        aniadirEntrada(new Lista_entrada("10", R.drawable.wedding,
                "DREAMS ABOUT GETTING MARRIED",
                "It's a sad augury, as death will only be eluded by a miracle. If the wedding is a gay one and there are no ashen, pale-faced or black-robed ministers enjoining solemn vows, the reverses may be expected.",
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
