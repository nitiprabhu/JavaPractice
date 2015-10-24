import new1.packfo.ReadAdd;

public class BranchInfo implements collegeInfo {

 String hName;
 int noOfFaculty;
 
 public BranchInfo(int a) {
	// TODO Auto-generated constructor stub
	 
	 noOfFaculty=a;	 
}
 
  public void read(String HODName)
  {
	  hName=HODName;
  }
  
  public void print()
  {
	  System.out.println("HOD Name is " + hName + "  Principal : " + pricipal + "Students: " + noOfStudents + "  " + noOfFaculty );
  }
  
    void ReadAdd() {
	}
    
    
    
 
}
