import java.util.*;
import java.util.ArrayList;
class membership
{
	String newid;
	String newpass;
	membership(String newid,String newpass)
	{
		this.newid=newid;
		this.newpass=newpass;
		
	}
	String getnewid()
	{
		return newid;
	} 
	String getnewpass()
	{
		return newpass;
	}
}

class Book
{
    String name;
    String author;
    String isbn;
    public Book(String name, String author, String isbn) 
	{
        this.name = name;
        this.author = author;
        this.isbn = isbn;
    }
    public String getName()
	{
        return name;
    }
    public String getAuthor()
	{
        return author;
    }
    public String getIsbn()
	{
        return isbn;
    }
}

class Library
{
	private static ArrayList<membership> getMemberShip = new ArrayList<membership>();
	private static ArrayList<Book> books = new ArrayList<Book>();
	static String name,issue_date,return_date;
	static int isbn,week,bookid;
	static int price=20;
	static String memberid_,password_;
	Scanner sc=new Scanner(System.in);
	void premiumMembership()
	{
		System.out.println("Benefits : you can add multiple books & you can issue book upto six weeks");
		System.out.println("---------------------------------");
		System.out.println("enter id to take membership");
		String newid=sc.next();
		System.out.println("enter password to take membership");
		String newpass=sc.next();
		sc.nextLine();
		membership newmember = new membership(newid,newpass);
        getMemberShip.add(newmember);
		System.out.println("membership added sucessfully");
		System.out.println("please login");
		System.out.println("---------------------------------");
		System.out.println("Please enter id");
		String memberid=sc.nextLine();
		System.out.println("Please enter password");
		String password=sc.nextLine();
			if((newmember.getnewid().equals(memberid)&& newmember.getnewpass().equals(password)))
			{
				System.out.println("login sucessfull");
				Library beni=new Library();
				System.out.println("Please select options");
				System.out.println("enter 1 to add multiple books");
				System.out.println("enter 2 to issue book upto six weeks");
				int options=sc.nextInt();
				switch(options)
				{
					case 1:
					beni.benifit2();
					break;
					case 2:
					beni.benifit1();
					break;
					default:
					System.out.println("please enter vaild choice");
				}
			}
			else
			{
				System.out.println("incorrect id or password please login again");
				System.out.println("Please re-enter id");
				String memberid_=sc.nextLine();
				System.out.println("Please re-enter password");
				String password_=sc.nextLine();
				if((newmember.getnewid().equals(memberid_)&& newmember.getnewpass().equals(password_)))
				{
				System.out.println("login sucessfull");
				Library beni=new Library();
				System.out.println("Please select options");
				System.out.println("enter 1 to add multiple books");
				System.out.println("enter 2 to issue book upto six weeks");
				int options=sc.nextInt();
				switch(options)
					{
					case 1:
					beni.benifit2();
					break;
					case 2:
					beni.benifit1();
					break;
					default:
					System.out.println("please enter vaild choice");
					}
				}
				else
				{
					System.out.println("you not have membership please take membership");
				}
			}
			
	}
	
	void benifit1()
	{
		System.out.println("for how many weeks you want you issue book : ");
		week = sc.nextInt();
		switch(week)
		{
			case 1:
			System.out.println("your price will be : "+price+" rupees");
			break;
			case 2:
			System.out.println("your price will be : "+(week*price)+" rupees");
			break;
			case 3:
			System.out.println("your price will be : "+(week*price)+" rupees");
			break;
			case 4:
			System.out.println("your price will be : "+(week*price)+" rupees");
			break;
			case 5:
			System.out.println("your price will be : "+(week*price)+" rupees");
			break;
			case 6:
			System.out.println("your price will be : "+(week*price)+" rupees");
			break;
			default:
			System.out.println("Please enter vaild weeks");
		}
		sc.nextLine();
		if(week<=6)
		{
			System.out.println("book name : ");
			name = sc.nextLine();
			System.out.println("Enter ISBN : ");
			isbn = sc.nextInt();
			sc.nextLine();
			System.out.println("Issue date : ");
			issue_date = sc.nextLine();
			System.out.println("return date : ");
			return_date = sc.nextLine();
		}
	}
	
