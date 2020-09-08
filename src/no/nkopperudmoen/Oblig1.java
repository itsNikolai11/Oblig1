package no.nkopperudmoen;

import java.util.ArrayList;
import java.util.NoSuchElementException;

public class Oblig1 {

    /**
     * Nikolai Kopperudmoen, stud.nr s344169
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
        int left = 0;
        int right = a.length - 1;
        for (int i = 0; i < a.length; i++) {
            while (a[right] % 2 == 0) {
                right--;
            }
            while (a[left] % 2 != 0) {
                left++;
            }
            if (left < right) {
                int temp = a[left];
                a[left] = a[right];
                a[right] = temp;
            }
        }
        left = 0;
        right = a.length - 1;
        int pivot = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                left = i;
                pivot = i;
                break;
            }
        }
        if (pivot == 0) {
            return;
        }
        while (left <= right) {
            if (a[left] > a[right]) {
                int temp = a[right];
                a[right] = a[left];
                a[left] = temp;
            }
            right--;
        }
        right = pivot - 1;
        left = 0;
        while (left <= right) {
            if (a[left] > a[right]) {
                int temp = a[right];
                a[right] = a[left];
                a[left] = temp;
            }
            left++;
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
        StringBuilder flettet = new StringBuilder();

        for (int b = 0; b < 8; b++) {
            for (String value : s) {
                if (!(value.length() <= b)) {
                    flettet.append(value.charAt(b));
                }


            }
        }
        System.out.println(flettet.toString());
        return flettet.toString();
    }

}
