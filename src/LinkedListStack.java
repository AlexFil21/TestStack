class LinkedListStack<T> {
    // внутренний класс, который представляет элемент списка
    private static class Node<T> {
        // данные
        private T data;
        // указатель на следующий элемент
        private Node<T> next;

        public Node(T data) {
            this.data = data;
        }

        @Override
        public String toString() {
            return data.toString();
        }
    }

    private Node<T> first;

    // используется для push операции
    public void push(T data) {
        Node<T> newFirst = new Node<>(data);
        newFirst.next = first;
        first = newFirst;
    }

    // используется для pop операции
    public T pop() {
        Node<T> oldFirst = first;
        first = first.next;
        return oldFirst.data;
    }

    @Override
    public String toString() {
        StringBuilder listBuilder = new StringBuilder();
        Node currentNode = first;
        while (currentNode != null) {
            listBuilder.append(currentNode).append(",");
            currentNode = currentNode.next;
        }
        return listBuilder.toString();
    }

    public boolean isEmpty() {
        return first == null;
    }

}