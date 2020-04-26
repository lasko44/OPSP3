import java.util.ArrayList;
public class Directory extends Entry{
    //TODO Implement Class
    protected Entry [] contents;
    private Block block;

    /**
     * Create a new directory if p is null it is
     * the root directory
     * @param n must be uppercase
     * @param p the parent directory
     */
    public Directory(char n, Directory p) {
        super(n,p);
        contents = new Entry[10];
        block = new Block();

    }

    public Block getBlock(){
        return block;
    }

    public void addFile(){

    }

    public void addSubdirectory(){

    }
}
