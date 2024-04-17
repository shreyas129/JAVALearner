package IntellijStarting.test;

public abstract class ListItem47 {
    protected ListItem47 rightLink = null, leftLink = null;
    protected Object value;

    public ListItem47(Object value) {
        this.value = value;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }



     abstract ListItem47 next();
     abstract ListItem47 setNext(ListItem47 rightLink);
     abstract ListItem47 previous();
     abstract ListItem47 setPrevious(ListItem47 leftLink);
     abstract int compareTo(ListItem47 item);
}
