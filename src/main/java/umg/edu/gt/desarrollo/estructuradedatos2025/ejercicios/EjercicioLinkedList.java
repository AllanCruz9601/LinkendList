package umg.edu.gt.desarrollo.estructuradedatos2025.ejercicios;

import java.util.LinkedList;
import java.util.HashSet;
import java.util.Iterator;

public class EjercicioLinkedList {

    // Problema 1: Eliminar duplicados en una LinkedList<Integer>
    public static void eliminarDuplicados(LinkedList<Integer> lista) {
        HashSet<Integer> seen = new HashSet<>();
        Iterator<Integer> iter = lista.iterator();
        
        while (iter.hasNext()) {
            Integer num = iter.next();
            if (seen.contains(num)) {
                iter.remove();
            } else {
                seen.add(num);
            }
        }
    }

    // Problema 2: Invertir una LinkedList<String> sin usar otra lista
    public static void invertirLista(LinkedList<String> lista) {
        int n = lista.size();
        for (int i = 0; i < n / 2; i++) {
            String temp = lista.get(i);
            lista.set(i, lista.get(n - 1 - i));
            lista.set(n - 1 - i, temp);
        }
    }

    // Problema 3: Intercalar dos listas ordenadas en una nueva LinkedList<Integer>
    public static LinkedList<Integer> intercalarListas(LinkedList<Integer> lista1, LinkedList<Integer> lista2) {
        LinkedList<Integer> resultado = new LinkedList<>();
        int i = 0, j = 0;

        while (i < lista1.size() && j < lista2.size()) {
            if (lista1.get(i) <= lista2.get(j)) {
                resultado.add(lista1.get(i));
                i++;
            } else {
                resultado.add(lista2.get(j));
                j++;
            }
        }

        // Agregar los elementos restantes
        while (i < lista1.size()) {
            resultado.add(lista1.get(i));
            i++;
        }

        while (j < lista2.size()) {
            resultado.add(lista2.get(j));
            j++;
        }

        return resultado;
    }
}
