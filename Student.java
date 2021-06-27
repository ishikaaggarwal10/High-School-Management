import java.util.*;
public class Student{

  Scanner in = new Scanner(System.in);

  private String name;
  private int gradeLevel;
  private double grade;
  private String[] math = {"Algebra", "Geometry", "Algebra II", "Pre-Calculus"};
  private String[] science = {"Biology", "Chemistry", "Physics", "Environmental Science"};
  private String[] history = {"World History", "U.S. History", "Human Geography", "Government"};
  private String[] english = {"English I", "English II", "Literature", "Language"};
  private String[] electives = {"Physical Education", "Art", "Band", "Orchestra", "Choir", "Theater", "Computer Science"};

  public Student(String SName, int SGradeLevel, double SGrade)
  {
    name = SName;
    gradeLevel = SGradeLevel;
    grade = SGrade;
  }

  public String getName() {return name;}
  public int getGradeLevel() {return gradeLevel;}
  public double getGrade() {return grade;}

  public void setGrade(double addGrade)
  {
    grade = addGrade;
  }
  
  public void chooseClasses()
  {
    ArrayList<String> classes = new ArrayList<String>();
    
    System.out.println("\nHere are all the science classes");
    for (int i = 0; i < science.length; i++)
   {
     System.out.println(science[i]);
   }

    System.out.println("\nChoose a Science Class");
    String choosenScience = in.nextLine();

  System.out.println("\nHere are all the Math classes");
  for (int i = 0; i < math.length; i++)
   {
     System.out.println(math[i]);
   }

   System.out.println("\nChoose a Math Class");
    String choosenMath = in.nextLine();

    System.out.println("\nHere are all the History classes");
    for (int i = 0; i < history.length; i++)
   {
     System.out.println(history[i]);
   }

   System.out.println("\nChoose a History Class");
   String choosenHistory = in.nextLine();

   System.out.println("\nHere are all the English Classes");
   for (int i = 0; i < english.length; i++)
   {
     System.out.println(english[i]);
   }

   System.out.println("\nChoose an English Class");
   String choosenEnglish = in.nextLine();

  System.out.println("\nHere are all the Elective Classes");
  for (int i = 0; i < electives.length; i++)
   {
     System.out.println(electives[i]);
   }

     System.out.println("\nChoose an Elective");
     String choosenElective = in.nextLine();

      classes.add(choosenScience);
      classes.add(choosenMath);
      classes.add(choosenHistory);
      classes.add(choosenEnglish);
      classes.add(choosenElective);

    System.out.println("\nGreat, You have chosen all of your classes! Here is what you have signed up for: ");

   for(int i = 0; i < classes.size(); i++)
   {
     System.out.println(classes.get(i));
   }
  }

  public void chooseSummerCamps()
  {
      System.out.println("\nYou can choose summer camps based on your interests. What are your areas of interests pick one of the following? (Art, Choir/Theater, Orchestra/Band) ");
      String choosenCampIntrest = in.nextLine();

      if(choosenCampIntrest.equalsIgnoreCase("Art")){
        System.out.println("Here are the camps available to you for this interest: (Painting, Drawing, 3D Art) Choose one that you are interested in. ");
        String choosenCamp = in.nextLine();

      System.out.println("You have signed up for " + choosenCamp + " this summmer"); 
      }

      if(choosenCampIntrest.equalsIgnoreCase("Choir/Theater")){
        System.out.println("Here are the camps available to you for this interest: (Performance camp, Drama camp) Choose one that you are interested in. ");
        String choosenCamp = in.nextLine();

      System.out.println("You have signed up for " + choosenCamp + " this summmer"); 
      }

      if(choosenCampIntrest.equalsIgnoreCase("Orchestra/Band")){
        System.out.println("Here are the camps available to you for this interest: (Instrument Specific Camp or Whole Band/Orchestra camp) Choose one that you are interested in. ");
        String choosenCamp = in.nextLine();

      System.out.println("\nYou have signed up for " + choosenCamp + " this summmer"); 
      }
  }

  public void findTutor()
  {
    System.out.println("\nDo you need a tutor for any subject? (Enter yes or no) ");
      String choosenTutorNeeded = in.nextLine();

    if(choosenTutorNeeded.equalsIgnoreCase("yes")){
    System.out.println("\nWhat subjects do you need a tutor for? ");
    String choosenSubject = in.nextLine();
    System.out.println("Your tutor will contact you soon with information about your tutoring session in " + choosenSubject);
    }
    else{
      System.out.println("\nThank you for letting us know you don't need a tutor ");
    }
  }

