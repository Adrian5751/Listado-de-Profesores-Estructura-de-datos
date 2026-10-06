public class Main {
    public static void main(String[] args) {

        ListaProfesores lista = new ListaProfesores();

        lista.agregar(new Profesor("Ana", 30, "Instructor"));
        lista.agregar(new Profesor("Luis", 25, "Instructor"));
        lista.agregar(new Profesor("Pedro", 40, "Asistente"));
        lista.agregar(new Profesor("Maria", 35, "Auxiliar"));
        lista.agregar(new Profesor("Jose", 50, "Titular"));
        lista.agregar(new Profesor("Carla", 28, "Instructor"));

        System.out.println(lista.ProxCambio());
        System.out.println(lista.MostrarLista());
        System.out.println(lista.CantProfesores());

        ListaProfesores vacia = new ListaProfesores();
        System.out.println(vacia.ProxCambio());
        System.out.println(vacia.MostrarLista());
        System.out.println(vacia.CantProfesores());
    }
}
