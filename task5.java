import java.io.*;
import java.util.*;


class Student implements Serializable {
    private String name;
    private int rollNumber;
    private String grade;

    public Student(String name, int rollNumber, String grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public String getGrade() {
        return grade;
    }

  
    public String toString() {
        return "Name: " + name + ", Roll Number: " + rollNumber + ", Grade: " + grade;
    }
}
public class SMS {
    private static final String FILENAME="stud.dat";
    Map<Integer,Student> map;
    public SMS(){
        map=new HashMap<>();
        loadFromFile();
    }
    public void addStudent(Student stud){
        map.put(stud.getRollNumber(),stud);
        saveToFile();
    }
    public void removeStudent(int rollNumber){
        map.remove(rollNumber);
        saveToFile();
    }
    public Student findStudent(int rollNumber){
        return map.get(rollNumber);
    }
    public List<Student> listAllStudens(){
        return new ArrayList<>(map.values());
    }

    @SuppressWarnings("unchecked")
    public void loadFromFile(){
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILENAME))){
            map= (Map<Integer,Student>)ois.readObject();
        }
        catch(IOException|ClassNotFoundException e ){
            map=new HashMap<>();
        }
    }


    public void saveToFile(){
        try(ObjectOutputStream oos= new ObjectOutputStream(new FileOutputStream(FILENAME))){
                    oos.writeObject(map);
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        SMS sms = new SMS();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Student Management System");
            System.out.println("1. Add Student");
            System.out.println("2. Remove Student");
            System.out.println("3. Search Student");
            System.out.println("4. Display All Students");
            System.out.println("5. Exit");
            System.out.print("Select an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("Enter name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter roll number: ");
                    int rollNumber = scanner.nextInt();
                    scanner.nextLine(); 
                    System.out.print("Enter grade: ");
                    String grade = scanner.nextLine();
                    Student student = new Student(name, rollNumber, grade);
                    sms.addStudent(student);
                    break;
                case 2:
                    System.out.println("Enter rollNo");
                    int rollNo=scanner.nextInt();
                    sms.removeStudent(rollNo);
                    break;
                case 3:
                    System.out.print("Enter rollNo");
                    rollNo=scanner.nextInt();
                    System.out.println();
                    Student st=sms.findStudent(rollNo);
                    if(st!=null){
                        System.out.println("Student found\n");
                        System.out.println(st);
                    }
                    else{
                        System.out.println("Student not found");
                    }
                    break;
                case 4:
                    List<Student> allStudents= (sms.listAllStudens());
                    if(allStudents.isEmpty()){
                        System.out.println("No students in the system");
                    }
                    else{
                        for(Student s: allStudents){
                            System.out.println(s);
                        }
                    }
                    break;
                case 5:
                    System.out.println("Exiting application");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option . Please try again.");

             }
        }
    
    }
}
