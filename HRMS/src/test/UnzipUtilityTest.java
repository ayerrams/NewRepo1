package test;

public class UnzipUtilityTest {
	
    public static void main(String[] args) {
    	//System.out.println("inside main");
        String zipFilePath = "C:\\Users\\AnilYerramsetti\\Desktop\\NewZipTesting\\Source.zip";
        String destDirectory = "C:\\Users\\AnilYerramsetti\\Desktop\\NewZipTestDestination";
        UnzipUtility unzipper = new UnzipUtility();
        try {
        	//System.out.println("inside try block");
            unzipper.unzip(zipFilePath, destDirectory);
            System.out.println("Perfect! Unzip successfull.Please check your destination folder for files.");
        } catch (Exception ex) {
            // some errors occurred
            ex.printStackTrace();
        }
    }
}
