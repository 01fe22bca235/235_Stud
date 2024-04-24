public class StudentDetails
{
    String semester1[]={"c#" , "Applied Statics","Java" };
    String semester2[]={"Maths", "C++","data Structure"};
    int marks1[]={70,100,80};
     int marks2[]={100,70,80};

     public void DisplayMarks()
     {
     System.out.println("\nMarks obatained for the semester1");
     for(int i=0; i<3; i++)
     {
        System.out.println("Semester1 : " + semester1[i]+ "marks: "+ marks1[i]);
     }
     }

     public void DisplayMarkses()
     {
     System.out.println("\nMarks obatained for the semester2");
     for(int i=0; i<3; i++)
     {
        System.out.println("Semester2: " + semester2[i]+ "marks: "+ marks2[i]);
     }
     }


}