package br.com.digitalhouse.colegio

class Professor(numeroDocente: String, nome: String, sobrenome: String): Pessoa(nome, sobrenome), Docente {
    override val registroDocente = numeroDocente

    override fun darAula() {
        println("Dando aula")
    }

    override fun fazerChamada() {
        println("Fazendo chamada")
    }
}