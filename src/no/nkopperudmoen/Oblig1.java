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
        sort(a, 0, a.length - 1);

        /*if (a.length <= 1) {
            return;
        }
        int value;
        int left = 0;
        int right = a.length - 1;
        for (int i = 0; i < a.length; i++) {
            while (a[right] % 2 == 0) {
                right--;
            }
            while (a[left] % 2 == 1) {
                left++;
            }
            if (left < right) {
                value = a[left];
                a[left] = a[right];
                a[right] = value;
            }
        }*/
    }

    static void sort(int[] a, int left, int right) {
        if (left < right) {
            int pi = quicksortEO(a, left, right);
            sort(a, left, right - 1);
            sort(a, left + 1, right);
        }
    }

    static int quicksort(int[] a, int start, int end) {
        int pivot = a[end];
        int i = start - 1;
        for (int j = start; j < end; j++) {
            if (a[j] <= pivot) {
                i++;
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }
        int temp = a[i + 1];
        a[i + 1] = a[end];
        a[end] = temp;
        return i + 1;
    }

    static int quicksortEO(int[] a, int left, int right) {
        int pivot = a[right];
        int i = left - 1;
        for (int j = left; j < right; j++) {
            if (a[j] <= pivot) {
                i++;
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }
        int temp = a[i + 1];
        a[i + 1] = a[right];
        a[right] = temp;
        return i + 1;
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
        StringBuilder flettet = new StringBuilder();
        int i = 0, j = 0;
        while (i < s.length() && j < t.length()) {
            flettet.append(s.charAt(i));
            i++;
            flettet.append(t.charAt(j));
            j++;
        }
        while (i < s.length()) {
            flettet.append(s.charAt(i));
            i++;
        }
        while (j < t.length()) {
            flettet.append(t.charAt(j));
            j++;
        }
        return flettet.toString();
    }

    public static String flett(String... s) {


        return s.toString();
    }

}
