// Alteração dos nomes dos níveis dos cursos para ficar mais de acordo com o site da DIO
enum class Nivel { INICIANTE, INTERMEDIARIO, AVANCADO }

// Alteração para data class, inclusão das variáveis de usuário e a atribuição de um id automatizado para os usuários cadastrados
data class Usuario(val nome: String, val email: String) {
    companion object {
        var proximoId = 1
    }

    val id = "usuario${proximoId++}"
}

// Alteração de 'var' para 'val' em nome
data class ConteudoEducacional(val nome: String, val duracao: Int = 60)

// Inclusão da 'val' nivel da formação e da 'val' conteudo
data class Formacao(val nome: String, val conteudos: List<ConteudoEducacional>, val nivel: Nivel) {
    val inscritos = mutableListOf<Usuario>()
    val conteudo = conteudos
    
    // Inclusão da adição de inscritos
    fun matricular(usuario: Usuario) {
        inscritos.add(usuario)
    }

    // Inclusão da função para exibição do nível do curso
    fun exibirNivel() {
        println("O curso $nome possui nível $nivel")
    }

    // Inclusão da exibição do conteúdo e conversão da duração de minutos para horas 
    fun exibirConteudo() {
    println("Conteúdo do curso $nome:")
    conteudos.forEach {
        val horas = it.duracao / 60
        val minutos = it.duracao % 60
        println("- ${it.nome}, Duração: $horas horas e $minutos minutos")
    }
}

    // Inclusão da exibição dos inscritos
    fun exibirInscritos() {
        println("Usuários inscritos na formação $nome")
        inscritos.forEach { println(it) }
    }
}



fun main() {
    TODO("Analise as classes modeladas para este domínio de aplicação e pense em formas de evoluí-las.")
    TODO("Simule alguns cenários de teste. Para isso, crie alguns objetos usando as classes em questão.")
}
