package domain

class NoLista {
    private var valor : Double? = null
    private var proximo : NoLista? = null

    fun getValor() : Double?{
        return valor
    }
    fun setValor(valor: Double){
        this.valor = valor
    }
    fun getProximo() : NoLista?{
        return proximo
    }
    fun setProximo(proximo : NoLista){
        this.proximo = proximo
    }
}