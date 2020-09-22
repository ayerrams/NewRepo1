package test;

import java.io.File;



public class GetAllFiles {

	public static void main(String[] args) {
		
		
	      String zipFilePath = "C:\\Users\\AnilYerramsetti\\Desktop\\NewZipTesting\\Source.zip";
	      String destDirectory = "C:\\Users\\AnilYerramsetti\\Desktop\\NewZipTestDestination2";
		
		
        UnzipUtility unzipper = new UnzipUtility();
        try {
        	//System.out.println("inside try block");
            unzipper.unzip(zipFilePath, destDirectory);
            System.out.println("Perfect! Unzip successfull.Please check your destination folder for files.");
        } catch (Exception ex) {
            // some errors occurred
            ex.printStackTrace();
        }
    
		// Provide full path for directory(change accordingly)  
        String maindirpath = "C:\\Users\\AnilYerramsetti\\Desktop\\NewZipTestDestination2";
                 
        // File object
        File maindir = new File(maindirpath);
        System.out.println("**********************************************"+maindir.exists());
        System.out.println("**********************************************"+maindir.isDirectory());
          
        if(maindir.exists() && maindir.isDirectory())
        {
            // array for files and sub-directories 
            // of directory pointed by maindir
            File arr[] = maindir.listFiles();
            System.out.println(arr.length);
            System.out.println("**********************************************");
            System.out.println("Files from main directory : " + maindir);
            System.out.println("**********************************************");
            
            System.out.println(arr.length);
            for (int i=0; i< arr.length; i++){
                //destDirectory = "C:\\Users\\AnilYerramsetti\\Desktop\\NewZipTestDestination";
                destDirectory = "C:\\Users\\AnilYerramsetti\\Desktop\\NewZipTestDestination2";
                //UnzipUtility unzipper = new UnzipUtility();
                try {
                	//System.out.println("inside try block");
                   unzipper.unzip(arr[i].toString(), destDirectory);
                	//System.out.println(arr[i].toString());
                    //System.out.println("Perfect! Unzip successfull.Please check your destination folder for files.");
                } catch (Exception ex) {
                    // some errors occurred
                    ex.printStackTrace();
                }
            }
            // Calling recursive method
       }                
	}

}
