public class ListaCircularDuplamenteEncadeada<T> {
    private No<T> atual;

    public void adicionar(T valor) {
        No<T> novo = new No<>(valor);
        if (atual == null) {
            novo.proximo = novo;
            novo.anterior = novo;
            atual = novo;
        } else {
            No<T> ultimo = atual.anterior;

            novo.proximo = atual;
            novo.anterior = ultimo;
            atual.anterior = novo;
            ultimo.proximo = novo;
        }
    }

    public void navegarCircular(int passos) {
        if (atual == null) {
            System.out.println("Lista vazia.");
            return;
        }

        No<T> cursor = atual;
        int abs = Math.abs(passos);

        for (int i = 0; i < abs; i++) {
            System.out.println(cursor.getDado());
            cursor = passos > 0 ? cursor.proximo : cursor.anterior;
        }

        atual = cursor;
    }
}
