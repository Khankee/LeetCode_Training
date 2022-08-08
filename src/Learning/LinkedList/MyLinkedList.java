package Learning.LinkedList;

public class MyLinkedList {
    private SinglyListNode head;
    public MyLinkedList(){
        head = null;
    }

    private SinglyListNode getNode(int index){
        SinglyListNode cur = head;
        for(int i = 0; i < index && cur != null; i++){
            cur = cur.next;
        }
        return cur;
    }

    private SinglyListNode getTail(){
        SinglyListNode cur = head;
        while(cur != null && cur.next != null){
            cur = cur.next;
        }
        return cur;
    }

    public int get(int index){
        SinglyListNode cur = getNode(index);
        return cur == null ? -1 : cur.val;
    }
}
