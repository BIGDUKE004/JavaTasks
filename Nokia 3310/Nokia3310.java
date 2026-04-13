import java.util.Scanner;

public class Nokia3310 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

       
System.out.println("                              NOKIA 3310");


        System.out.println("MENU");
        System.out.println(" 1. Phonebook");
        System.out.println(" 2. Messages ");
        System.out.println(" 3. Chat");
        System.out.println(" 4. Callregister");
        System.out.println(" 5. Tones");
        System.out.println(" 6. Setting");
        System.out.println(" 7. Calldivert");
        System.out.println(" 8. Games");
        System.out.println(" 9. Calculator");
        System.out.println(" 10. Reminders");
        System.out.println(" 11. Clock");
        System.out.println(" 12. Profiles");
        System.out.println(" 13. SIM service \n");


System.out.println("ENTER....");
int choice = input.nextInt();


      switch(choice){
     
       case 1 : {
System.out.println("phonebook");
            System.out.println(" 1. search");
            System.out.println(" 2. service nos ");
            System.out.println(" 3. add name");
            System.out.println(" 4. erase");
            System.out.println(" 5. edit");
            System.out.println(" 6. assign tone");
            System.out.println(" 7. send b'card");
            System.out.println(" 8. option");
            System.out.println(" 9. speed dails");
            System.out.println(" 10. voice tags");

              System.out.println("Enter An Option: ");
              subchoice = input.nextInt();

                switch (choice) {
                    case 1:
                        System.out.println("search");
                        break;
                    case 2:
                        System.out.println("service No");
                        break;
                    case 3:
                        System.out.println("add name");
                        break;
                    case 4:
                        System.out.println("erase");
                        break;
                    case 5:
                        System.out.println("edit");
                        break;
                    case 6:
                        System.out.println("assign tone");
                        break;
                    case 7:
                        System.out.println("send b'card");
                        break;
                    case 8:
                        System.out.println("options");

                        System.out.print("""
                            1. Type of view
                            2. Memory status
                             """);
System.out.println("Enter An Option: ");
subchoice = input.nextInt();

                        switch (subchoice) {
                            case 1:
                                System.out.println("Type of view");
                                break;
                            case 2:
                                System.out.println("Memory status");
                                break;
                        }
                        break;
                    case 9:
                        System.out.println("Speed dials");
                        break;
                    case 10:
                        System.out.println("Voice tags");
                        break;
                }
                break;
}
           
    case 2  : {
System.out.println("Messages");
            System.out.println(" 1. write message");
            System.out.println(" 2. inbox");
            System.out.println(" 3. outbox");
            System.out.println(" 4. picture images");
            System.out.println(" 5. templates");
            System.out.println(" 6. smileys");
            System.out.println(" 7. message setting");
            System.out.println(" 8. info service");
            System.out.println(" 9. voice mailbox number");
            System.out.println(" 10. service command editor");

                System.out.println("Enter An Option: ");
                choice = input.nextInt();

                switch (choice) {
                    case 1:
                        System.out.println("Write messages");
                        break;
                    case 2:
                        System.out.println("Inbox");
                        break;
                    case 3:
                        System.out.println("Outbox");
                        break;
                    case 4:
                        System.out.println("Picture messages");
                        break;
                    case 5:
                        System.out.println("Templates");
                        break;
                    case 6:
                        System.out.println("Smileys");
                        break;
                    case 7:
                        System.out.println("Message settings");

                        System.out.print("""
                            1. Set
                            2. Common
                               """);

System.out.println("Enter option: ");
choice = input.nextInt();

                        switch (subchoice) {
                            case 1:
                                System.out.println("Set");

                                System.out.print("""
                                    1. Message centre number
                                    2. Message sent as
                                    3. Message validity
                                        """);

                                System.out.println("Enter An Option: ");
                                useroption = input.nextInt();

                                switch (subchoice) {
                                    case 1:
                                        System.out.println("Message centre number");
                                        break;
                                    case 2:
                                        System.out.println("Message sent as");
                                        break;
                                    case 3:
                                        System.out.println("Message validity");
                                        break;
                                }
                                break;

                            case 2:
                                System.out.println("Common");

                                System.out.print("""
                                        
                                    1. Delivery reports
                                    2. Reply via same centre
                                    3. Character support
                                         """);

 System.out.println("Enter An Option: ");
choice = input.nextInt();

                                switch (subchoice) {
                                    case 1:
                                        System.out.println("Delivery reports");
                                        break;
                                    case 2:
                                        System.out.println("Reply via same centre");
                                        break;
                                    case 3:
                                        System.out.println("Character support");
                                        break;
                                }
                                break;
                        }
                        break;

                    case 8:
                        System.out.println("Info service");
                        break;
                    case 9:
                        System.out.println("Voice mailbox number");
                        break;
                    case 10:
                        System.out.println("Service command editor");
                        break;
                }
                break;
}

            case 3:{
                System.out.println("Chat");
                break;
}
            case 4 : {
System.out.println("Call register");
            System.out.println(" 1. missed call");
            System.out.println(" 2. recieved call");
            System.out.println(" 3. dailled numbers");
            System.out.println(" 4. erase recent call list");
            System.out.println(" 5. show call duration");
            System.out.println(" 6. show call cost");
            System.out.println(" 7. call cost setting");
            System.out.println(" 8. prepaid setting");

                System.out.println("Enter option: ");
                choice = input.nextInt();

                switch (choice) {
                    case 1:
                        System.out.println("Missed calls");
                        break;
                    case 2:
                        System.out.println("Received calls");
                        break;
                    case 3:
                        System.out.println("Dialed numbers");
                        break;
                    case 4:
                        System.out.println("Erase recent call lists");
                        break;
                    case 5:
                        System.out.println("Show call duration");

                        System.out.print("""
                            1. Last call duration
                            2. All calls' duration
                            3. Received calls' duration
                            4. Dialed calls' duration
                            5. Clear timers
                                """);

System.out.println("Enter option: ");
 choice = input.nextInt();

                        switch (subchoice) {
                            case 1:
                                System.out.println("Last call duration");
                                break;
                            case 2:
                                System.out.println("All calls' duration");
                                break;
                            case 3:
                                System.out.println("Received calls' duration");
                                break;
                            case 4:
                                System.out.println("Dialed calls' duration");
                                break;
                            case 5:
                                System.out.println("Clear timers");
                                break;
                        }
                        break;

                    case 6:
                        System.out.println("Show call cost");

                        System.out.print("""
                            1. Last call cost
                            2. All calls' cost
                            3. Clear counters
                                      """);

 System.out.println("Enter An Option: ");
choice = input.nextInt();

                        switch (subchoice) {
                            case 1:
                                System.out.println("Last call cost");
                                break;
                            case 2:
                                System.out.println("All calls' cost");
                                break;
                            case 3:
                                System.out.println("Clear counters");
                                break;
                        }
                        break;

                    case 7:
                        System.out.println("Call cost settings");

                        System.out.print("""
                            1. Call cost limit
                            2. Show cost in
                                    """);

                        System.out.println("Enter option: ");
                        choice = input.nextInt();

                        switch (subchoice) {
                            case 1:
                                System.out.println("Call cost limit");
                                break;
                            case 2:
                                System.out.println("Show cost in");
                                break;
                        }
                        break;

                    case 8:
                        System.out.println("Prepaid credit");
                        break;
                }
                break;

case 5 : {
System.out.println("Tone");
            System.out.println(" 1. ringing tone");
            System.out.println(" 2. ringing volume");
            System.out.println(" 3. incoming call alert");
            System.out.println(" 4. composer");
            System.out.println(" 5. message alert tone");
            System.out.println(" 6. keypad tones");
            System.out.println(" 7. warning and games tones");
            System.out.println(" 8. vibrating alert");
            System.out.println(" 9. screen saver");

                System.out.println("Enter An Option: ");
                choice = input.nextInt();

                switch (choice) {
                    case 1:
                        System.out.println("Ringing tone");
                        break;
                    case 2:
                        System.out.println("Ringing volume");
                        break;
                    case 3:
                        System.out.println("Incoming call alert");
                        break;
                    case 4:
                        System.out.println("Composer");
                        break;
                    case 5:
                        System.out.println("Message alert tone");
                        break;
                    case 6:
                        System.out.println("Keypad tones");
                        break;
                    case 7:
                        System.out.println("Warning and game tones");
                        break;
                    case 8:
                        System.out.println("Vibrating alert");
                        break;
                    case 9:
                        System.out.println("Screen saver");
                        break;
                }
                break;
}

            case 6:{
                System.out.print("""
                       Settings
                    1. Call settings
                    2. Phone settings
                    3. Security settings
                    4. Restore factory settings
                     """);

                System.out.println("Enter An Option: ");
                choice = input.nextInt();

                switch (subchoice) {
                    case 1:
                        System.out.println("Call settings");
                        System.out.print("""
                            1. Automatic redial
                            2. Speed dialing
                            3. Call waiting options
                            4. Own number sending
                            5. Phone line in use
                            6. Automatic answer
                               """);

                        System.out.println("Enter An Option: ");
                        useroption = input.nextInt();

                        switch (subchoice) {
                            case 1:
                                System.out.println("Automatic redial");
                                break;
                            case 2:
                                System.out.println("Speed dialing");
                                break;
                            case 3:
                                System.out.println("Call waiting options");
                                break;
                            case 4:
                                System.out.println("Own number sending");
                                break;
                            case 5:
                                System.out.println("Phone line in use");
                                break;
                            case 6:
                                System.out.println("Automatic answer");
                                break;
                        }
                        break;

                    case 2:
                        System.out.println("Phone settings");
                        System.out.print("""
                            1. Language
                            2. Cell info display
                            3. Welcome note
                            4. Network selection
                            5. Light
                            6. Confirm SIM service actions
                                 """);

                        System.out.print("Enter An Option: ");
                        subchoice = input.nextInt();

                        switch (useroption) {
                            case 1:
                                System.out.println("Language");
                                break;
                            case 2:
                                System.out.println("Cell info display");
                                break;
                            case 3:
                                System.out.println("Welcome note");
                                break;
                            case 4:
                                System.out.println("Network selection");
                                break;
                            case 5:
                                System.out.println("Light");
                                break;
                            case 6:
                                System.out.println("Confirm SIM service actions");
                                break;
                        }
                        break;

                    case 3:{
                        System.out.println("Security settings");
                        System.out.print("""
                            1. PIN code request
                            2. Call barring service
                            3. Fixed dialing
                            4. Closed user group
                            5. Phone security
                            6. Change access codes
                                 """);

                        System.out.print("Enter An Option: ");
                        choice = input.nextInt();
}

                        switch (subchoice) {
                            case 1:
                                System.out.println("PIN code request");
                                break;
                            case 2:
                                System.out.println("Call barring service");
                                break;
                            case 3:
                                System.out.println("Fixed dialing");
                                break;
                            case 4:
                                System.out.println("Closed user group");
                                break;
                            case 5:
                                System.out.println("Phone security");
                                break;
                            case 6:
                                System.out.println("Change access codes");
                                break;
                        }
                        break;

                    case 4:
                        System.out.println("Restore factory settings");
                        break;
                }
                break;
}

            case 7:{
System.out.println("Call divert");
                break;
}
            case 8 : {
System.out.println("Games");
                break;
}
            case 9:{
 System.out.println("Calculator");
                break;
}
            case 10 : {
 System.out.println("Reminder");
                break;
}

            case 11:{
                System.out.print("""
                       Clock
                    1. Alarm clock
                    2. Clock settings
                    3. Date setting
                    4. Stopwatch
                    5. Countdown timer
                    6. Auto update of date and time
                     """);

                System.out.print("Enter An Option: ");
                choice = input.nextInt();

                switch (subchoice) {
                    case 1:
                        System.out.println("Alarm clock");
                        break;
                    case 2:
                        System.out.println("Clock settings");
                        break;
                    case 3:
                        System.out.println("Date setting");
                        break;
                    case 4:
                        System.out.println("Stopwatch");
                        break;
                    case 5:
                        System.out.println("Countdown timer");
                        break;
                    case 6:
                        System.out.println("Auto update of date and time");
                        break;
                }
                break;
}

            case 12:{
                System.out.println("Profiles");
                break;
}
            case 13:{
                System.out.println("SIM services");
                break;
}
             
        
    

