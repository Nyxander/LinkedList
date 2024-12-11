import org.w3c.dom.NodeList;

public class LinkedList {
        Node head;
        LinkedList() {
            this.head = null;
        }
        void insertEnd(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
            } else {
                Node current = head;
                while (current.next != null) {
                    current = current.next;
                }
                current.next = newNode;
            }
        }
       void kategorizo() {
            if (head == null) {
                System.out.println("Lista është bosh.");
                return;
            }

            LinkedList evenList = new LinkedList();
            LinkedList oddList = new LinkedList();

            Node current = head;

            while (current != null) {
                if (current.data % 2 == 0) {
                    evenList.insertSorted(current.data);
                } else {
                    oddList.insertSorted(current.data);
                }
                current = current.next;
            }

            System.out.println("Lista e numrave çift:");
            evenList.printList();
            System.out.println("Lista e numrave tek:");
            oddList.printList();
        }

    void insertSorted(int data) {
        Node newNode = new Node(data);
        if (head == null || head.data >= newNode.data) {
            newNode.next = head;
            head = newNode;
        } else {
            Node current = head;
            if(current.next.data < newNode.data) {
                current = current.next;
            }
            newNode.next = current.next;
            current.next = newNode;
        }
    }
        void printList() {
            Node current = head;
            while (current != null) {
                System.out.print(current.data + " ");
                current = current.next;
            }
            System.out.println();
        }
}
