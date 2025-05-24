
package org.arbol_desicion;

import java.util.HashMap;   
import java.util.Map;
import java.util.Scanner;

public class arbol {
    Nodo root;
    public arbol(){
    root = construirArbol();
}
public void Menu(){
    /*
        Scanner scanner = new Scanner(System.in);
        Map<String, String> map = new HashMap<>();
        System.out.println(" Respuesta si[1] no[2]:");
        System.out.print("¿Tienes fiebre? ");
        String respuesta = scanner.nextLine();
        System.out.println("El respuesta es: " + respuesta);
        map.put("fiebre", respuesta);
        System.out.print("¿Tienes tos? ");
        respuesta = scanner.nextLine();
        map.put("tos", respuesta);
        System.out.print("¿Tienes dolor de garganta? ");
        respuesta = scanner.nextLine();
        map.put("dolor_garganta", respuesta);
        System.out.print("¿Tienes dificultad para respirar? ");
        respuesta = scanner.nextLine();
        map.put("dificultad_respirar", respuesta);
        System.out.print("¿Tienes fatiga? ");
        respuesta = scanner.nextLine();
        map.put("fatiga", respuesta);
        System.out.print("¿Tienes Perdida reciente del sentido del gusto o del olfato? ");
        respuesta = scanner.nextLine();
        map.put("Perdida_reciente_del_sentido_del_gusto_o_del_olfato", respuesta);
        System.out.print("¿Tienes Secrecion o congestion nasal? ");
        respuesta = scanner.nextLine();
        map.put("Secrecion_o_congestion_nasal", respuesta);
        System.out.print("¿Tienes Dolores musculares? ");
        respuesta = scanner.nextLine();
        map.put("Dolores_musculares", respuesta);
        System.out.print("¿Tienes Cansancio? ");
        respuesta = scanner.nextLine();
        map.put("Cansancio", respuesta);
        System.out.print("¿Tienes Dolor de cabeza? ");
        respuesta = scanner.nextLine();
        map.put("Dolor_de_cabeza", respuesta);
        String resultado = root.classify(map);
        
        System.out.println("El resultado es: " + resultado);*/
    }
    public static void main(String[] args) 
    {
        arbol ob=new arbol();
        ob.Menu();
    }
    private static Nodo construirArbol() 
    {
        Nodo root = new Nodo("fiebre");
        Nodo nodo1 = new Nodo("tos");
        Nodo nodo2 = new Nodo("fatiga");
        Nodo nodo3 = new Nodo("dolor_garganta");
        Nodo nodo4 = new Nodo("dificultad_respirar");
        Nodo nodo5 = new Nodo("Perdida_reciente_del_sentido_del_gusto_o_del_olfato");
        Nodo nodo6 = new Nodo("Secrecion_o_congestion_nasal");
        Nodo nodo7 = new Nodo("Dolores_musculares");
        Nodo nodo8 = new Nodo("Cansancio");
        Nodo nodo9 = new Nodo("Dolor_de_cabeza");
        Nodo hojaNodo1 = new Nodo(null);
        hojaNodo1.setEtiqueta("Resfriado");
        Nodo hojaNodo2 = new Nodo(null);
        hojaNodo2.setEtiqueta("Gripe");
        Nodo hojaNodo3 = new Nodo(null);
        hojaNodo3.setEtiqueta("COVID-19");
        Nodo hojaNodo4 = new Nodo(null);
        hojaNodo4.setEtiqueta("Asma");
        Nodo hojaNodo5 = new Nodo(null);
        hojaNodo5.setEtiqueta("Amigdalitis");
        root.agregar("Si", hojaNodo2);
        root.agregar("Si", nodo3);
        root.agregar("Si", nodo5);
        root.agregar("No", nodo2);
        nodo1.agregar("Si", nodo5);
        nodo1.agregar("No", nodo2);
        nodo2.agregar("Si", hojaNodo4);
       //nodo2.agregar("Si", hojaNodo5);
        nodo2.agregar("No", nodo3);
        nodo3.agregar("Si", hojaNodo5);
        nodo3.agregar("No", hojaNodo3);
        nodo4.agregar("Si", hojaNodo4);
        nodo4.agregar("No", hojaNodo2);
        nodo5.agregar("Si", hojaNodo3);
        nodo5.agregar("No", nodo6);
        nodo6.agregar("Si", nodo2);
        nodo6.agregar("No", nodo8);
        nodo7.agregar("Si", nodo8);
        nodo7.agregar("No", nodo9);
        nodo8.agregar("Si", hojaNodo3);
        nodo8.agregar("Si", hojaNodo4);
        nodo8.agregar("No", nodo2);
        nodo9.agregar("Si", hojaNodo1);
        nodo9.agregar("No", nodo7);
        return root;
    }
}