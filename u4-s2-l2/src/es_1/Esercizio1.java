package es_1;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Esercizio1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci il numero di parole (N): ");
        int n = scanner.nextInt();

        scanner.nextLine();

        Set<String> paroleDistinte = new HashSet<>();
        Set<String> paroleDuplicate = new HashSet<>();

        System.out.println("Inserisci " + n + " parole:");
        for (int i = 0; i < n; i++) {
            System.out.print("Parola " + (i + 1) + ": ");
            String parola = scanner.nextLine();

            // Se l'aggiunta restituisce false, la parola è un duplicato
            if (!paroleDistinte.add(parola)) {
                paroleDuplicate.add(parola);
            }
        }

        System.out.println("\n--- Risultati ---");
        System.out.println("Parole duplicate: " + paroleDuplicate);
        System.out.println("Numero di parole distinte: " + paroleDistinte.size());
        System.out.println("Elenco delle parole distinte: " + paroleDistinte);

        scanner.close();
    }
}