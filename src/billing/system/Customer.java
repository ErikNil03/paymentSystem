/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package billing.system;

/**
 *
 * @author Erik
 */
public class Customer extends BillingFrame{
    String firstName;
    String lastName;
    int ccNumber;
    int ccMonth;
    int ccYear;
    int ccCVC;
    
    Customer(String n1, String n2, int ccN, int ccM, int ccY, int ccC){
        this.firstName = n1;
        this.lastName = n2;
        this.ccNumber = ccN;
        this.ccMonth = ccM;
        this.ccYear = ccY;
        this.ccCVC = ccC;
    }
    
    public String toString(){
        for(int i=0;i<CustomerList.size();i++){
            //if(firstNameField.getText().equals(CustomerList.get(i).firstName)){
                
            
        }
        String print = "Hey! " +firstName +" "+ lastName +"\n";
        return print;
    }
}

