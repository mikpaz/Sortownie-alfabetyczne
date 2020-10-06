import java.text.Collator;
import java.util.Arrays;
import java.util.Locale;

class Ksiazka implements Comparable{
    private int id;
    private String Wykonawca;
    private String Album;
    public Ksiazka() {};
    public Ksiazka(int id,String Wykonawca,String Album) {
        this.id = id;
        this.Wykonawca = Wykonawca;
        this.Album = Album;
    }
    @Override
    public String toString() {
        return String.format("%d %s %s", id, Wykonawca,Album);
    }
    private static int compareIgnoreCase(String a1, String a2) {
        Locale local = new Locale("pl","PL");
        Collator col = Collator.getInstance(local);
        col.setStrength(Collator.PRIMARY);
        return col.compare(a1.toUpperCase(local),a2.toUpperCase(local));
    }
    @Override
    public int compareTo(Object obj) {
        if(this==obj) return 0;
        if(this==null) return -1;
        if(this.getClass() != obj.getClass()) return 1;
        Ksiazka e = (Ksiazka) obj;
        int t = compareIgnoreCase(this.Wykonawca,e.Wykonawca);
        return t;

    }
}
