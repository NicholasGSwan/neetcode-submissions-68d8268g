/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
		if(head == null){
			return head;
		}
		Node curr = head;
		Node currCopy = new Node(curr.val);
		Map<Node,Node> m = new HashMap<>();
		m.put(curr, currCopy);


		while(curr != null && curr.next != null){
			currCopy.next = new Node(curr.next.val);
			m.put(curr.next, currCopy.next);
			
			currCopy = currCopy.next;
			curr = curr.next;
		}
		curr = head;
		currCopy = m.get(curr);


		while(curr != null) {
			if(curr.random != null) {
				
				currCopy.random = m.get(curr.random);
			}
			curr = curr.next;
			currCopy = currCopy.next;
		}		
		return m.get(head);
    }
}
