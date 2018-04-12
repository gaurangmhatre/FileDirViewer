import java.io.File;

class DepthFirstTraverse implements ITraverse {
    private Helper help;
    private File[] files;

    DepthFirstTraverse(String filePath){
        files = new File(filePath).listFiles();
        help= new Helper();
    }

    public void showFiles(int detail){
        showFiles(files,detail);
    }

    private void showFiles(File[] files, int detail) {
        if(files!=null) {
            for (File file:files) {
                if (file != null) {
                    if (file.isDirectory()) {
                        if (detail == 0)
                            help.printDir(file);
                        else
                            help.printDirWithDetails(file);

                        showFiles(file.listFiles(), detail);
                    } else {
                        if (detail == 0)
                            help.printFile(file);
                        else
                            help.printFileWithDetails(file);
                    }
                }
            }
        }
    }
}
