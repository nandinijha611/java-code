public class SinglyLinkedListNode {
       private int data;
        private SinglyLinkedListNode next;

        public SinglyLinkedListNode(int data){
            this.data = data;
            //while creating object(node) by constructor it is setting next =null and data =0 as default
        }

        public void setData(int data){
            this.data = data;
        }

        public int getData(){
            return data;
        }

        public void setNext(SinglyLinkedListNode next){
            this.next =next;
        }

        public SinglyLinkedListNode getNext(){
            return next;
        }

}
