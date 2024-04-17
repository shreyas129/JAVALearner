package IntellijStarting.test;

public class SearchTree47 implements NodeList47{
    private ListItem47 root;

    public SearchTree47(ListItem47 root) {
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
            int compItem = (currentItem.compareTo(item));
            if (compItem < 0) {
                if (currentItem.next() != null) {
                    currentItem = currentItem.next();
                } else {
                    currentItem.setNext(item);
                    return true;
                }
            } else if (compItem > 0) {
                if (currentItem.previous() != null) {
                    currentItem = currentItem.previous();
                } else {
                    currentItem.setPrevious(item);
                    return true;
                }
            } else {
                System.out.println(item.getValue() + " is already present");
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
        ListItem47 parentItem = currentItem;
        while (currentItem != null) {
            int compItem = (currentItem.compareTo(item));
            if (compItem < 0) {
                parentItem = currentItem;
                currentItem = currentItem.next();
            } else if (compItem > 0) {
                parentItem = currentItem;
                currentItem = currentItem.previous();
            } else {
                performRemoval(currentItem, parentItem);
                return true;
            }
        }
        return false;
    }

    @Override
    public void traverse(ListItem47 root) {
        if (root != null) {
            traverse(root.previous());
            System.out.println(root.getValue());
            traverse(root.next());
        }
    }

    private void performRemoval(ListItem47 item, ListItem47 parent) {
        if (item.next() == null) {
            if (parent.next() == item) {
                parent.setNext(item.previous());
            } else if (parent.previous() == item) {
                parent.setPrevious(item.previous());
            } else {
                this.root = item.previous();
            }
        } else if (item.previous() == null) {
            if (parent.next() == item) {
                parent.setNext(item.next());
            } else if (parent.previous() == item) {
                parent.setPrevious(item.next());
            } else {
                this.root = item.next();
            }
        } else {
            ListItem47 current = item.next();
            ListItem47 leftParent = item;
            while (current.previous() != null) {
                leftParent = current;
                current = current.previous();
            }
            item.setValue(current.getValue());
            if (leftParent == item) {
                item.setNext(current.next());
            } else {
                leftParent.setPrevious(current.next());
            }
        }
    }
}
