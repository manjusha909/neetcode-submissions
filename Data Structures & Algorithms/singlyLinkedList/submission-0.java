class Node {
    int val;
    Node next;

    public Node(int val) {
        this.val = val;
        this.next = null;
    }
}
class LinkedList{

    private Node head;

    public LinkedList(){
        head = null;
    }

    public int get(int i) {
        Node curr = head;
        int index = 0;
        while(curr!=null){
            if(index == i){
                return curr.val;
            }
            curr = curr.next;
            index ++;
        }
        return -1;
    }

    public void insertHead(int val) {
        Node newNode = new Node(val);
        newNode.next = head;
        head = newNode;
    }

    public void insertTail(int val) {
          Node newNode = new Node(val);
          if(head == null){
            head = newNode;
            return;
          }
          Node curr = head;
          while(curr.next != null){
            curr = curr.next;
          }
          curr.next = newNode;
    }

    public boolean remove(int i) {
        if(head == null){
            return false;
        }
        if(i == 0){
            head = head.next;
            return true;
        }
        Node curr = head;
        int index = 0;
        while(curr != null && index < i - 1){
            curr = curr.next;
            index ++;
        }
        if(curr == null || curr.next == null){
            return false;
        }
        curr.next = curr.next.next;
        return true;
    }

    public List<Integer> getValues() {
        List<Integer> values = new ArrayList<>();
        Node curr = head;
        while (curr != null) {
            values.add(curr.val);
            curr = curr.next;
        }
        return values;
    }
}