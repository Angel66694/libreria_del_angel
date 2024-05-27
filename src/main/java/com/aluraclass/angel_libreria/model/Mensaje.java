package com.aluraclass.angel_libreria.model;

public record Mensaje() {

    public static void menu() {
        String menu = """
            ********************************
            
            1)- Buscar libro por titulo:
            2)- Buscar libro por nombre de autor:
            3)- Buscar libros en un idioma particular: 
            4)- Buscar libros con mayor numero de descargas:
            5)- Buscar libros con menor numero de descargas:
            
            0)- Salir de la aplicacion!
            """;

        System.out.println(menu);
    }
}
