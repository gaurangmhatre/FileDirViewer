# FileDirViewer

* Print out all file and directory names </br>
* Print out all file and directory names with size and date modified

#### Using 2 different traversal methods:

* Depth first
* Breadth first 


###### 
       Given an arbitrary directory in any file-sytem, the program should
       Output A:   Print out all file and directory names
       Output B: Output A along with size and date modified
       Demonstrate 1 and 2 using DFS and BFS


    1. write test cases
    2. Messaging queues for memory issues
    
    
1. Sample output

        --File List viewer--
        Enter the file url
        C:\Test
        Entered path: C:\Test
        
        Enter mode DF(press-0) or BF(press-1)
        0
        Mode selected is Depth First
        
        Enter the detail level: NORMAL(press-0) or VERBOSE(press-1) 
        1
        Detail level VERBOSE
        
        
        Directory: a    Dir lastmodified: Wed Apr 11 15:01:04 PDT 2018
        File: a.txt        File Size: 14 B    File lastmodified: Wed Apr 11 15:01:11 PDT 2018
        Directory: aa    Dir lastmodified: Wed Apr 11 15:00:47 PDT 2018
        File: aa.txt.txt        File Size: 7 B    File lastmodified: Wed Apr 11 15:00:51 PDT 2018
        Directory: b    Dir lastmodified: Wed Apr 11 15:01:54 PDT 2018
        File: b.txt        File Size: 14 B    File lastmodified: Wed Apr 11 15:02:05 PDT 2018
        Directory: ba    Dir lastmodified: Wed Apr 11 15:01:38 PDT 2018
        File: ba.txt        File Size: 15 B    File lastmodified: Wed Apr 11 15:01:42 PDT 2018
        Directory: bb    Dir lastmodified: Wed Apr 11 15:01:26 PDT 2018
        Directory: c    Dir lastmodified: Wed Apr 11 15:00:23 PDT 2018
        Directory: d    Dir lastmodified: Wed Apr 11 15:00:29 PDT 2018
        Press 0 to continue, else press any number!
        

2. Sample output 

        --File List viewer--
        Enter the file url
        C:\Test
        Entered path: C:\Test
        
        Enter mode DF(press-0) or BF(press-1)
        1
        Mode selected is Breadth First
        
        Enter the detail level: NORMAL(press-0) or VERBOSE(press-1) 
        1
        Detail level VERBOSE
        Directory: a    Dir lastmodified: Wed Apr 11 15:01:04 PDT 2018
        Directory: b    Dir lastmodified: Wed Apr 11 15:01:54 PDT 2018
        Directory: c    Dir lastmodified: Wed Apr 11 15:00:23 PDT 2018
        Directory: d    Dir lastmodified: Wed Apr 11 15:00:29 PDT 2018
        File: a.txt        File Size: 14 B    File lastmodified: Wed Apr 11 15:01:11 PDT 2018
        Directory: aa    Dir lastmodified: Wed Apr 11 15:00:47 PDT 2018
        File: b.txt        File Size: 14 B    File lastmodified: Wed Apr 11 15:02:05 PDT 2018
        Directory: ba    Dir lastmodified: Wed Apr 11 15:01:38 PDT 2018
        Directory: bb    Dir lastmodified: Wed Apr 11 15:01:26 PDT 2018
        File: aa.txt.txt        File Size: 7 B    File lastmodified: Wed Apr 11 15:00:51 PDT 2018
        File: ba.txt        File Size: 15 B    File lastmodified: Wed Apr 11 15:01:42 PDT 2018
        
        Press 0 to continue, else press any number!