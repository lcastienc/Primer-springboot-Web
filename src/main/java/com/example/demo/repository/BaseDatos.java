package com.example.demo.repository;

import java.util.ArrayList;
import java.util.Iterator;

import com.example.demo.bean.Libro;

public class BaseDatos {
	
	ArrayList<Libro> libros = new ArrayList<Libro>();
	public BaseDatos() {
		libros.add(new Libro(1,"HARRY POTTER Y EL PRISIONERO DE AZKABAN","J.K ROWLING","SALAMANDRA","26/9/2006 0:00:00","INFANTIL"));
		libros.add(new Libro(2,"EL GRAN LABERINTO","FERNANDO SABATER PEREZ","ARIEL","26/9/2006 0:00:00","FICCION"));
		libros.add(new Libro(3,"ROMEO Y JULIETA","WILLIAM SHAKESPEARE","SALAMANDRA","26/9/2006 0:00:00","ROMANTICA"));
		libros.add(new Libro(4,"LA CARTA ESFERICA","ARTURO PEREZ LOPEZ","SALAMANDRA","29/9/2006 0:00:00","FICCION"));
		libros.add(new Libro(5,"CODIGO DA VINCI"," DAN BROWN","ARIEL","29/9/2006 0:00:00","FICCION"));
		libros.add(new Libro(6,"MUCHO RUIDO Y POCAS NUECES","WILLIAM SHAKESPEARE","SALAMANDRA","29/9/2006 0:00:00","ROMANTICA"));
		libros.add(new Libro(7,"PROTOCOLO","JOSE LOPEZ MURILLO","SALAMANDRA","6/9/2006 0:00:00","SOCIAL"));
		libros.add(new Libro(8,"LINUX","FERNANDO SABATER PEREZ","ARIEL","6//2006 0:00:00","INFORMATICA"));
		libros.add(new Libro(9,"EL TUMULTO","H.P LOVECRAFT","DEBATE","7/9/2006 0:00:00","CIENCIA"));	
		
	}
	
	public void inserta(Libro libro) {
		libros.add(libro);
	}
	
	public void borrar(int id) {
		Iterator<Libro> it = libros.iterator();
		while (it.hasNext()) {
			Libro li = it.next();
			if(li.getId()==id) {
				it.remove();
				break;
			}
		}
	}
	
	public void modifica(Libro libro) {
		Iterator<Libro> it = libros.iterator();
		while(it.hasNext()) {
			Libro li = it.next();
			if(li.getId()==libro.getId()) {
				li.setTitulo(libro.getTitulo());
				li.setAutor(libro.getAutor());
				li.setEditorial(libro.getEditorial());
				li.setFecha(libro.getFecha());
				li.setTematica(libro.getTematica());
				break;
			}
		}
	}
	
	public Libro getlibro(int id) {
		for(Libro libro : libros) {
			if(libro.getId()==id) {}
			return libro;
		}
		return null;
	}
	
	public ArrayList<Libro> getlibros() {
		return libros;
	}
	
	public void setLibros(ArrayList<Libro> libros) {
		this.libros = libros;
	}

}
