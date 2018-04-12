import java.util.Scanner;

public class FileViewerClient {

    DepthFirstTraverse depthFirstTraverse;
    BreadthFirstTraverse breadthFirstTraverse;

    public static void main(String[] args) {
        new FileViewerClient().traverse();
    }

    public void traverse(){
        System.out.println("--File List viewer--");
        Scanner sc = new Scanner(System.in);
        int exit = 1;

        System.out.println("Enter the file url");
        String fileURL = sc.nextLine();
        System.out.println("Entered path: "+ fileURL);
        do{
            System.out.println();
            System.out.println("Enter mode DF(press-0) or BF(press-1)");
            int mode = sc.nextInt();
            if(mode<0 || mode>1)mode=0;
            System.out.println("Mode selected is "+ ((mode==0) ?"Depth First":"Breadth First"));

            System.out.println();
            System.out.println("Enter the detail level: NORMAL(press-0) or VERBOSE(press-1) ");
            int details = sc.nextInt();
            if(details<0 || details>1)details=0;
            System.out.println("Detail level "+ ((details==0) ?"NORMAL":"VERBOSE"));


            if(mode==0){
                depthFirstTraverse= new DepthFirstTraverse(fileURL);
                depthFirstTraverse.showFiles(details);
            }else{
                breadthFirstTraverse = new BreadthFirstTraverse(fileURL);
                breadthFirstTraverse.showFiles(details);
            }

            System.out.println("Press 0 to continue, else press any number!");
            exit = sc.nextInt();
        }while (exit==0);

    }
}
