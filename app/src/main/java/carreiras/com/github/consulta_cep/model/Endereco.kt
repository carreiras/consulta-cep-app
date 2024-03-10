package carreiras.com.github.consulta_cep.model

data class Endereco(
    val cep: String = "",
    val rua: String = "",
    val cidade: String = "",
    val bairro: String = "",
    val uf: String = ""
)