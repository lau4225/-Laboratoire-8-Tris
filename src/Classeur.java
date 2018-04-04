import java.util.Comparator;

public class Classeur implements Comparator<Livre> {

    @Override
    public int compare(Livre o1, Livre o2) {
        int maison = o1.getMaisonEdition().compareTo(o2.getMaisonEdition());
        if (maison==0){
            int auteur = o1.getAuteur().compareTo(o2.getAuteur());
            if (auteur==0){
                int titre = o1.getTitre().compareTo(o2.getTitre());
                if (titre==0){
                    int annee = o1.getAnnePub() - o2.getAnnePub();

                    return annee;
                }

                return titre;
            }

            return auteur;
        }

        return maison;
    }
}
