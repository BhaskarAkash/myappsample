Public class Student
{
	private int roll;
	private String name;

	public Student(){
		System.out.println("We are in the Default constructor");
		}


		public Student(int roll, String name){
		this.roll = roll;
		this.name = name;
		}
}