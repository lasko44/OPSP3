public abstract class Entry {

    protected Directory parent;
    protected char name;

    public Entry(char n, Directory p) {
        name = n;
        parent=p;
    }

    public boolean delete(){
        if (parent == null) {
            return false;
        }
        return true;
    }
}
