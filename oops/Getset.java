//get---to return the value
//set---to modify the value
//this ---keyword refer to the current object
public class Getset{
    private String name;//only be accessed within same class

    //getter
    public String getName()
    {
        return name;
    }

    //setter
    public void setName (String newName)
    {
        this.name= newName;
    }
    
}