public class main {
    public static void main(String[] args) {
        // Crear una pila de enteros
        pila<Integer> pilaEnteros = new pila<>();

        // Agregar elementos a la pila
        pilaEnteros.push(10);
        pilaEnteros.push(20);
        pilaEnteros.push(30);

        // Mostrar el tamaño de la pila
        System.out.println("Tamaño de la pila: " + pilaEnteros.size());

        // Mostrar el elemento en el tope de la pila
        System.out.println("Elemento en el tope: " + pilaEnteros.peek());

        // Sacar elementos de la pila
        System.out.println("Elemento sacado: " + pilaEnteros.pop());
        System.out.println("Elemento sacado: " + pilaEnteros.pop());

        // Mostrar el tamaño de la pila después de sacar elementos
        System.out.println("Tamaño de la pila después de sacar elementos: " + pilaEnteros.size());
    }
}
