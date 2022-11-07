import java.util.*;
public class StudentProject {
    public static void main(String[]args){
        Scanner sc=new Scanner (System.in);
        StudentGroup sg=new StudentGroup();
        System.out.println("Enter count of Group:");
        int n=sc.nextInt();
        String q=sc.nextLine();
        for(int j=0;j<n;j++){
            System.out.println("Enter Fio:");
            String f=sc.nextLine();
            System.out.println("Enter Adress:");
            String ad=sc.nextLine();
            System.out.println("Enter Fakulty:");
            String fak=sc.nextLine();
            System.out.println("Enter Kurs:");
            int kurs=sc.nextInt();
            System.out.println("Enter count of Marks:");
            int k=sc.nextInt();
            int []m=new int[k];
            System.out.println("Enter Marks:");
            for(int i=0;i<k;i++)
                m[i]= sc.nextInt();
            Student st=new Student(f,ad,fak,kurs,m);
            sg.add(st);
            q=sc.nextLine();
        }
        System.out.println("Who is deleted: ");
        String f=sc.nextLine();
        sg.del(f);
        sg.print();

    }
}
