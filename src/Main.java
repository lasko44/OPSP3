import java.io.*;

public class Main
{


    public static void main(String[] args) throws java.io.IOException {

        String commandLine;
        BufferedReader console = new BufferedReader
                (new InputStreamReader(System.in));

        //Colors to make Terminal look nice
        final String GREEN = "\u001B[32m";
        final String RESET = "\u001B[0m";
        final String ERROR = "\u001B[31m";

        //Create a new Tiny File System
        TFS tfs = new TFS();

        //Welcome Message
        System.out.println("Welcome to the shell");
        System.out.println("Enter 'help' to see the list of commands");
        System.out.println();

        
        //Shell runs until the the user enters exit
        while (true) {
            //read the command
            System.out.print(RESET+"shell>");
            commandLine = console.readLine();
            String [] cmdArr = commandLine.split(" ");

            //if just a return, loop
            if (cmdArr[0].equals(""))
                continue;

            //help command
            else if (cmdArr[0].equals("help"))
            {

                System.out.println("------------------------------------------------------------------------------------------------------------------");
                System.out.println();
                System.out.println("Commands to use:");
                System.out.println(GREEN+"    import <Path>   "+RESET+"Copy a file stored in the regular file system to the current TFS-disk");
                System.out.println(GREEN+"    export <PATH>   "+RESET+"Copy a file stored in the current virtual disk to the regular file system");
                System.out.println(GREEN+"    cd [<TFS>]      "+RESET+"Change the current working directory of the TFS-disk");
                System.out.println(GREEN+"    display         "+RESET+"Show the raw contents of the TFS-disk");
                System.out.println(GREEN+"    open <Path>     "+RESET+"Open an existing TFS-disk file and closes the TFS-file currently in use");
                System.out.println(GREEN+"    create <PATH>   "+RESET+"create a new empty TFS-disk file");
                System.out.println(GREEN+"    mkdir <TFS>     "+RESET+"create a new directory in the TFS-disk");
                System.out.println(GREEN+"    exit            "+RESET+"exit the shell");
                System.out.println();
                System.out.println(RESET);
                System.out.println("-------------------------------------------------------------------------------------------------------------------");
                System.out.println();
            }

            else if(cmdArr[0].equals("import")){
                //Show Path
                String filePath = cmdArr[1];
                System.out.println("File Size: "+tfs.getFileSize(filePath));
                System.out.println(GREEN+"Enter a new valid file name (single lower case letter)");
                char fileName=console.readLine().charAt(0);
                System.out.println(fileName);
                System.out.println(RESET);
                //Check if there is enough space for the file
                //Message of success or failure
            }

            else if (cmdArr[0].equals("exit"))
            {
                System.out.println("...Terminating the Virtual Machine");
                //Finish Pending updates to the TFS disk
                System.out.println("..."+GREEN+"Done");
                System.exit(0);
            }

            else{
                System.out.println(ERROR+"Command Not Found!");
                System.out.println(RESET);
            }

        }
    }
}