public class Box{

	private int width, depth, height, grade;

	//class constructor
	public Box(int width, int height, int depth, int grade)
	{
		this.width = width;
		this.height = height;
		this.depth = depth;
		this.grade = grade;
	}

	//Two boxes should be considered equivalent if their volume is
	//the same and they are constructed out of the same grade of cardboard.
	//returns true if they are equivalent and false otherwise
	public boolean equals(Box b)
	{
		return this.getVolume() == b.getVolume() && this.getGrade() == b.getGrade();
	}

	
	//If this Box is larger than the argument Box b
	//then return this Box - otherwise return b
	public Box larger(Box b)
	{
		if(this.getVolume() > b.getVolume()){
			return this;
		}else{
			return b;
		}
	}

	//Simple getter methods
	public int getGrade()
	{
		return this.grade;
	}

	public int getVolume()
	{
		return this.width * this.height * this.depth;
	}

	public int getWidth()
	{
		return this.width;
	}

	public int getHeight()
	{
		return this.height;
	}

	public int getDepth()
	{
		return this.depth;
	}
}
