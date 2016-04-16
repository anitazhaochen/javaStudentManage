package dlnu.zhaochen;

public class LinkList {
	Node first;
	Node last;
	int size = 0;
	public LinkList() {
	}
	
	private class Node {   //节点内部类
		Object item;
		Node next;
		Node prev;
		Node(Node prev , Object element,Node next) {
			this.item = element;
			this.next = next;
			this.prev = prev;
		}
	}

	public void linkFirst(Object o) {
		Node f =first;
		Node newNode = new Node(null ,o,f);
		first = newNode;
		if (f == null) 
			last = newNode;
		else
			f.prev = newNode;
		size++;
	}
	
	void linkLast(Object o) {
        final Node l = last;
        final Node newNode = new Node(l, o, null);
        last = newNode;
        if (l == null)
            first = newNode;
        else
            l.next = newNode;
        size++;
    }
	
	void linkBefore(Object e, Node succ) {
        
        final Node pred = succ.prev;
        final Node newNode = new Node(pred, e, succ);
        succ.prev = newNode;
        if (pred == null)
            first = newNode;
        else
            pred.next = newNode;
        size++;
    }
	
	public boolean contains(Object o) {
        return indexOf(o) != -1;
    }
	
	public void clear() {
        
        for (Node x = first; x != null; ) {
            Node next = x.next;
            x.item = null;
            x.next = null;
            x.prev = null;
            x = next;
        }
        first = last = null;
        size = 0;
    }
	
	public int indexOf(Object o) {
        int index = 0;
        if (o == null) {
            for (Node x = first; x != null; x = x.next) {
                if (x.item == null)
                    return index;
                index++;
            }
        } else {
            for (Node x = first; x != null; x = x.next) {
                if (o.equals(x.item))
                    return index;
                index++;
            }
        }
        return -1;
    }
	

	
	public Object unlink(Node x) {
		final Object element = x.item; 
		final Node next = x.next;
		final Node prev = x.prev;
		
		if (prev == null) {
			first = next;
		} else {
			prev.next = next;
			x.prev = null;
		}
		if (next == null) {
			last = prev;
		} else {
			next.prev = prev;
			x.next = null;
		}
		
		x.item = null;
		size--;
		return element;
	}
	
		public void delete(Object o) {
	       
	            for (Node x = first; x != null; x = x.next) {
	            	//Sop.sop(o.equals(x.item));
	                if (o.equals(x.item)) {
	                	unlink(x);
	                }
	           }
		}
	
	
		public Object find(Object obj) {
			for (Node x = first; x != null; x = x.next) {
                if (obj.equals(x.item)) {
                	
                   return x.item;
                }
			}
			return null;
		}
	
		

		public int size() {
			return size;
		}
		
		public void showObj() {
			Node p = first;
			while (p != null) {
				Sop.sop(p.item.toString());
				p = p.next;
			}
		}
		 public Object[] toArray() {
		        Object[] result = new Object[size];
		        int i = 0;
		        for (Node x = first; x != null; x = x.next)
		            result[i++] = x.item;
		        return result;
		    }

		

}

