public class TestarLista {
    public static void main(String[] args) {

        Lista lista = new Lista();

        lista.Imprimir();

        lista.InserirInicio(new No(10));
        lista.InserirInicio(new No(11));
        lista.InserirFim(new No(43));
        lista.InserirInicio(new No(12));
        lista.InserirInicio(new No(13));
        lista.InserirInicio(new No(14));
        lista.InserirFim(new No(9));
        lista.Inserir(new No(5),3);
        System.out.println("Removido: "+lista.Remover(5).getElemento());


        lista.Imprimir();
    }
}
