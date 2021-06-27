import java.util.*;

public class Teacher
{
  Scanner in = new Scanner(System.in);

  private static final String[] math = {"Algebra", "Geometry", "Algebra II", "Pre-Calculus"};
  private static final String[] science = {"Biology", "Chemistry", "Physics", "Environmental Science"};
  private static final String[] history = {"World History", "U.S. History", "Human Geography", "Government"};
  private static final String[] english = {"English I", "English II", "Literature", "Language"};
  private static final String[] electives = {"Physical Education", "Art", "Band", "Orchestra", "Choir", "Theater", "Computer Science"};

  private String name;
  private String subject;
	public ArrayList<Student> students = new ArrayList<Student>();
  
  public Teacher(String name, String subject)
  {
    this.name = name;
    this.subject = subject;
  }

  public void makeChoice()
  {
		int action = -1;
		
		while (action != 0)
		{
			System.out.println("\nEnter 1 to manage student grades, 2 to add a new student, 3 to view your classes, 4 to see all of your students, or 0 to quit. ");
			action = in.nextInt();
			in.nextLine();

			if (action == 1)
			{
				System.out.println("\nManage Student Grades");
				manageStudentGrades();
			}
			else if (action == 2)
			{
				System.out.println("\nAdd a New Student");
				addNewStudent();
			}
			else if (action == 3)
			{
				System.out.println("\nView Your Classes");
				viewClasses();
			}
			else if (action == 4)
			{
				System.out.println("\nView All of Your Students");
				viewStudents();
			}
		}

		System.out.println("\nYou are done.");
  }

  private void manageStudentGrades()
  {
    System.out.println("Enter the name of the student: ");
		String sName = in.nextLine();

		Student s = students.get(0);

    for (int i = 1; i < students.size(); i++)
		{
			if (students.get(i).getName().equalsIgnoreCase(sName))
			{
				s = students.get(i);
				System.out.println(s.getName() + " is in " + s.getGradeLevel() + "th grade and " + s.getName() + "'s grade is a " + s.getGrade());
			}
		}

		System.out.println("Do you want to change " + sName + "'s grades? (Yes / No) ");
		String changeGrade = in.nextLine();

		if (changeGrade.equalsIgnoreCase("Yes") || changeGrade.equalsIgnoreCase("Y"))
		{
			System.out.println("Enter " + sName + "'s new grade: ");
			double newGrade = in.nextDouble();
			in.nextLine();
			
			s.setGrade(newGrade);

			System.out.println("Grade has been changed.");
		}
  }

  private void addNewStudent()
  {
		System.out.println("Enter the name of the student: ");
		String sName = in.nextLine();
		System.out.println("Enter " + sName + "'s grade level: ");
		int sGradeLevel = in.nextInt();
		in.nextLine();
		System.out.println("Enter " + sName + "'s current grade: ");
		double sGrade = in.nextDouble();
		in.nextLine();

		Student s = new Student(sName, sGradeLevel, sGrade);
		students.add(s);

		System.out.println("Student has been added.");
  }

  private void viewClasses()
  {
		System.out.println("You teach: ");

		if (subject.equalsIgnoreCase("Math"))
    {
			for (int i = 0; i < math.length; i++)
			{
				System.out.println(math[i]);
			}
    }
    else if (subject.equalsIgnoreCase("Science"))
		{
			for (int i = 0; i < science.length; i++)
			{
				System.out.println(science[i]);
			}
		}
		else if (subject.equalsIgnoreCase("History"))
		{
			for (int i = 0; i < history.length; i++)
			{
				System.out.println(history[i]);
			}
		}
		else if (subject.equalsIgnoreCase("English"))
		{
			for (int i = 0; i < english.length; i++)
			{
				System.out.println(english[i]);
			}
		}
		else
		{
			System.out.println(subject);
		}
  }

	public void viewStudents()
	{
		for (int i = 0; i < students.size(); i++)
		{
			Student s = students.get(i);
			System.out.println(s.getName() + ", " + s.getGradeLevel() + "th grade " + ", Current Grade: " + s.getGrade());
		}
	}
}