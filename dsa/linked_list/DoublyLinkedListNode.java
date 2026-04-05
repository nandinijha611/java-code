public class DoublyLinkedListNode {
    private int data;
    private DoublyLinkedListNode prev;
    private DoublyLinkedListNode next;

    public DoublyLinkedListNode(int data){
        this.data = data;
        // this.prev and this.next are automatically null
    }

    public DoublyLinkedListNode(int data, DoublyLinkedListNode prev, DoublyLinkedListNode next){
        this.data = data;
        this.prev = prev;
        this.next = next;        
    }

    public void setData(int data){
        this.data = data;
    }

    public int getData(){
        return data;
    }

    public void setPrev(DoublyLinkedListNode prev){
        this.prev = prev;
    }

    public DoublyLinkedListNode getPrev(){
        return prev;
    }

    public void setNext(DoublyLinkedListNode next){
        this.next = next;
    }

    public DoublyLinkedListNode getNext(){
        return next;
    }

}
