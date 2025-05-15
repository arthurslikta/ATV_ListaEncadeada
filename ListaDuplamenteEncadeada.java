public class ListaDuplamenteEncadeada<T> {
    private No<T> inicio;
    private No<T> fim;

    public void adicionarInicio(T valor) {
        No<T> novo = new No<>(valor);
        if (inicio == null) {
            inicio = fim = novo;
        } else {
            novo.proximo = inicio;
            inicio.anterior = novo;
            inicio = novo;
        }
    }

    public void adicionarFim(T valor) {
        No<T> novo = new No<>(valor);
        if (fim == null) {
            inicio = fim = novo;
        } else {
            fim.proximo = novo;
            novo.anterior = fim;
            fim = novo;
        }
    }

    public void removerInicio() {
        if (inicio == null) return;
        if (inicio == fim) {
            inicio = fim = null;
        } else {
            inicio = inicio.proximo;
            inicio.anterior = null;
        }
    }

    public void removerFim() {
        if (fim == null) return;
        if (inicio == fim) {
            inicio = fim = null;
        } else {
            fim = fim.anterior;
            fim.proximo = null;
        }
    }

    public void exibirInicioFim() {
        No<T> atual = inicio;
        while (atual != null) {
            System.out.print(atual.getDado());
            if (atual.proximo != null) System.out.print(" <-> ");
            atual = atual.proximo;
        }
        System.out.println();
    }

    public void exibirFimInicio() {
        No<T> atual = fim;
        while (atual != null) {
            System.out.print(atual.getDado());
            if (atual.anterior != null) System.out.print(" <-> ");
            atual = atual.anterior;
        }
        System.out.println();
    }
}
