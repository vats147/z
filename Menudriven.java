import java.util.*;
import java.lang.*;

//declare and define class
class customer {

    // creating variable for storing user detail
    String[] Customer_Name = new String[100];
    protected long[] Account_no = new long[100];
    Short[] pin = new Short[100];
    String[] Customer_Mail = new String[100];
    String[] Account_type = new String[100];
    double[] Account_balance = new double[100];
    String[][] Account_transaction = new String[100][10];
    int[] a=new int[100];


    // check,flag,temp and temp_flag variable
    static int Check = 0;
    int flag;
    int temp;
    int temp_flag;
    static int Count = 0;

    int[][] temp_arr = new int[100][10];

    //intzile temparr with 0

    // counstructor
    customer() {
        for(int i=0;i<100;i++)
        {
            a[i]=0;
        }
    }

    public void increase() {
        Check++;
    }

    // Store customer value through passing argument
    public void input(String Customer_Name, long Account_no, Short pin, String Customer_Mail, String Account_type) {
        this.Customer_Name[Check] = Customer_Name;
        this.Account_no[Check] = Account_no;
        this.pin[Check] = pin;
        this.Customer_Mail[Check] = Customer_Mail;
        this.Account_type[Check] = Account_type;
        increase();

    }

       // verifying name avaiable or not
       //due to name not avaible we right now ignore this
    /*
       public boolean Check_name(String c_mail) {
       
        System.out.println(c_mail);
        for(int i=0;i<Check;i++){
            System.out.println("hello "+ i);
            System.out.println("world" + Check);
            System.out.println(Customer_Name[i]);
            System.out.println(" c "+c_mail);
            //System.out.println(c_mail||Customer_Name[i]);
            if ( c_mail == Customer_Name[i] )
            {
            System.out.println("hello");

                return true;
            }
        }
        // System.out.println("x");
        return false;

       
    }*/

    public static void Divider() {
        System.out.println("**********************");
    }

    // check account avaiable or not and set flag
    public boolean Check_Ac(double temp_amount, Long Temp_account) {
        for (int i = 0; i < Check; i++) {
            if (this.Account_no[i] == Temp_account) {
                temp = (int) Account_no[i];
                flag = i;

                return true;
            }

        }
        return false;
    }

    // Deposite money in account
    public void Add_Amount(double Temp_amount) {
        Account_balance[flag] += Temp_amount;
        System.out.println("a[flag] :::before"+a[flag]);

        Count=a[flag];

        if(Count<10)
        {

            Count++;
        }
        else
        {
            Count=0;
        }
       
        a[flag]=Count;
       

    }

    // check account avaiable or not
    public boolean Check_account_avaliable(long Ac_no, Short C_pin) {

        for (int i = 0; i < Check; i++) {

            if (Account_no[i] == Ac_no && pin[i] == C_pin) {
                flag = i;
                return true;
            }

        }

        return false;

    }

    // check account avaiable or not (function overloading)
    public boolean Check_account_avaliable(long Ac_no) {

        for (int i = 0; i < Check; i++) {

            if (Account_no[i] == Ac_no) {
                flag = i;

                return true;
            }

        }

        return false;

    }

    public void display_amount() {
        System.out.println("Your balance is " + Account_balance[flag]);
    }

    public boolean Check_amount(double c_amount) {

        if (c_amount <= Account_balance[flag]) {
            return true;
        }

        return false;

    }

    // withdraw an amount
    public boolean Withdraw_amount(double c_amount) {

        if (c_amount > Account_balance[flag]) {

            System.out.println("amount not sufficient: ");
            return false;
        } else if (c_amount <= Account_balance[flag]) {

            Account_balance[flag] -= c_amount;
            Count=a[flag];
        Account_transaction[flag][Count]="Withdraw:"+Account_balance[flag];
         if(Count<10)
        {

            Count++;
        }
        else
        {
            Count=0;
        }
        a[flag]=Count;

            return true;
        }
        return false;
    }

    // print customer detail
    public void Print_customer_detail() {

        System.out.println("Account holder name : " + Customer_Name[flag]);
        System.out.println("Account number  : " + Account_no[flag]);
        System.out.println("Account pin  : " + "****");
        System.out.println("Your mail is  : " + Customer_Mail[flag]);
        System.out.println("Account type is : " + Account_type[flag]);
        System.out.println("Account balance is : " + Account_balance[flag]);

    }

    // Closing account
    public void close_Ac() {
        Check--;
    }

    // check pin is valid or not
    public boolean check_pin(short C_pin) {
        if (C_pin == pin[flag]) {
            return true;
        }
        return false;

    }

    // change pin
    public void Change_pin(short C_pin) {
        pin[flag] = C_pin;
    }

