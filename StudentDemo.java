public class StudentDemo{
 static class Students{
  int rollNo;
  String name;
     
  //Parameterized constructor
  Students(int r, String n){
   rollNo=r;
   name=n;
   System.out.println("constructor called for RollNo:" +rollNo);
  }
  void display(){
   System.out.println("RollNo:" +rollNo+ "\tName:" +name);
  }
  //finalize() acts as a destructor-equivalent in java
  @Override
  protected void finalize() {
   System.out.println("Destructor(finalize)called for RollNo:" +rollNo);
 }
} 
public static void main(String[] args) throws InterruptedException{
 System.out.println("----Creating array of objects----");
 Students[]s=new Students[3];
 s[0]=new Students (101,"Arun");
 s[1]=new Students (102,"Bala");
 s[2]=new Students (103,"chitra");
 System.out.println("\n----Displaying student details----");
 for(int i=0; i < s.length;i++){
  s[i].display();
 }
 System.out.println("\n----Dereferencing objects and requesting garbage collection----");
 for(int i=0; i < s.length; i++){
  s[i]=null;
 }
 System.gc();
 Thread.sleep(500);//allowGc thread to run before program exist
 }
}

