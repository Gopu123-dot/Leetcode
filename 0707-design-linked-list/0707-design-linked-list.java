class MyLinkedList {
    class Node {
        int val;
        Node prev;
        Node next;
        Node(int val) {
            this.val=val;
            prev=null;
            next=null;
        }
    }
    Node head,tail;
    int c;
    public MyLinkedList() {
        head=tail=null;
        c=0;
    }
    
    public int get(int index) {
        Node temp=head;
        if(index<0 || index>=c)
        return -1;
        for(int i=0;i<index;i++) {
            temp=temp.next;
        } 
        return temp.val;
    }
    
    public void addAtHead(int val) {
        Node nn=new Node(val);
        if(head==null) {
            head=nn;
            tail=nn;
        }
        else {
            nn.next=head;
            head.prev=nn;
            head=nn;
        }
        c++;
    }
    
    public void addAtTail(int val) {
        Node nn=new Node(val);
        if(head==null) {
            head=nn;
            tail=nn;
        }
        else {
            tail.next=nn;
            nn.prev=tail;
            tail=nn;
        }
        c++;
    }
    
    public void addAtIndex(int index, int val) {
        if(index<0 || index>c) 
        return;
        Node nn=new Node(val);
        if(index==0) {
            addAtHead(val);
            return;
        }
        else if(index==c) {
            addAtTail(val);
            return;
        }
        else {
            Node temp=head;
            for(int i=0;i<index-1;i++) {
                temp=temp.next;
            }
            nn.next=temp.next;
            nn.prev=temp;
            temp.next.prev=nn;
            temp.next=nn;
        }
        c++;
    }
    
    public void deleteAtIndex(int index) {
        if(index<0 || index>=c)
        return;
        Node temp=head;
        if(index==0) {
            head=head.next;
            c--;
            if(head==null)
            tail=null;
            else {
                head.prev=null;
            }
        }
        else if(index==c-1) {
            c--;
            tail=tail.prev;
            if(tail==null) {
                head=null;
            }
            else {
                tail.next=null;
            }
        }
        else {
            for(int i=0;i<index-1;i++) {
                temp=temp.next;
            }
            Node del = temp.next;
            temp.next = del.next;
            del.next.prev = temp;   
            c--; 
        }
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */