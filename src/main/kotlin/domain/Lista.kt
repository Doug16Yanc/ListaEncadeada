package domain

class Lista {
    private var cabeca : NoLista? = null

    fun add(valor : Double){
        var noLista = NoLista()
        noLista.setValor(valor)
        cabeca?.let { noLista.setProximo(it) }
        cabeca = noLista
    }

    override fun toString(): String {
        var sb = StringBuffer()
        sb.append("[")
        var p : NoLista?
        p = cabeca

        while (p != null){
            sb.append("${p.getValor()} ,")
            p = p.getProximo()
        }
        sb.append("]")
        return sb.toString()
    }

}