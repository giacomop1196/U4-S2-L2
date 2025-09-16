package es_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Esercizio2 {

    /** Crea e restituisce una lista ordinata di N interi casuali da 0 a 100. */

    public static List<Integer> creaListaOrdinata(int n) {
        List<Integer> lista = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            lista.add(random.nextInt(101));
        }
        Collections.sort(lista);
        return lista;
    }

    /** Restituisce una nuova lista composta dalla lista originale e dai suoi elementi in ordine inverso. */
    public static List<Integer> creaListaSpeculare(List<Integer> originalList) {
        List<Integer> speculareList = new ArrayList<>(originalList);
        List<Integer> reversedList = new ArrayList<>(originalList);
        Collections.reverse(reversedList);
        speculareList.addAll(reversedList);
        return speculareList;
    }

    /** Stampa gli elementi di una lista in base a un booleano (pari se true, dispari se false). */
    public static void stampaElementiCondizionale(List<Integer> list, boolean pari) {
        System.out.print("Elementi in posizioni " + (pari ? "pari" : "dispari") + ": ");
        for (int i = 0; i < list.size(); i++) {
            if (pari) {
                if (i % 2 == 0) {
                    System.out.print(list.get(i) + " ");
                }
            } else {
                if (i % 2 != 0) {
                    System.out.print(list.get(i) + " ");
                }
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Inserisci il numero di elementi (N) per le liste: ");
        int n = scanner.nextInt();

        // 1. Creazione e stampa della lista ordinata
        List<Integer> listaOrdinata = creaListaOrdinata(n);
        System.out.println("\nLista ordinata: " + listaOrdinata);

        // 2. Creazione e stampa della lista speculare
        List<Integer> listaSpeculare = creaListaSpeculare(listaOrdinata);
        System.out.println("Lista speculare: " + listaSpeculare);

        // 3. Stampa condizionale
        System.out.println();
        stampaElementiCondizionale(listaSpeculare, true);
        stampaElementiCondizionale(listaSpeculare, false);

        scanner.close();
    }
}