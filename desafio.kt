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
    
    fun matricular(usuario: Usuario) {
        TODO("Utilize o parâmetro $usuario para simular uma matrícula (usar a lista de $inscritos).")
    }
}

fun main() {
    TODO("Analise as classes modeladas para este domínio de aplicação e pense em formas de evoluí-las.")
    TODO("Simule alguns cenários de teste. Para isso, crie alguns objetos usando as classes em questão.")
}
