package newatm;
import java.util.Scanner;
class Newatm{ 
	private static Scanner input;
public static void main(String[]args){
		System.out.println("\t\t\t\t\t\tWELCOME TO THE ATM SERVICES OF IOB");
		mac st=new mac();
		System.out.println("\t\t\t\t\t\t\tINSERT YOUR DEBIT CARD");
		System.out.printf("\t\t\t\t\t\t\t   ENTER YOUR PIN NO");
		System.out.println();
		input = new Scanner(System.in);
		String val1=input.nextLine();
		String val="****************";
		System.out.println("Entered pin no is"+val);
		String val2=val1;
		while(true){
		System.out.println("If you want to continue press 'y' or else press 'n' ");
		char net=input.next(".").charAt(0);
		if(net=='y'||net=='Y'){
			System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------");
			System.out.println("\t\t\t   OUR SERVICES:");
			System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------");
			System.out.printf("%-50s%-30s","1.BALANCE ENQUIRY","2.WITHDRAWAL OF AMOUNT");
			System.out.println();
			System.out.printf("%-50s%-30s","3.DEPOSIT","4.TRANSFER OF FUNDS");
			System.out.println();
			System.out.printf("%-50s%-30s","5.CHANGE OF PIN NO","6.NOTIFICATIONS");
			System.out.println();
			System.out.printf("%-75s","7.LOG OFF");
			System.out.println();
			System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------");
			System.out.println("Enter your choice");
	        int choice=input.nextInt();
	        switch(choice){
			case 1:st.balance();
			break;
			case 2:st.withdrawal();
			break;
			case 3:st.deposit();
			break;
			case 4:st.transfer();
			break;
			case 5:st.changepin();
			break;
			case 6:st.notifications();
			break;
			case 7:st.exit();
			return;
			default:System.out.println("Wrong entry");
			System.out.println("Please enter the valid choice");
			break;}}
			else{
			st.exit();
			return;
			}}}public String val2;
			public String val1;}
class mac extends Newatm{
Scanner input=new Scanner(System.in);
void balance(){
        System.out.println("If you really like to view the total bank balance of yours, press 'y' or else press 'n'");
        char ans=input.next(".").charAt(0);
        if(ans=='y'||ans=='Y'){
        System.out.println("Your current balance is Rs.10000");
        }}
void leftout(int x){
		int bal=10000;
		int result=bal-x;
		if(result<0){
		System.out.println("BALANCE INSUFFICIENT!!!");
		return;
		}
		System.out.println("Balance in your account is="+result);
		System.out.println("PLEASE COLLECT YOUR MONEY........THANK YOU");
	}
void withdrawal(){
	    System.out.println("Which type of account are you having??");
	    System.out.println("1.CURRENT 2.SAVINGS 3.OTHERS");
	    char ans;
	    ans=input.next(".").charAt(0);
	    if(ans=='1'||ans=='2'||ans=='3'){
		System.out.println("Which of these currency are you expecting??");
		System.out.println("1.RUPEES 2.EURO 3.YEN");
		char k=input.next(".").charAt(0);
		if(k=='1'||k=='2'||k=='3'){
		System.out.println("Enter the amount of withdrawal");
		int amount=input.nextInt();
		leftout(amount);
	    }else{System.out.println("Please enter the valid choice for currency");
	    return;
	    }}else{System.out.println("Please enter the valid choice for the type of account");
		return;}}
void notifications(){
	    System.out.println("NOTOIFICATIONS FROM THE BANK!!!");
	    System.out.println("1.Our bank is issueing home loans at the interest of 5% pa!!!");
      	    System.out.println("2.We are soon getting merged with the other nationalized banks");
	    System.out.println("3.Do not ever give your pin no to any of the bank officials");
	    System.out.println("Thats all for today!!!");
	}
void total(int y){
	    int deposit=10000;
	    int result=deposit+y;
	    System.out.println("Current balance is="+result);
}
void deposit(){
    	System.out.println("Enter the amount to be deposited");
	    int amt=input.nextInt();
	    total(amt);
	    System.out.println("Collect the reciept!!");
	}
void changepin(){
	System.out.println("CHANGE OF PIN NO");
	System.out.println("Enter your current pin no");
	String oldpin=input.nextLine();
	if(oldpin==val2){
	System.out.println("Your current pin no is "+oldpin);
	System.out.println("Entered pin no is accurate!!!");
	System.out.println("AUTHENTICATION SUCCESSFULL");
	System.out.println("Enter your new pin no");
	String newpin=input.nextLine();
	System.out.println("PIN NO IS SUCCESSFULLY CHANGED!!!");
	System.out.println("YOUR CURRENT PIN NO IS="+newpin);
}else{
	System.out.println("ENTERED PIN NO DOES NOT MATCH WITH YOUR DATABASE RESOURCES!!!");
	System.out.println("PLEASE ENTER THE CORRECT PIN NO");
	return;
}}
void transfer(){
	System.out.println("TRANSFER OF CURRENCY");
	System.out.println("Enter the last 4 digits of the account no");
	int accc=input.nextInt();
	System.out.println("Okay!!what is the amount to be transfered??");
	int trans=input.nextInt();	
	if(trans>10000){System.out.println("INSUFFICIENT BANK BALANCE!!!");return;}
	System.out.println("AMOUNT TRANSFERED TO ACCOUNT NO ***********"+accc+" is "+trans);
	leftout(trans);}
void exit(){
	System.out.println("YOU ARE SUCCESSFULLY LOGGED OFF");
	System.out.println("Press exexcution button to log in again!!!");
	}}
