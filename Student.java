class  Student
{
	String value;

	 public Student(String value)
	{
		 
		 this.value=value;
		 System.out.println("the student name is:"+value);
		
	}
	public Student()
	{
		value="unknown";
	}

	
	
	public static void main(String[] args) 
	{
		Student obj =new Student();
		Student s=new Student("Deepika");
		System.out.println("the Student name is:"+obj.value);
	}


}

