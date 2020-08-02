package arrays.usingObject;

public class VetorObjectGenerics<T> {


    public Object[] elems;
    private int tamanho;

    public VetorObjectGenerics(int cap) {
        this.elems = (T[]) new Object[cap];
        this.tamanho = 0;
    }

    public void adiciona(T elem) throws Exception {
        int cap = this.elems.length;

        this.aumentaCap();
        if(this.tamanho < cap) {
            this.elems[this.tamanho] = elem;
            this.tamanho++;
        } else {
            throw new Exception("Não é possivel exceder o tamanho do array");
        }
    }

    public boolean adiciona(int posicao, T elem) {

        this.aumentaCap();

        verificaPosicaoValida(posicao);

        for(int i=this.tamanho-1; i>=posicao; i--){
            this.elems[i+1] = this.elems[i];

        }
        this.elems[posicao] = elem;
        this.tamanho++;

        return  true;
    }

    public int tamanho() {
        return this.tamanho;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for(int i=0; i<tamanho-1; i++) {
            sb.append(this.elems[i]);
            sb.append(", ");
        }
        if(this.tamanho > 0) {
            sb.append(this.elems[this.tamanho-1]);
        }
        sb.append("]");

        return sb.toString();
    }

    public Object buscaElemento(int posicao){

        verificaPosicaoValida(posicao);

        return this.elems[posicao];
    }

    public int busca(T elem){
        //algoritmo de busca sequencial
        for(int i=0; i<this.tamanho; i++) {
            if(this.elems[i].equals(elem)) {
                return i;
            }
        }
        return -1;
    }

    private void aumentaCap(){
        if(this.tamanho == this.elems.length) {
            Object[] newElems = (T[]) new Object[this.elems.length * 2];
            for(int i=0; i<this.tamanho; i++){
                newElems[i] = this.elems[i];
            }
            this.elems = newElems;
        }
    }

    public boolean verificaPosicaoValida(int posicao){
        if(!(posicao >=0  && posicao < tamanho)){
            throw new IllegalArgumentException("Posição inválida");
        }
        return true;
    }

    public void remover(int posicao) {
        verificaPosicaoValida(posicao);

        for(int i = posicao; i<tamanho-1; i++){
            this.elems[i] = this.elems[i+1];
        }
        this.tamanho--;

    }
}
