package test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

//import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter.DEFAULT;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;

public abstract class TestJava {
	
	public abstract void testj();
	
	public void testj2() {
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Provide full path for directory(change accordingly)  
        String maindirpath = "C:\\Users\\AnilYerramsetti\\Desktop\\TestData\\Data";
                 
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
             
            // Calling recursive method
            RecursivePrint(arr); 
       }
    }

	
	
	static void RecursivePrint(File[] arr) 
    {
        // terminate condition
        if(arr.length == 0)
            return;
        //Iteration for file count
        for (int j=0 ; j < arr.length; j++) {
	        File sourcePath = new File("C:\\Users\\AnilYerramsetti\\Desktop\\TestData\\Data\\"+arr[j].getName());
	        String destPath;
	        
	        String FileName = arr[j].getName();
	        
	        System.out.println("index1 : "+j);
	        System.out.println("FileName : "+FileName);
	        // for files
	        if(arr[j].isFile()) {
	        	//Split file name with "_"
	        	String[] foldrnameArr = FileName.split("_");	        	
	        	//Create folder for Country code
	        	File dir = new File("C:\\Users\\AnilYerramsetti\\Desktop\\TestData\\DataSample\\"+foldrnameArr[1]);            
	            // attempt to create the directory here
	            dir.mkdir();
	            
	            //Create folder for Infotype code
	        	dir = new File("C:\\Users\\AnilYerramsetti\\Desktop\\TestData\\DataSample\\"+foldrnameArr[1]+"\\"+foldrnameArr[2]);
	            
	            // attempt to create the directory here
	            dir.mkdir();
	            
	            //Create folder for sub info type code
	            if(! foldrnameArr[3].equals("NA")) 
	            {
		        	dir = new File("C:\\Users\\AnilYerramsetti\\Desktop\\TestData\\DataSample\\"+foldrnameArr[1]+"\\"+foldrnameArr[2]+"\\"+foldrnameArr[3]);   
		        	destPath = "C:\\Users\\AnilYerramsetti\\Desktop\\TestData\\DataSample\\"+foldrnameArr[1]+"\\"+foldrnameArr[2]+"\\"+foldrnameArr[3]+"\\"+arr[j].getName();
		            // attempt to create the directory here
		            dir.mkdir();
	            }
	            else {
	            	destPath = "C:\\Users\\AnilYerramsetti\\Desktop\\TestData\\DataSample\\"+foldrnameArr[1]+"\\"+foldrnameArr[2]+"\\"+arr[j].getName();
	            }                                   
            	
	            if (! destPath.contains(".xml")) {
	            	destPath = destPath+".xml";
	            }
					try {
						FileUtils.copyFile(sourcePath, new File(destPath));
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				 
                  	            
	        }

        }
   }
    

}
