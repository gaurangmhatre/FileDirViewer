import java.io.File;
import java.util.Date;

public class Helper implements IPrint{

    public String humanReadableByteCount(long bytes) {
        int unit = 1024;
        if (bytes < unit) return bytes + " B";
        int exp = (int) (Math.log(bytes) / Math.log(unit));
        String pre = ("KMGTPE").charAt(exp-1) + ("i");
        return String.format("%.1f %sB", bytes / Math.pow(unit, exp), pre);
    }

    public boolean freeMemoryChecker() {
        if(Runtime.getRuntime().freeMemory() >1024)
            return true;
        return false;
    }

    public void printDir(File file){
        System.out.println("Directory: " + file.getName());
    }

    public void printDirWithDetails(File file){
        System.out.println("Directory: " + file.getName()+"    Dir lastmodified: "+new Date(file.lastModified()));
    }

    public void printFile(File file){
        System.out.println("File: " + file.getName());
    }

    public void printFileWithDetails(File file){
        System.out.println("File: " + file.getName()+"        File Size: "+ humanReadableByteCount(file.length())+ "    File lastmodified: "+new Date(file.lastModified()));
    }
}
