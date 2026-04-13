class mergeKList {
    public Node mergeKLists(Node[] ar) {
        if(ar.length == 0) return null;
        ArrayList<Node> arr = new ArrayList<>();
        for(Node n : ar) arr.add(n);

        while(arr.size() > 1){
            Node a = arr.remove(arr.size() -1);
            Node b = arr.remove(arr.size() -1);
            Node c = merge(a,b);
            arr.add(c);
        }
        return arr.get(0);
    }
    public Node merge(Node head1, Node head2){
        Node i = head1;
        Node j = head2;
        Node d = new Node(-1);
        Node k = d;
        while (i != null && j != null){
            if(i.val <= j.val){
                k.next = i;
                i = i.next;
            }else{
                k.next = j;
                j = j.next;
            }
            k = k.next;
        }
        if(i==null) k.next = j;
        else k.next = i;
        return d.next;
    }
}