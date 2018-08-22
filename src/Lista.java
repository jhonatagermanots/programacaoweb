public class Lista {

    private No inicio;
    private No fim;
    private int quantidade;

    //Criar a lista
    public Lista() {
        this.inicio = null;
        this.quantidade = 0;
    }

    //Verifica se a lista esta vazia
    public boolean isVazia() {
        return this.inicio == null;
    }

    public void InserirInicio(No no) {
        if (isVazia()) {
            this.inicio = no;
        } else {
            no.setProximo(this.inicio);
            this.inicio = no;
        }
        this.quantidade++;
    }

    public void Imprimir() {
        if (isVazia()) {
            System.out.println("Lista vazia");
        } else {
            No aux = inicio;
            while (aux != null) {
                System.out.println(aux.getElemento());
                aux=aux.getProximo();

            }
            System.out.println("Quatidade: "+this.quantidade);
        }
    }


    public  No remover(int posicao){
        No aux = null;
        if(!isVazia() && posicao >=1 && posicao <= quantidade){
            aux = inicio;
            if(posicao == 1){
                inicio = aux.getProximo();
                if(inicio != null)
                    inicio.setAnterior(null);}
                    else if(posicao == quantidade){
                        aux = fim;
                        fim = fim.getAnterior();
                        fim.setProximo(null);}
                        else{
                            for(int i = 1; i < posicao; i++){
                                aux = aux.getProximo();
                            }
                        aux.getAnterior().setProximo(aux.getProximo());
                        aux.getProximo().setAnterior(aux.getAnterior());


            }
            aux.setProximo(null);
            aux.setAnterior(null);
            quantidade --;
        }
        return aux;
    }


    public void InserirFim(No no){
        if (isVazia()) {
            this.inicio = no;
        } else {
            No aux =this.inicio;
            while (aux.getProximo() != null){
                aux= aux.getProximo();
            }
            aux.setProximo(no);
        }
        this.quantidade++;
    }

    public void Inserir(No no, int posicao){
        if(isVazia() || posicao <= 1){
            this.InserirInicio(no);
        } else if (posicao > quantidade){
            this.InserirFim(no);
        } else{
            No aux = this.inicio;
            No anterior = null;

            for (int i =1; i < posicao; i++){
                anterior = aux;
                aux = aux.getProximo();
            }
            no.setProximo(anterior.getProximo());
            anterior.setProximo(no);
        }
    }

    public No Remover(int posicao){
         No aux = null;

         if(!isVazia()) {
             aux = this.inicio;
             No anterior = null;
             if (posicao == 1) {
                 this.inicio = this.inicio.getProximo();
                 this.quantidade--;
             } else if (posicao <= this.quantidade) {
                 for (int i = 1; i < posicao; i++) {
                     anterior = aux;
                     aux = aux.getProximo();
                 }
                 anterior.setProximo(aux.getProximo());
                 aux.setProximo(null);
                 this.quantidade--;
             }
         }
         return aux;
    }

}