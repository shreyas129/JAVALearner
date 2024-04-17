package IntellijStarting.test;

public class MyLinkedList47 implements NodeList47 {
    private ListItem47 root;

    public MyLinkedList47(ListItem47 root) {
        this.root = root;
    }

    @Override
    public ListItem47 getRoot() {
        return root;
    }

    @Override
    public boolean addItem(ListItem47 item) {
        if (this.root == null) {
            this.root = item;
            return true;
        }
        ListItem47 currentItem = this.root;
        while (currentItem != null) {
            int compTemp = (currentItem.compareTo(item));
            if (compTemp < 0) {
                if (currentItem.next() != null) {
                    currentItem = currentItem.next();
                } else {
                    currentItem.setNext(item).setPrevious(currentItem);
                    return true;
                }
            } else if (compTemp > 0) {
                if (currentItem.previous() != null) {
                    currentItem.previous().setNext(item).setPrevious(currentItem.previous());
                    item.setNext(currentItem).setPrevious(item);
                } else {
                    item.setNext(this.root).setPrevious(item);
                    this.root = item;
                }
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    @Override
    public boolean removeItem(ListItem47 item) {
        if (item != null) {
            System.out.println("Deleting item " + item.getValue());
        }
        ListItem47 currentItem = this.root;
        while (currentItem != null) {
            int compIntItem = currentItem.compareTo(item);
            if (compIntItem == 0) {
                if (currentItem == this.root) {
                    this.root = currentItem.next();
                } else {
                    currentItem.previous().setNext(currentItem.next());
                    if (currentItem.next() != null) {
                        currentItem.next().setPrevious(currentItem.previous());
                    }
                }
                return true;
            } else if (compIntItem < 0) {
                currentItem = currentItem.next();
            } else {
                return false;
            }
        }
        return false;
    }

    @Override
    public void traverse(ListItem47 root) {
        if (root == null) {
            System.out.println("The list is empty");
            return;
        }
        while (root != null) {
            System.out.println(root.getValue());
            root = root.next();
        }
    }
}
