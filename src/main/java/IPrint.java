import java.io.File;
import java.util.Date;

public interface IPrint {
    void printDir(File file);
    void printDirWithDetails(File file);
    void printFile(File file);
    void printFileWithDetails(File file);
}