	void benifit2()
	{
		System.out.println("how many book you want to add "+"("+" maximum five books allowed"+"):");
		int addMoreBook=sc.nextInt();
		for(int i=0;i<addMoreBook;i++)
		{
		System.out.println("Enter book name:");
        String name = sc.next();
        System.out.println("Enter author name:");
        String author = sc.next();
        System.out.println("Enter ISBN:");
        String isbn = sc.next();
        Book book = new Book(name, author, isbn);
        books.add(book);
        System.out.println("Book added successfully!");
		}
	}
	
	void addBook()
	{
		System.out.println("Enter book name:");
        String name = sc.next();
        System.out.println("Enter author name:");
        String author = sc.next();
        System.out.println("Enter ISBN:");
        String isbn = sc.next();
        Book book = new Book(name, author, isbn);
        books.add(book);
        System.out.println("Book added successfully!");
	}
	
	void issueBook()
	{
		
		System.out.println("for how many weeks you want you issue book"+"("+" maximum three week allowed"+"):");
		week = sc.nextInt();
		switch(week)
		{
			case 1:
			System.out.println("your price will be : "+price+" rupees");
			break;
			case 2:
			System.out.println("your price will be : "+(week*price)+" rupees");
			break;
			case 3:
			System.out.println("your price will be : "+(week*price)+" rupees");
			break;
			default:
			System.out.println("Please enter weeks upto 3");
		}
		sc.nextLine();
			if(week<=3)
			{
			System.out.println("book name : ");
			name = sc.nextLine();
			System.out.println("Enter ISBN : ");
			isbn = sc.nextInt();
			sc.nextLine();
			System.out.println("Issue date : ");
			issue_date = sc.nextLine();
			System.out.println("return date : ");
			return_date = sc.nextLine();
			}
	}
	
	int getid()
	{
		return isbn;
	}
	
	void returnBook()
	{
		System.out.println("enter ISBN : ");
		bookid=sc.nextInt();
		if(isbn==bookid)
		{
			System.out.println("book name : "+Library.name);
			System.out.println("Enter ISBN : "+Library.isbn);
			System.out.println("Issue date : "+Library.issue_date);
			System.out.println("return date : "+Library.return_date);
		}
			else
			{
				System.out.println("plese enter vaild ISBN");
			}
		}
		
		void details()
		{
			System.out.println(Library.price);
			System.out.println(Library.week);
			if(isbn==bookid)
			{
			System.out.println("------------------------------------");
			System.out.println("-----your issue details recepit-----");
			System.out.println("------------------------------------");
			System.out.println("book name : "+Library.name);
			System.out.println("Enter ISBN : "+Library.isbn);
			System.out.println("Issue date : "+Library.issue_date);
			System.out.println("return date : "+Library.return_date);
			System.out.println("total amount to pay : "+(Library.week*Library.price));
			System.out.println("------------------------------------");
			System.out.println("--------------thank you-------------");
			System.out.println("------------------------------------");
			}
			else
			{
				System.out.println("plese enter vaild ISBN");
			}
		}
}

class LibraryManagementSystem
{
	public static void main(String[]args)
	{
	String defaultans="yes";
	Scanner sc=new Scanner(System.in);
	Library a=new Library();
	while(true)
	{
		System.out.println("------ Welcome to Library --------");
		System.out.println("Enter 1 to take premium membership");
		System.out.println("Enter 2 to add book");
		System.out.println("Enter 3 to issue book");
		System.out.println("Enter 4 to return book");
		System.out.println("Enter 5 to print issue details");
		System.out.println("Enter 6 to exit");
        int choice = sc.nextInt();
        switch(choice)
		{
			case 1:
			a.premiumMembership();
			break;
            case 2:
            a.addBook();
            break;
            case 3:
            a.issueBook();
            break;
			case 4:
            a.returnBook();
            break;
            case 5:
            a.details();
            break;
            case 6:
            System.exit(0);
            break;
            default:
            System.out.println("Invalid choice, please try again");
            }
        }
	}
}