  public void findClubsAtSchool()
  {
     System.out.println("\nWhat are your interests? Choose from the following (Business, Community Service, The Arts, Computer Science, Academic Clubs) ");
     String choosenClubIntrest = in.nextLine();
     String choosenClub;

      if(choosenClubIntrest.equalsIgnoreCase("Business"))
      {

        System.out.println("Here are some clubs related business: (DECA, BPA, Future Buisness Leaders of America, Future Billionars Club, Entrepreneurship Club, Investment Club) Select one that you want to join ");
         choosenClub = in.nextLine();
      System.out.println("You have been signed up for " + choosenClub + "You will get an email with more information about this club and how to join it. ");
      }

      if(choosenClubIntrest.equalsIgnoreCase("Community Service"))
      {
        System.out.println("Here are some clubs related community service: (NHS, SNHS, NTHS, Key Club, Feed My Starving Children, PassionFruit, Packs 4 Peace, UNICEF) Select one that you want to join ");
         choosenClub = in.nextLine();
      System.out.println("You have been signed up for " + choosenClub + "You will get an email with more information about this club and how to join it. ");
      }

      if(choosenClubIntrest.equalsIgnoreCase("The Arts"))
      {
        System.out.println("Here are some clubs related the arts: (NAHS, art club, music club, k-pop club, sculpture club, drama club, National Thespian Honor Society) Select one that you want to join ");
         choosenClub = in.nextLine();
      System.out.println("You have been signed up for " + choosenClub + "You will get an email with more information about this club and how to join it. ");
      }

      if(choosenClubIntrest.equalsIgnoreCase("Computer Science"))
      {
        System.out.println("Here are some clubs related Computer Science: (NTHS, Computer Science Club, Hackathon Club, Society of Women Engineers, First Robotics, Girls Who Code, APP Club, Girls in STEM, AI and Machine Learning Club) Select one that you want to join ");
         choosenClub = in.nextLine();
      System.out.println("You have been signed up for " + choosenClub + "You will get an email with more information about this club and how to join it. ");
      }

      if(choosenClubIntrest.equalsIgnoreCase("Academic Clubs"))
      {
        System.out.println("Here are some clubs related Computer Science: (Academic Decathelon, Speech and Debate, Model United Nations, Mu Alpha Theta, Science Fair Club, Astronomy Club, Geology Club, Chemistry Club, Physics Club) Select one that you want to join ");
         choosenClub = in.nextLine();
      System.out.println("You have been signed up for " + choosenClub + "You will get an email with more information about this club and how to join it. ");
      }
  }
    public void createResume()
    {
        System.out.println("\nYou can create a resume to send when applying for something such as an officer position, internships, application based summer programs, job position, etc. You can use this feature to keep track of your extracurriculars, awards, and other important information for your resume.");

        System.out.println("\nList out the clubs you are involved in, your position, and any significant contribution you made Ex: (Speech and Debate Club (Congress Lead) Helped the congress team write cases and help members formulate arguments,   DECA (Vice President of Technology) Helped build the Reedy DECA Website, helped members formulate the writing process for project management written events ");
        String listingClubs = in.nextLine();

        System.out.println("List out an honors or awards you may have recived ");
        String listingAwards = in.nextLine();

        System.out.println("List out some of the technical projects you have worked on ");
        String listingProjects = in.nextLine();

        System.out.println("List out your past experiences on work or anything else ");
        String listingExperinces = in.nextLine();

        System.out.println("List out your challenging courses ");
        String listingCourses = in.nextLine();

        System.out.println("Anything else that you would like to add to your resume? ");
        String listingAnythingElse = in.nextLine();
        
        System.out.println("Everthing you have saved so far to your rough draft resume: ");
        System.out.println("Clubs : " + listingClubs);
        System.out.println("Honors or Awards : " + listingAwards);
        System.out.println("Technical Projects : " + listingProjects);
        System.out.println("Past Experiences : " + listingExperinces);
        System.out.println("Challenging Courses : " + listingCourses);
        System.out.println("Anything Else To Add To Resume : " + listingAnythingElse);
    }
}