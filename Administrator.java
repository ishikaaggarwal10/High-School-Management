import java.util.*;

public class Administrator
{
	//public static final String[] names = {"Rebecca Jones", "Kelly Smith", "Rose Beth", "Sheena Stephen", "Riley Johnson", "Olivia Garcia", "Ava Miller", "Samantha Brown", "Emma Davis", "Oliver Williams", "Noah Wilson"};
	//public static final String[] subjects = {"Math", "Science", "History", "English", "Physical Education", "Art", "Band", "Orchestra", "Choir", "Theater", "Computer Science"};
  
	private int totalNumberOfClasses = 23;
  public static ArrayList<Teacher> teachers = new ArrayList<Teacher>();

  public int returnNumOfClasses()
  {
    return totalNumberOfClasses;
  }

  public static void annoucements(boolean hasAnnoucement)
  {
    if (hasAnnoucement)
    {
      System.out.println("\nWhat do you want to annouce to the whole school? ");  
      Scanner in = new Scanner(System.in);
      String announcement = in.nextLine();
      System.out.println("\nStudents, your administrator has an announcement to make: " + announcement);
    }
    else
    {
      System.out.println("There are currently no annoucements, students!");
    }
  }

	/*
	public void addTeachers()
	{
		for (int i = 0; i < subjects.length; i++)
		{
			Teacher t = new Teacher(names[i], subjects[i]);
			teachers.add(t);
		}
	}
	*/
}