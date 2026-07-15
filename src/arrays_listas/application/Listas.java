package arrays_listas.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Listas {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<String> lista = new ArrayList<>();

        lista.add("Maria");
        lista.add("Alex");
        lista.add("Bob");
        lista.add("Anna");
        // filtrar a lista
        List<String> resultado   = lista.stream().filter(x ->x.charAt(0) == 'A').collect((Collectors.toList()));
        for (String x : resultado){
            System.out.println(resultado);
        }
        System.out.println("----------------------");
        //Inserir um novo elemento na posição (2);
        lista.add(2, "Marcos");
        //ver o tamanho da Lista
        System.out.println(lista.size());

        for (String x : lista) {
            System.out.println(x);
        }
        System.out.println("----------------------");
        // remover um elemento da lista
        lista.remove("Anna");
        lista.remove(1);
        lista.removeIf(x -> x.charAt(0)== 'M');

        // encontra a posição de um elemento
        System.out.println("Posição do Bob: " +lista.indexOf("Bob"));


        System.out.println("----------------------");
        for (String x : lista) {
            System.out.println(x);
        }


        sc.close();
    }
}
