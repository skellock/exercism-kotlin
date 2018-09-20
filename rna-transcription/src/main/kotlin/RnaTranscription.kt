// lulz
val G = 'G'
val C = 'C'
val T = 'T'
val A = 'A'
val U = 'U'

// experimenting with extension functions
fun Char.toRna() =
    when (this) {
        G -> C
        C -> G
        T -> A
        A -> U
        else -> this
    }

fun transcribeToRna(dna: String) =
    dna.map { it.toRna() }.joinToString("")