    // transfer amount from one to another
    public void Transfer_amount(long old_ac_no, double C_amount, long ac_no) {
        // find existing account
        for (int i = 0; i < Check; i++) {

            if (Account_no[i] == old_ac_no) {
                temp = i;
            }

        }

        // find account which customer wants to transfer money
        for (int i = 0; i < Check; i++) {

            if (Account_no[i] == ac_no) {
                temp_flag = i;
            }
        }

        if (C_amount > Account_balance[temp]) {
            System.out.println("amount not sufficient");

        } else if (C_amount <= Account_balance[temp]) {

            Account_balance[temp] -= C_amount;
            Account_balance[temp_flag] += C_amount;

              Count=a[temp];
             Account_transaction[temp][Count]="Withdraw:"+Account_balance[temp];
             if(Count<10)
        {

            Count++;
        }
        else
        {
            Count=0;
        }
            a[temp]=Count;

            Count=a[temp_flag];
            Account_transaction[temp_flag][Count]="Deposite via transfer " +Account_balance[temp_flag];
             if(Count<10)
        {

            Count++;
        }
        else
        {
            Count=0;
        }

            a[temp_flag]=Count;
        }
    }

    public void display_transaction(long ac_no) {

        for (int i=0;i<Check ;i++ ) {
            System.out.println("hello world");
            if(Account_no[i]==ac_no){
            System.out.println("flag setted");

                flag=i;}
        }
        for (int i = 0; i < flag; i++) {
            System.out.println("i="+i);
            System.out.println("aa="+a[flag]);

            for (int j = 0; j < a[flag]; j++) {
                System.out.println(Account_transaction[i][j]);
            }
        }
    }

 
}

// menu driven class
class Menudriven {

    public static void Print_Bank_Name() {
        System.out.println("welcome to BOB bank");
    }

    public static void Print_Choice() {
        System.out.println("Please give choice");
    }

    public static void Divider() {
        System.out.println("**********************");
    }

    public static void exit() {
        System.out.print("Thank you! \n Have a nice day");
        System.exit(0);
    }

