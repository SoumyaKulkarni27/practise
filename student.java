class student  extends course{
    String name;
    String usn;
    String dept;
    String sem;
    String pgm;

    public student(String name,String usn,String dept,String sem,String pgm){
        this.name =name;
        this.usn=usn;
        this.dept = dept;
        this.sem = sem;
        this.pgm = pgm;
    }

    void get_name(){
        System.out.println("Name ="+name);
    }

    void get_usn(){
        System.out.println("Usn ="+usn);
    }
    
    void get_Dept(){
        System.out.println("Department ="+dept);
    }

    void get_sem(){
        System.out.println("Semester ="+sem);
    }

    void get_pgm(){
        System.out.println("Program="+pgm);
    }

    public static void main(String[] args){
        student s1 = new student("Soumya kulkarni","01FE22BCA105","BCA","Fourth","BCA");
    
       s1.get_name();
       s1.get_usn();
       s1.get_Dept();
       s1.get_sem();
       s1.get_pgm();

       s1.get_course();
       System.out.println("Marks less than 40");
       s1.get_marks();
    }
}
