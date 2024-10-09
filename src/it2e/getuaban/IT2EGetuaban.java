package it2e.getuaban;

import java.util.Scanner;


public class IT2EGetuaban {
    config conf = new config();
    Scanner sc = new Scanner(System.in);
    public void addSample(){
        
       
        
        
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
        String resp;
    do{   
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
            case 3:
                test.viewSample();
                test.UpdateEmployee();
            break;
            case 4:
                    test.viewSample();
                    test.deleteEmployee();
                    test.viewSample();
                    break;
        }
        System.out.println("Continue? ");
        resp = sc.next();
        
    }while(resp.equalsIgnoreCase("Yes"));
        System.out.println("Thank you! ");
        
        
    }
    public void UpdateEmployee(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ID to update: ");
        int id = sc.nextInt();
        
        System.out.println("New First Name: ");
        String nfame = sc.next();
        
        System.out.println("New Last Name: ");
        String nlname = sc.next();
        
        System.out.println("New Email ");
        String email = sc.next();
                
        System.out.println("New Position ");
        String position = sc.next();
                
        System.out.println("New Status: ");
        String nstat = sc.next();
        
        String qry = "UPDATE tbl_employee SET e_fname = ?, e_lname = ?,e_email = ?, e_position =?, e_status = ? WHERE e_id = " + id;
       
        conf.updateRecord(qry, nfame, nlname, email, position, nstat);
    }
    
    private void deleteEmployee(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ID to Delete: ");
        int id = sc.nextInt();
     
        String qry = "DELETE FROM tbl_employee WHERE e_id = ?";
        config conf = new config();
        conf.deleteRecord(qry, id);
}
    
}
        