    // Main method
    public static void main(String args[]) {

        Print_Bank_Name();

        // Defining and intialize object of classes
        customer cu = new customer();
        Scanner sc = new Scanner(System.in);

        // Define choice variable for user choice
        int Choice_1, Choice_2, Choice_3=0, Choice_4 = 0, Choice_5 = 0, Choice_6 = 0;

        // Temporary variable which hold temporay value
        String Temp_Customer_Name;
        long Temp_Customer_AC_no;
        long Temp_Customer_Transfer_AC_no;
        String Temp_type = "";
        Short Temp_Pin = 0;
        String Temp_Mail;
        double Temp_amount = 0;

        // do while loop
        do {
            // display main menu
            System.out.println(" 1. Login");
            System.out.println(" 2. Deposite Money");
            System.out.println(" 3. Create an account");
            System.out.println(" 4. Exit");

            Print_Choice();
            Choice_1 = sc.nextInt();
            Divider();

            // switch case
            switch (Choice_1) {
                case 1:

                    // nested do while loop
                    do {
                        // display sub menu of 1.1
                        System.out.println(" 1. Login as customer ");
                        System.out.println(" 2. Forgot password");
                        System.out.println(" 3. Main menu");
                        System.out.println(" 4. Exit");

                        Print_Choice();
                        Choice_2 = sc.nextInt();
                        Divider();

                        // nested switch case
                        switch (Choice_2) {
                            case 1:

                                System.out.println("Enter your account number or mobile number");
                                Temp_Customer_AC_no = sc.nextLong();

                                System.out.println("Enter your pin");
                                Temp_Pin = sc.nextShort();

                                // check account avaiable or not?
                                if (cu.Check_account_avaliable(Temp_Customer_AC_no, Temp_Pin) == true) {
                                    do {

                                        Divider();
                                        System.out.println(" 1. Deposite amount ");
                                        System.out.println(" 2. Withdraw amount");
                                        System.out.println(" 3. View/Detail details ");
                                        System.out.println(" 4. Check balance");
                                        System.out.println(" 5. Change password(pin)");
                                        System.out.println(" 6. Transfer amount ");
                                        System.out.println(" 7. Transaction of account");
                                        System.out.println(" 8. Close account");
                                        System.out.println(" 9. Previous Menu");
                                        System.out.println(" 10. Exit");
                                        Divider();
                                        Choice_6 = sc.nextInt();

                                        // nested switch
                                        switch (Choice_6) {

                                            // For Deposite amount
                                            case 1:
                                                System.out.println(" how much amount do you want to add? ");
                                                Temp_amount = sc.nextDouble();
                                                cu.Add_Amount(Temp_amount);
                                                cu.display_amount();
                                                Divider();
                                                break;

                                            // For withdraw amount
                                            case 2:
                                                System.out.println(" how much amount do you want to Withdraw ? ");
                                                Temp_amount = sc.nextDouble();

                                                if (cu.Check_Ac(Temp_amount, Temp_Customer_AC_no) == true) {
                                                    if (cu.Withdraw_amount(Temp_amount) == true) {
                                                        cu.display_amount();
                                                    }

                                                } else {
                                                    System.out.println(" amount not sufficient ");
                                                }
                                                Divider();
                                                break;

                                            // print customer detail
                                            case 3:
                                                cu.Print_customer_detail();
                                                Divider();
                                                break;

                                            // Display amount of account
                                            case 4:
                                                cu.display_amount();
                                                Divider();
                                                break;

                                            // Changing pin
                                            case 5:
                                                System.out.println("please enter your old pin");
                                                Temp_Pin = sc.nextShort();

                                                if (cu.check_pin(Temp_Pin) == true) {
                                                    System.out.println("Enter a new pin := ");
                                                    Temp_Pin = sc.nextShort();
                                                    cu.Change_pin(Temp_Pin);
                                                } else {
                                                    System.out.println("Invalid pin");
                                                }

                                                Divider();
                                                break;

                                            // For transfring money from one account to another account
                                            case 6:
                                                System.out.println(
                                                        "Enter your account number where you want to transfer: ");
                                                Temp_Customer_Transfer_AC_no = sc.nextLong();

                                                if (cu.Check_account_avaliable(Temp_Customer_Transfer_AC_no) == true) {
                                                    System.out.println("please enter amount");
                                                    Temp_amount = sc.nextDouble();
                                                    cu.Transfer_amount(Temp_Customer_AC_no, Temp_amount,
                                                            Temp_Customer_Transfer_AC_no);
                                                } else {
                                                    System.out.println(" Account not found!");
                                                }
                                                Divider();

                                                break;

                                            // Display transaction of account
                                            case 7:
                                                cu.display_transaction(Temp_Customer_AC_no);
                                                break;

                                            // for closing account
                                            case 8:
                                                cu.close_Ac();
                                                break;

                                            // for previous
                                            case 9:
                                                break;

                                            // for exit from the code
                                            case 10:
                                                exit();
                                                break;

                                            default:
                                                System.out.println("Invalid choice");
                                                exit();
                                                break;
                                        }
                                        Divider();
                                    } while (Choice_6 != 9);
                                } else {
                                    System.out.println("Login unsuccesful");
                                }

                                break;

                            // forgot password
                            //here 
                            case 2:
                                System.out.println("please enter your account number ");
                                Temp_Customer_AC_no = sc.nextLong();

                                if (cu.Check_account_avaliable(Temp_Customer_AC_no) == true) {
                                    
                                  
                                   
                                        cu.Change_pin(Temp_Pin);
                                    }
                                
                                    
                                
                                 else {
                                    System.out.println("account not found");
                                }
                                break;

                            // For main menu
                            case 3:

                                break;

                            // for exit from the code
                            case 4:
                                exit();
                                break;

                            default:
                                System.out.println("Invalid choice");
                                exit();
                                break;

                        }

                    } while (Choice_2 != 3);
                    break;

                // Deposite money to an account
                case 2:
                    System.out.println(" Great to have you here ");
                    System.out.println("Enter account number : ");
                    Temp_Customer_AC_no = sc.nextLong();

                    if (cu.Check_Ac(Temp_amount, Temp_Customer_AC_no) == true) {
                        System.out.println("Enter amount : ");
                        Temp_amount = sc.nextDouble();
                        cu.Add_Amount(Temp_amount);
                        System.out.println("Amount deposite succesfully");

                    } else {
                        System.out.println("Account not avaiable");
                    }
                    Divider();
                    break;

                // Create an account
                case 3:
                    System.out.println("It is pleasure to have you here ...");
                    System.out.println("Enter your name ");
                    Temp_Customer_Name = sc.next();

                    System.out.println("****NOTE****");
                    System.out.println("Your mobile number is your account number");
                    System.out.println("Enter your Mobile number ");

                    Temp_Customer_AC_no = sc.nextLong();

                    System.out.println("Please enter pin(Example:= 0000)");
                    Temp_Pin = sc.nextShort();

                    System.out.println("Please provide your mail");
                    Temp_Mail = sc.next();

                    System.out.println("Which kind of account do you want to open?");
                    System.out.println(" 1. Saving account");
                    System.out.println(" 2. Current account");
                    Choice_5 = sc.nextInt();
                    if (Choice_5 == 1) {
                        Temp_type = "Saving account";
                    } else if (Choice_5 == 2) {
                        Temp_type = "Current account";
                    }
                    if (cu.Check_account_avaliable(Temp_Customer_AC_no) == true) {
                        System.out.println("Account is already avaiable please try with another phone number");
                    } else {
                        cu.input(Temp_Customer_Name, Temp_Customer_AC_no, Temp_Pin, Temp_Mail, Temp_type);
                        System.out.println("Account created succesfully");
                    }

                    Divider();
                    break;

                // exit from the code
                case 4:
                    System.out.println("Thank you!");
                    System.out.println();
                    System.out.println("hope you enjoy our service ");

                    break;

                default:
                    System.out.println("Invalid choice");
                    exit();
                    break;
            }

        } while (Choice_1 != 4);
    }
}