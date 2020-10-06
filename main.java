public class Main {

    public static void main(String[] args) {
        Ksiazka[] a =new Ksiazka[6];
        a[0] = new Ksiazka(1,"Sanchez","Ąww");
        a[1] = new Ksiazka(2,"Nowak","awee");
        a[2] = new Ksiazka(3,"Braum","bss");
        a[3] = new Ksiazka(4,"Klaus","ćww");
        a[4] = new Ksiazka(5,"Smith","bb");
        a[5]= new Ksiazka(6,"Kowal","zzz");
        Arrays.sort(a);
        for(Ksiazka c: a)
            System.out.println(c);
    }
}
