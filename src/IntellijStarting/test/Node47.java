package IntellijStarting.test;

public class Node47 extends ListItem47{
    public Node47(Object value) {
        super(value);
    }

    @Override
    ListItem47 next() {
        return rightLink;
    }

    @Override
    ListItem47 setNext(ListItem47 rightLink) {
        this.rightLink = rightLink;
        return rightLink;
    }

    @Override
    ListItem47 previous() {
        return leftLink;
    }

    @Override
    ListItem47 setPrevious(ListItem47 leftLink) {
        this.leftLink = leftLink;
        return leftLink;
    }

    @Override
    int compareTo(ListItem47 item){
        if (item != null) {
            return ((String) super.getValue()).compareTo((String) item.getValue());
        } else {
            return -1;
        }
    }
}
