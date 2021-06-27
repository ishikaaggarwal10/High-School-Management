import java.util.*;

class Main {
  public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

    System.out.println("Welcome to High School Management!");
		System.out.println("Please enter your role (Administrator, Teacher, or Student): ");
		String role = in.nextLine();

		if (role.equalsIgnoreCase("Administrator") || role.equalsIgnoreCase("Admin") || role.equalsIgnoreCase("A"))
		{
			boolean hasAnn = true;
			System.out.println("Do you have any annoucement to make? (Yes / No) ");
			String ann = in.nextLine();

			if (ann.equalsIgnoreCase("yes") || ann.equalsIgnoreCase("y"))
			{
				hasAnn = true;
			}
			else if (ann.equalsIgnoreCase("no") || ann.equalsIgnoreCase("n"))
			{
				hasAnn = false;
			}

			while (hasAnn)
			{
				Administrator.annoucements(hasAnn);

				System.out.println("\nDo you have another annoucement to make? (Yes / No) ");
				ann = in.nextLine();

				if (ann.equalsIgnoreCase("yes") || ann.equalsIgnoreCase("y"))
				{
					hasAnn = true;
				}
				else if (ann.equalsIgnoreCase("no") || ann.equalsIgnoreCase("n"))
				{
					hasAnn = false;
				}
			}

			System.out.println("There are currently no annoucements, students!");
		}
		else if (role.equalsIgnoreCase("Teacher") || role.equalsIgnoreCase("T"))
		{
			System.out.println("Enter your name: ");
			String name = in.nextLine();
			System.out.println("Enter the subject you teach: ");
			String subject = in.nextLine();
			Teacher t = new Teacher(name, subject);
			Administrator.teachers.add(t);
			t.makeChoice();
		}
		else if (role.equalsIgnoreCase("Student") || role.equalsIgnoreCase("S"))
		{
      System.out.println("Enter your name: ");
      String name = in.nextLine();

      System.out.println("Enter your grade level: ");
      int gradeLevel = in.nextInt();
      in.nextLine();

      System.out.println("Enter your grade: ");
      double grade = in.nextDouble();
      in.nextLine();
      
			Student s = new Student(name, gradeLevel, grade);
     s.chooseClasses();
     s.chooseSummerCamps();
     s.findTutor();
     s.findClubsAtSchool();
     s.createResume();
		}
  }
}