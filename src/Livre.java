public class Livre implements Comparable<Livre>{

    private int isbn;
    private String titre;
    private String sousTitre;
    private String auteur;
    private String maisonEdition;
    private int annePub;


    public Livre(int isbn, String titre, String sousTitre, String auteur, String maisonEdition, int annePub) {
        this.isbn = isbn;
        this.titre = titre;
        this.sousTitre = sousTitre;
        this.auteur = auteur;
        this.maisonEdition = maisonEdition;
        this.annePub = annePub;
    }

    @Override
    public int compareTo(Livre o) {
        return annePub-o.annePub;
    }

    public void afficher(){
        System.out.println("Année: " + annePub);
        System.out.println("Titre: " + titre);
        System.out.println("Sous-titre: " + sousTitre);
        System.out.println("Auteur: " + auteur);
        System.out.println("Maison d'édition: " + maisonEdition);
        System.out.println("ISBN: " + isbn);
        System.out.println();
        System.out.println();

    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getSousTitre() {
        return sousTitre;
    }

    public void setSousTitre(String sousTitre) {
        this.sousTitre = sousTitre;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public String getMaisonEdition() {
        return maisonEdition;
    }

    public void setMaisonEdition(String maisonEdition) {
        this.maisonEdition = maisonEdition;
    }

    public int getAnnePub() {
        return annePub;
    }

    public void setAnnePub(int annePub) {
        this.annePub = annePub;
    }




}
