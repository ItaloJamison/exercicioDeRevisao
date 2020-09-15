package br.com.digitalhouse.colegio

class Professor(numeroDocente, nome, sobrenome): Pessoa(nome, sobrenome), Docente {
    override val registroDocente = numeroDocente

    override fun darAula() {
        println("Dando aula")
    }

    override fun fazerChamada() {
        println("Fazendo chamada")
    }
}