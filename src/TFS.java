import java.io.*;

public class TFS {

    private FileInputStream fileInputStream;
    private File file;
    private Directory root;
    public TFS(){
        //Array of 16 blocks with a capacity of 16 Bytes
        Block [] memory = new Block[16];
        root = new Directory('A', null);
        memory[0]=root.getBlock();
    }

    /**
     * addFile
     * Add a file to the TFS  if there is room in the TFS
     * isFull must be false and remaining space must be greater
     * than file size
     */
    public void addFile( String fileName){
        //TODO Add file to TFS

    }

    //Add Directory to Tiny File System
    public void addDirectory(char directoryName) {
        if(!(Character.isUpperCase(directoryName)&&Character.isLetter(directoryName))){
            throw new IllegalArgumentException("Directory Name Must Be a Single Uppercase Letter");
        }


    }

    //Return the current directory
    public String getDirectory(){
        String directory = "Current Directory";
        return directory;
    }

    /**
     * isFull
     * Checks to see of the TFS is full
     * Check if each block is empty
     * Utilize the is full method in the Block Class
     * @return boolean of whether or not the TFS is full
     */
    public boolean isFull(){

        return false;
    }

    public int getRemainingSpace(){
        int remainingSpace = 0;
        return remainingSpace;
    }

    public long getFileSize(String filename) throws IOException {
        long size = 0;
            file = new File(filename);
            byte[] fileBytes = new byte[(int) file.length()];
            size = file.length();
            fileInputStream = new FileInputStream(file);
            fileInputStream.read(fileBytes);
            System.out.println("File Bytes");
            for(byte b : fileBytes){
                System.out.println(b);
            }
            FileDescriptor fd = new FileDescriptor();
        return size;
    }

    public boolean validPath(String fileName) {
        return false;
    }
}


