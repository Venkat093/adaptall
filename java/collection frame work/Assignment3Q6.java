import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

class Chatroom
{
	private String name;
	private Set<String> username;
	private List<String> messages;
	{
		name ="";
		username=new HashSet<String>();
		messages =new ArrayList<String>();
	}
	public void addMessage(String name,Set<String> username,List<String> messages)
	{
		this.name=name;
		this.username.addAll(username);
		this.messages.addAll(messages);
	}
	public boolean removeUser(String username)
	{
		this.username.remove(username);
		if(this.username.contains(username))
			return false;
		return true;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Set<String> getUsername() {
		return username;
	}
	public void setUsername(Set<String> username) {
		this.username = username;
	}
	
}

class User
{
	private String username;
	private String password;
    private String firstName;
    private String lastName;
	public User(String username, String password, String firstName, String lastName) {
		super();
		this.username = username;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
    
}
class ChatApplication
{
	private Map<String,Chatroom> chatrooms=new HashMap<String,Chatroom>();
	private Map<String, User> users = new HashMap<String, User>();
	private Set<String> loggedInUsers = new HashSet<String>();
	
	 public boolean isChatroomNameValid(String name) {
	        if(chatrooms.containsKey(name))
	        return true;
	        return false;
	    }
	 public boolean isUsernameExists(String username) {
	        if(users.containsKey(username))
	        return true;
	        return false;
	    }
	 public boolean authenticateUser(String username, String password) {
	        if(users.containsKey(username))
	        {
	            User x= users.get(username);
	            if(x.getPassword()==password)
	            return true;
	        }
	        return false;
	    }
	//UI methods 
	 public void createChatroom()
	 {
		 System.out.println("-----------------------creating Chat room----------");
		 Chatroom x=new Chatroom();
		 System.out.println("Enter name of the chatroom");
		 Scanner sc=new Scanner(System.in);
		 x.setName(sc.nextLine());
		 System.out.println("enter the name of the users");
		// x.setUsername(loggedInUsers);
		 Set<String> usernames=new HashSet<>();
		 while(sc.hasNextLine())
		 {
			 String n=sc.nextLine();
			 if(n=="")
				 break;
			 if(isUsernameExists(n))
			 {
				 usernames.add(n);
			 }
			 else
				 {
					 System.out.println("chat room creation is failed");
					 menu();
				 }
		   }
		 x.setUsername(usernames);
		 System.out.println("Created room Successfully");
		 chatrooms.put(x.getName(), x);
		 menu();
	 }
	 public void addNewUser()
	 {
		 Scanner sc=new Scanner(System.in);
		 String username,password,firstname,lastname;
		 System.out.println("----------------------------------");
		 System.out.println("----------New user interface-------------------");
		 System.out.println("-----------------------------");
		 System.out.println("Enter first name");
		 firstname=sc.nextLine();
		 System.out.println("Enter last name");
		 lastname=sc.nextLine();
		 System.out.println("Enter last username");
		 username=sc.nextLine();
		 System.out.println("enter password");
		 password=sc.nextLine();
		 User x=new User(username,password,firstname,lastname);
		 users.put(username, x);
		 loggedInUsers.add(username);
		 menu();
	 }
	 public boolean login()
	 {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("login interface----------------");
		 String username,password;
		 System.out.println("Enter Username:\n");
	        username=sc.nextLine();
	        System.out.println("Enter Password:\n");
	        password=sc.nextLine();
	        if(authenticateUser(username,password)==true)
	        {
              System.out.println("login successfull");
                sc.close();
                return true;
	        }
	        else
	        {
	        	sc.close();
	        	return false;
	        }
		 
	 }
	 public void sendMessage(String room)
	 {
		 if(isChatroomNameValid(room))
		 {
			 System.out.println("Chatroom Validation Success full");
			 Scanner in = new Scanner(System.in);
	           Chatroom x=chatrooms.get(room);
	           x.setMessages(in.nextLine());
	           System.out.println("Do you wanna add more ?\n1.Yes \n2.No");
	           if(in.nextInt()==1)
	           sendMessage(room);
	           else
	           menu();
		 }
		 
	 }
	 public void printMessages(String room) {
	        if(isChatroomNameValid(room))
	        {
	        Chatroom a=chatrooms.get(room);
	        List<String> x=a.getMessages();
	        System.out.println("Messages in the Chatroom :");
	        for(String i:x)
	        {
	            System.out.println(i);
	        }
	    }
	    else
	    menu();
	    }
	 public void listUsersFromChatroom(Chatroom room) {
	        System.out.println("Users in the Chatroom :");
	        Set<String> x= room.getUsername();
	        for(String i:x)
	        {
	            System.out.println(i);
	        }
	    }
	 public void logout(String key){
	        System.out.println("LoggedOut Successfully");
	        menu();
	    }
	 public void deleteUser(String key){
	        users.remove(key);
	        System.out.println("Removed "+key+" from UserList");
	        menu();
	    }
	   public void menu() {
	        System.out.println("-------------------------------------");
	        System.out.println("----------------MENU-----------------");
	        System.out.println("-------------------------------------");
	        System.out.println("1.Create User\n2.Create Chatroom\n3.Login\n4.Remove User\n5.Send Message\n6.Print Message\n7.Remove Chatroom\n8.Exit");
	        Scanner in = new Scanner(System.in);
	        System.out.println("Enter your Input :\n");
	        int x= in.nextInt();
	        switch (x) {
	            case 1:
	                addNewUser();
	                break;
	            case 2:
	                createChatroom();
	                break;
	                
	            case 3:
	                login();
	                break;

	            case 4:
	                System.out.println("Enter the Username to be removed :\n"); 
	                deleteUser(in.nextLine());
	                break;
	                
	            case 5:
	                System.out.println("Enter the name of the Chatroom:\n"); 
	                sendMessage(in.nextLine());
	                break;
	                
	            case 6:
	                System.out.println("Enter the name of the Chatroom:\n"); 
	                printMessages(in.nextLine());
	                break;
	                
	            case 7:
	                System.out.println("Enter the name of the Chatroom to be removed :\n"); 
	                chatrooms.remove(in.nextLine());
	                break;
	            
	            case 8:
	                break;            
	        
	        
	            default:
	                break;
	        }

	    }
	 
}
public class Assignment3Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  ChatApplication x = new ChatApplication();
	        x.menu();
	}

}
