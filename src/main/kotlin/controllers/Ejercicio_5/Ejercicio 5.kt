package controllers.Ejercicio_5




fun menu2(eleccion : Int){
    when(eleccion){
        1 -> push() ; menu()
        2 -> pop() ; menu()
        3 -> mostrar() ; menu()
        4 -> salir()
        else -> {
            println("Opcion invalida")
            menu(eleccion)
        }
    }
}