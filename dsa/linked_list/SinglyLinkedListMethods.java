public class SinglyLinkedListMethods {

    private int length;
    private SinglyLinkedListNode head;

    public SinglyLinkedListMethods() {
        length =0;
    }


    //Return the head node of the list
    public synchronized SinglyLinkedListNode getHead(){
        return head;
    }
    
    //Insert node at beginning of the list
    public synchronized void insertAtBegin(SinglyLinkedListNode node){
        node.setNext(head);
        head = node;
        length++;
    }

    //Insert node at End of the list
    public synchronized void insertAtEnd(SinglyLinkedListNode node){
        if(head==null){
            head = node;
        }else{
            SinglyLinkedListNode temp;
            for(temp = head ; temp.getNext() != null; temp = temp.getNext()){
            }
            // we can also write for loop like this in this also for loop body is empty 
            // for(p = head ; p.getNext() != null; p=p.getNext());
            temp.setNext(node);
            
        }
        length++;
    }

    //Insert new int value at given position
    public void insertAtPosition(int data, int position){
        if(position < 0 || position > length){
            System.out.println("Invalid position");
            return;
        }

        if(head == null){
            head = new SinglyLinkedListNode(data);
        }else if(position == 0){
            SinglyLinkedListNode temp = new SinglyLinkedListNode(data);
            temp.setNext(head);
            head = temp;
        }else{
            SinglyLinkedListNode temp = head;
            for(int i=1;i<position;i++){
                temp=temp.getNext();
            }
            SinglyLinkedListNode newNode = new SinglyLinkedListNode(data);
            newNode.setNext(temp.getNext());
            temp.setNext(newNode);
        }
        length++;
    }

    //Remove and return the node at the head of the list
    public synchronized SinglyLinkedListNode removeFromBegin(){
        SinglyLinkedListNode node = head;
        if(node!= null){
            head = node.getNext();
            node.setNext(null);
        }
        length--;
        return node;
    }

    //Remove and return the node from end of the list
    public synchronized SinglyLinkedListNode removeFromEnd(){
        SinglyLinkedListNode p = head , q = null,next;
        if(head == null){
            return null;
        }
        
        //this below loop will return p pointing to last node and q pointing to second last node
        while((next = p.getNext())!= null){
            q = p;
            p = next;
        }
        if(q != null) {
            q.setNext(null);
        }else{
            //check if head next is null means only one node head in list, so, removing it
            head = null;
        }
        length--;
        return p;
    }

    //Remove matched node from the list
    public synchronized void removeMatched (SinglyLinkedListNode node){
        length--;
        if(head == null){
            return;
        }
        if(node.equals(head)){
            head = head.getNext();
            return;
        }
        SinglyLinkedListNode p=head, q;
        //q stores next node of p
        while((q=p.getNext())!=null){
            if(node.equals(q)){
                p.setNext(q.getNext());
                return;
            }
            //moving p to next node which is q
            p=q;
        }
    }

    //Remove the node at a given position
    public void removeByPosition(int position) {

        if(position < 0 || position >= length){
            System.out.println("Invalid position");
            return;
        }
        if(head == null){
            return;
        }
        if(position ==0){
            head = head.getNext();
            return;
        }else{
            SinglyLinkedListNode temp = head;
            for(int i =1; i<position;i++){
                temp =temp.getNext();
            }
            temp.setNext(temp.getNext().getNext());
        }
        length--;
    }

    //Remove Everything from list
    public void clearList(){
        head = null;
        length = 0;
    }

    //Return the current length of list
    public int getLength(){
        return length;
    }

    //Find the position of the first value that is equal to given value
    public int getPosition(int data){
        SinglyLinkedListNode temp =head;
        int position =0;
        while (temp!=null){
            if(temp.getData()==data){
                return position;
            }
            position++;
            temp = temp.getNext();
        }
        System.out.println("data is not present in list");
        return  0;
    }
    //Return a string representation of collection
    public String listToString(){
        String result = "[";
        if(head == null){
            return result +"]";
        }
        result =result +head.getData();
        SinglyLinkedListNode temp =head.getNext();
        while(temp!=null){
            result =result +" , " +temp.getData();
            temp = temp.getNext();
        }
        return result +"]";
    }

}
