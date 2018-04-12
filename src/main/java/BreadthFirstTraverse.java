import java.io.File;
import java.util.LinkedList;
import java.util.Queue;

class BreadthFirstTraverse implements ITraverse{
    private File[] files;
    private Queue<File> fileQueue;
    private Helper help;

    BreadthFirstTraverse(String filePath){
        files = new File(filePath).listFiles();
        fileQueue = new LinkedList<>();
        help= new Helper();
    }

    public void showFiles(int detail){
        showFiles(files,detail);
    }

    private void showFiles(File[] files,int detail){
        addToQueue(files);
        while(!fileQueue.isEmpty()){
            File file = fileQueue.remove();
            if (file.isDirectory()) {
                if(detail==0)
                    help.printDir(file);
                else
                    help.printDirWithDetails(file);
                addToQueue(file.listFiles());
            } else {
                if(detail==0)
                    help.printFile(file);
                else
                    help.printFileWithDetails(file);
            }
        }
        System.out.println();
    }

    private void addToQueue(File[] files){
        try{
            if(files!=null){
                for (File file : files) {
                    if(help.freeMemoryChecker())
                        fileQueue.add(file);
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
