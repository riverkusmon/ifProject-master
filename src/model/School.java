package model;

public class School
{
	
	//--------Declaring properties---------
		private String student;
		private boolean CTEC;
		private int apClasses;
		private int classNum;
		private String school;
		private String CTECanswer;
		

		/**
		 * Default Constructor for School info
		 * Initializes all variables to valid but "bad" values
		 * Used for later customization
		 **/
		public School()
		{
			
		}
		
		/**
		 * Initializes a Run instance with a value for the Distance.
		 * @param classNum The number of classes
		 * @param CTEC Indicates whether or not the student is enrolled in CTEC
		 * @param student Indicates if the person is a student
		 * @param apClasses The number of AP classes
		 * @param school The home school of the person
		 */
		public School(String student, boolean CTEC, String school, int apClasses, int classNum)
		{
			this.student = "yes";
			this.CTEC = false;
			this.school = "unnamed school";
			this.apClasses = 0;
			this.classNum = 8;
		}
		
//----------------Getters Section------------------------------\\
		public String getStudent()
		{
			return student;
		}
		
		public boolean getCTEC()
		{
			return CTEC;
		}
		
		public String getSchool()
		{
			return school;
		}
		
		public int getAP()
		{
			return apClasses;
		}
		
		public int getclassNum()
		{
			return classNum;
		}
		
		public String getCTECans()
		{
			return CTECanswer;
		}
//----------------Setters Section---------------------------------
		public void setStudent(String student)
		{
			this.student = student;
		}
		
		public void setCTEC(boolean CTEC)
		{
			this.CTEC = CTEC;
		}
		
		public void setSchool(String school)
		{
			this.school = school;
		}
		
		public void setAP(int apClasses)
		{
			this.apClasses = apClasses;
		}
		
		public void setclassNum(int classNum)
		{
			this.classNum = classNum;
		}
		
		public void setCTECans(String CTECanswer)
		{
			this.CTECanswer = CTECanswer;
		}
		
		public String toString()
		{
			String schoolDescription = "You are a student at " + getSchool() + " and you " + getCTECans() + " enrolled in CTEC. You have " + 
		                               getclassNum() + " classes, " + getAP() + " of which are AP classes";
			
			return schoolDescription;
		}
}


