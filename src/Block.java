public class Block {
    private char directoryName;
    private byte [] block;

    public Block(){
        block = new byte[16];

    }

    public void addData(byte d) {
        for (int i = 0; i < block.length; i++) {
            if (block[i] == 0) {
                block[i]=d;
                break;
            }
        }
    }

    public void printBlock(){
        for (byte b : block) {
            System.out.println(b);
        }
    }


}
