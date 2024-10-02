package it2e.getuaban;

import java.util.Scanner;


public class IT2EGetuaban {
    
    public void addSample(){
        Scanner sc = new Scanner(System.in);
        config conf = new config();
        
        System.out.print(" First Name: ");
        String fname = sc.next();
        
        System.out.print(" Last Name: ");
        String lname = sc.next();
        
        System.out.print("Email: ");
        String email = sc.next();
        
        System.out.print("Position: ");
        String position = sc.next();
        
         System.out.println("Status: ");
         String status = sc.next();

        String sql = "INSERT INTO tbl_employee (e_fname, e_lname, e_email, e_position, e_status) VALUES (?, ?, ?, ?, ?)";
        conf.addRecord(sql, fname, lname, email, position, status);


    }
     
     
     private void viewSample() {
        String votersQuery = "SELECT * FROM tbl_employee";
        String[] votersHeaders = {"ID", "FName", "LName", "Email", "Position", "Status"};
        String[] votersColumns = {"e_id", "e_fname", "e_lname", "e_email", "e_position", "e_status"};
        config conf = new config();
        conf.viewRecords(votersQuery, votersHeaders, votersColumns);
    }

  
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        
        System.out.println("1.  ADD");
        System.out.println("2.  VIEW");
        System.out.println("3.  UPDATE");
        System.out.println("4.  DELTE");
        System.out.println("5.  EXII");
        
        System.out.println("Enter Action: ");
        int action = sc.nextInt();
        
        IT2EGetuaban test = new IT2EGetuaban();
        switch(action){
            case 1:
               test.addSample();
            break;
            case 2:
                test.viewSample();
            break;
            
        }
        
    }
    
}
        
   
