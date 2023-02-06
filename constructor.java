public class constructor {
    public static void main (String args[]){
        Student s1=new Student();
        //System.out.println(s1.name);
        // Student s2=new Student("shraddha");
        // Student s3=new Student(123);
        //Student s4=new Student("aman",567); -- error because this constructor is not there
        s1.name="shraddha";
        s1.roll=456;
        s1.password="abcd";
        s1.marks[0]=100;
        s1.marks[1]=90;
        s1.marks[2]=80;


        Student s2= new Student(s1);// copy  constructor
        s2.password="xyz";
        s1.marks[2]=100;

        for(int i=0;i<3;i++){
            System.out.println(s2.marks[i]);
        }
    }
}

class Student{
    String name;
    int roll;
    String password;
    int marks[];

    // shallow copy constructor
    // Student(Student s1){
    //     marks=new int [3];
    //     this.name=s1.name;
    //     this.roll=s1.roll;
    //     this.marks=s1.marks;
    //}


    //deep copy constructor
        Student(Student s1){
            marks=new int[3];
            this.name=s1.name;
            this.roll=s1.roll;
            for(int i=0;i<marks.length;i++){ /*to copy marks */
                this.marks[i] = s1.marks[i];
            }
        }

    Student(){//Non Parameterized Constructor
         //this.name=name;
        marks=new int[3];
        System.out.println("Constructor is called..");
    }

    Student(String name){//parameterized constructor
        marks=new int[3];
        this.name=name;
    }
    Student(int roll){
        marks=new int[3];
        this.roll=roll;
    }
}
