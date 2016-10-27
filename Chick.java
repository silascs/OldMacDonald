class Chick implements Animal 
{     
    private String myType;
    private String mySound;
    public Chick (String type, String sound1, String sound2)
    {
    	double num = Math.random();
        if(num < 0.5)
        {
            mySound = sound1;
        }
        else 
        {
            mySound = sound2;
        }
        myType =type;
    }
    public Chick ()
    {
    	myType = "unknown";
    	mySound = "unknown";
    }
    public String getSound(){return mySound;}
    public String getType(){return myType;}
}
