class NamedCow extends Cow
{
	private String myName;
	public NamedCow(String name)
	{
		myName = name;
	}
	public Namedcow()
	{
		myName = "unknown";
	}
	public String getName(){return myName;}
}