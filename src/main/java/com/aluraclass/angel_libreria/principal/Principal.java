package com.aluraclass.angel_libreria.principal;

import com.aluraclass.angel_libreria.model.DatoLibro;
import com.aluraclass.angel_libreria.model.Libro;
import com.aluraclass.angel_libreria.model.Mensaje;
//import com.aluraclass.angel_libreria.repository.LibroRepository;
import com.aluraclass.angel_libreria.service.ConsumoAPI;
import com.aluraclass.angel_libreria.service.ConvierteDatos;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class Principal {
    private Scanner teclado = new Scanner(System.in);
    private ConsumoAPI consumoAPI = new ConsumoAPI();
    private final String URL_BASE = "https://gutendex.com/books?";
    private ConvierteDatos convierteDatos = new ConvierteDatos();
    private List<DatoLibro> datoLibros = new ArrayList<>();
    //private LibroRepository repositorio;
    private List<Libro> libros;
    private Optional<Libro> libroBuscado;
    private Mensaje mensaje = new Mensaje();


    public Principal(LibroRepository repository){this.repositorio = repository; }

    public void muestraElMenu() {

        var opcion = -1;
        while (opcion != 0){
            Mensaje.menu();
            opcion = teclado.nextInt();
            teclado.nextLine();

            switch (opcion){
                case 1:
                    BuscarLibroPorTitulo();
                    break;
                case 2:
                case 3:
                case 4:
                case 5:
                case 0:
            }
        }
    }

    private DatoLibro getDatoLibro(){
        System.out.println("Escribe el titulo del libro que buscas ");
        var nombreLibro = teclado.nextLine();
        var json = consumoAPI.obtenerDatos(URL_BASE + nombreLibro.replace(" ", "+"));
        DatoLibro datos = convierteDatos.obtenerDatos(json, DatoLibro.class);
        System.out.println(datos);
        return datos;
    }
    private void BuscarLibroPorTitulo(){
        try {
            DatoLibro datoLibro = getDatoLibro();
            Libro libro = new Libro(datoLibro);
        }catch
    }



}
