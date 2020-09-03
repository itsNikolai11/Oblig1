package no.nkopperudmoen;

public class Main {

    public static void main(String[] args) {
        int[] a = {4, 3, 2, 1};
        int[] b = {5,2,8,10,1,1};
        System.out.println(maks(b));
    }

    //Oppgave 1
    public static int maks(int[] a) {
        int maks = a[0];
        for (int i = 0; i < a.length-1; i++) {
            int verdi = a[i];
            if (a[i] > a[i + 1]) {
                a[i] = a[i + 1];
                a[i + 1] = verdi;
            }
        }
        return a[a.length - 1];
    }
}
