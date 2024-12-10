package utilities

import java.util.*

//TODO: Implement methods
fun readSomething(){
    TODO()
}
fun iniciarScan (): Scanner {
    var scan : Scanner = Scanner (System.`in`).useLocale(Locale.UK)
    return scan
}
fun cerrarScan (scan:Scanner){
    scan.close()
}