public class ListaProfesores {

    private Nodo cabeza;
    private int size;

    public ListaProfesores() {
        this.cabeza = null;
        this.size = 0;
    }

    public void agregar(Profesor p) {
        Nodo nuevo = new Nodo(p);
        if (cabeza == null) {
            cabeza = nuevo;
        } else {
            Nodo actual = cabeza;
            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }
            actual.siguiente = nuevo;
        }
        size++;
    }

    public String ProxCambio() {
        String resultado = "";
        Nodo actual = cabeza;

        while (actual != null) {
            Profesor p = actual.dato;
            if (p.getCategoria().equalsIgnoreCase("Instructor") && p.getEdad() > 26) {
                resultado += p.getNombre() + "\n";
            }
            actual = actual.siguiente;
        }

        if (resultado.equals("")) {
            return "No hay profesores proximos a cambiar de categoria.";
        }
        return resultado;
    }

    public String MostrarLista() {
        if (cabeza == null) {
            return "La lista esta vacia.";
        }

        Profesor[] arreglo = new Profesor[size];
        Nodo actual = cabeza;
        int i = 0;
        while (actual != null) {
            arreglo[i] = actual.dato;
            actual = actual.siguiente;
            i++;
        }

        for (int a = 0; a < size - 1; a++) {
            for (int b = 0; b < size - 1 - a; b++) {
                if (arreglo[b].getEdad() < arreglo[b + 1].getEdad()) {
                    Profesor temp = arreglo[b];
                    arreglo[b] = arreglo[b + 1];
                    arreglo[b + 1] = temp;
                }
            }
        }

        String resultado = "";
        for (int a = 0; a < size; a++) {
            resultado += arreglo[a].toString() + "\n";
        }
        return resultado;
    }

    public String CantProfesores() {
        int instructores = 0;
        int asistentes = 0;
        int auxiliares = 0;
        int titulares = 0;

        Nodo actual = cabeza;
        while (actual != null) {
            String cat = actual.dato.getCategoria();
            if (cat.equalsIgnoreCase("Instructor")) instructores++;
            else if (cat.equalsIgnoreCase("Asistente")) asistentes++;
            else if (cat.equalsIgnoreCase("Auxiliar")) auxiliares++;
            else if (cat.equalsIgnoreCase("Titular")) titulares++;
            actual = actual.siguiente;
        }

        return "Instructores: " + instructores + "\n" +
               "Asistentes: " + asistentes + "\n" +
               "Auxiliares: " + auxiliares + "\n" +
               "Titulares: " + titulares;
    }

    public int size() { return size; }
          }
