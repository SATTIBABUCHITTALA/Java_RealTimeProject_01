class StudentDetails {

String studentName;
int studentId;
String grade; //instance 
static String principalName ="Shekar" ; //class level variable 

//
void getStudentDetails(){
int id; //local varaible
System.out.println("In GetStudent Details Method");
}

}

public class Student{

public static void main(String args[]){

StudentDetails  object=new StudentDetails();
object.studentId =101;
object.studentName="Satti Babu";

//StudentDetails.principalName ="Harsha Vardhan"; 

System.out.println(object.studentId);
System.out.println(object.studentName);
System.out.println(object.principalName);

StudentDetails  object1=new StudentDetails();
object1.studentId =102; //default =0;


System.out.println(object1.studentId);
System.out.println(object1.studentName);
System.out.println(object1.principalName);


}



}



