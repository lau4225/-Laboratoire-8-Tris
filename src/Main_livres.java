import java.util.*;

public class Main_livres {

    public static void main(String[] args) {


        ArrayList<Livre> biblio1 = new ArrayList<>();
        TreeSet<Livre> biblio2 = new TreeSet<>(new Classeur());
        TreeSet<Livre> biblio3 = new TreeSet<>();
        ArrayList<Livre> biblio4 = new ArrayList<>();
        ArrayList<Livre> biblio5 = new ArrayList<>();


        bibliotheque(biblio1);
        bibliotheque(biblio2);
        bibliotheque(biblio3);
        bibliotheque(biblio4);
        bibliotheque(biblio5);


        System.out.println("---------------");
        System.out.println("SANS CLASSEMENT");
        System.out.println("---------------");
        for (Livre l: biblio1){ l.afficher(); }

        System.out.println("------------------------");
        System.out.println("PAR ANNÉE     COMPARE TO ");
        System.out.println("------------------------");
        Collections.sort(biblio1);
        for (Livre l: biblio1) { l.afficher(); }



        System.out.println("-------------------------------");
        System.out.println("CLASSEUR PAR ÉTAPES     TREESET");
        System.out.println("-------------------------------");
        for (Livre l: biblio2) { l.afficher(); }

        System.out.println("---------------------");
        System.out.println("PAR ANNÉE     TREESET ");
        System.out.println("---------------------");
        for (Livre l: biblio3) { l.afficher(); }

        System.out.println("---------------------------------");
        System.out.println("CLASSEUR PAR ÉTAPES     ARRAYLIST");
        System.out.println("---------------------------------");
        Collections.sort(biblio4, new Classeur());
        for (Livre l: biblio4) { l.afficher(); }


        System.out.println("---------------------------------------------");
        System.out.println("ALGORITHME DE TRI     PAR ANNÉE     SELECTION");
        System.out.println("---------------------------------------------");

        selection(biblio5);
        for (Livre l: biblio5) { l.afficher(); }





    }

    public static void bibliotheque(Collection<Livre> biblio){
        biblio.add(new Livre(9782,"Léa Olivier", "La vie compliquée","Catherine Girard", "Les Malins", 2012));
        biblio.add(new Livre(3525,"Twilight", "La fascination", "Stephenie Meyer", "Hachette", 2011));
        biblio.add(new Livre(8399, "L'Alchimiste", "Vérité", "Paulo Coelho", "J'ai lu", 1988));
        biblio.add(new Livre(4921,"Lénacie", "Le royaume", "Priska Poirier", "De Mortagne", 2009));
        biblio.add(new Livre(5766, "Mini-Maude", "Duo-tang", "Catherine Girard", "Les Malins", 2018));
        biblio.add(new Livre(7619, "Aurélie Laflamme", "Extraterrestre ou presque", "India Desjardins", "Intouchables", 2006 ));
        biblio.add(new Livre(8954, "Aurélie Laflamme", "Championne", "India Desjardins", "Intouchables", 2008 ));
        biblio.add(new Livre(0612,"Harry Potter", "À l'école des sorcier", "J.K. Rowling", "Gallimard", 1997 ));
        biblio.add(new Livre(6575, "L'ABC des filles 2018", "10 ans", "Catherine Girard", "Les Malins", 2017 ));
        biblio.add(new Livre(7828, "Peter Pan", "Les contes interdits", "Simon Rousseau", "ADA", 2016));


    }

    public static void selection (ArrayList<Livre> biblio) {
        Livre livre=null;
        int index;
        for(int i=0; i<biblio.size(); i++) {
            livre = biblio.get(i);
            index = i;
            for (int j = i; j < biblio.size(); j++) {
                if (biblio.get(j).compareTo(biblio.get(index)) < 0) {
                    livre = biblio.get(j);
                    index = j;
                }
            }
            biblio.remove(index);
            biblio.add(i, livre);

        }
    }
}
