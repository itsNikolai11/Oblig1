package no.nkopperudmoen;

import org.junit.Test;

import java.util.ArrayList;
import java.util.NoSuchElementException;

public class Oblig1 {
    /**
     * Nikolai Kopperudmoen, stud.nr s344169
     */

    public static void main(String[] args) {
        int[] a = {4, 3, 5, 1};
        int[] b = {1, 2, 4, 3};
        int[] c = {};
        System.out.println(maks(a));
        System.out.println(ombyttinger(a));
        System.out.println(ombyttinger(b));
        System.out.println(antallUlikeSortert(b));
    }

    /**
     * Oppgave 1
     */
    public static int maks(int[] a) {

        if (a.length == 0) {
            throw new NoSuchElementException("Arrayet inneholder ingen verdier!");
        }
        int maks = a[0];
        for (int i = 0; i < a.length - 1; i++) {
            int verdi = a[i];
            if (a[i] > a[i + 1]) {
                a[i] = a[i + 1];
                a[i + 1] = verdi;
            }
        }
        return a[a.length - 1];
    }

    public static int ombyttinger(int[] a) {
        int ombyttinger = 0;
        for (int i = 0; i < a.length - 1; i++) {
            int verdi = a[i];
            if (a[i] > a[i + 1]) {
                a[i] = a[i + 1];
                a[i + 1] = verdi;
                ombyttinger++;
            }
        }
        return ombyttinger;
    }
    /**
     * I tabellen a blir det flest ombyttinger når det største tallet kommer tidlig i tabellen.
     *
     */

    /**
     * Oppgave 2
     */
    public static int antallUlikeSortert(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] > a[i + 1]) {
                throw new IllegalStateException("Arrayet er ikke sortert i stigende rekkefølge.");
            }
        }
        ArrayList<Integer> antallUlike = new ArrayList<>();
        for (int value : a) {
            if (!antallUlike.contains(value)) {
                antallUlike.add(value);
            }
        }
        return antallUlike.size();
    }

    /**
     * Oppgave 3
     */
    public static int antallUlikeUsortert(int[] a) {
        ArrayList<Integer> antallUlike = new ArrayList<>();
        for (int value : a) {
            if (!antallUlike.contains(value)) {
                antallUlike.add(value);
            }
        }
        return antallUlike.size();
        //TODO finne en annen måte som ikke bruker hjelpetabell
    }

    /**
     * Oppgave 4
     */
    public static void delsortering(int[] a) {
        int value = a[0];
        int left = 0;
        int right = a.length - 1;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                //Tallet er et partall
            } else {
                //tallet er et oddetall

            }
        }

    }

    /**
     * Oppgave 5
     */
    public static void rotasjon(char[] a) {
        if (a.length == 0) {
            return;
        }
        char value = a[a.length - 1];
        for (int i = a.length - 1; i > 0; i--) {
            a[i] = a[i - 1];
            if (i == 1) {
                a[0] = value;
            }
        }
    }

    /**
     * Oppgave 7
     */
    public static String flett(String s, String t) {

        return s;
    }

    public static String flett(String... s) {

        return s.toString();
    }

}
