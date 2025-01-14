package com.campusdual.classroom;

import java.util.Stack;

public class Exercise25 {
    public static Stack<String> createStack() {
        //creamos una coleccion de tipo pila y la poblamos
        Stack<String> customQueue = new Stack<>();

        customQueue.push("Smith");
        customQueue.push("Montessori");
        customQueue.push("Peralta");
        customQueue.push("House");

        return customQueue; //devolvemos la nueva coleccion
    }

    public static void printAndEmptyStack(Stack<String> stack) {
        //eliminamos cada elemento mientras la coleccion no este vacia
        System.out.println("\nElementos eliminados de la coleccion: ");
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }

    }

    public static void main(String[] args) {
        //creamos una nueva coleccion con el metodo correspondiente
        Stack<String> myCustomQueue = createStack();

        //se imprime por consola los elementos eliminados
        printAndEmptyStack(myCustomQueue);
    }

}
