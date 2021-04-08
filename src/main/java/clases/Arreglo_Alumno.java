package clases;

import java.util.ArrayList;

public class Arreglo_Alumno {

    private ArrayList<Alumno> lista;

    public Arreglo_Alumno() {

        lista = new ArrayList();

        lista.add(new Alumno("Juan", 12, 16));  //p=0
        lista.add(new Alumno("Ana", 8, 17));    //p=1
        lista.add(new Alumno("Luis", 14, 10));
        lista.add(new Alumno("Jose", 10, 13));
    }

    // Adicionar un alumno
    public void adicion(Alumno a) {

        lista.add(a);
    }

    // Para obtener la lista
    public ArrayList<Alumno> listado() {

        return lista;
    }

    public Alumno busca(int cod) {

        for (Alumno x : lista) {

            if (x.getCoda() == cod) {
                return x;
            }

        }

        return null;

    }

}
