package exercise2;

public abstract class GameTester 
{
//instance variables	
protected String name;
protected boolean status;  

//abstract method
public abstract int getSalary();

//default constructor
public GameTester() 
{

}

//constructor with 2 arguments
public GameTester(String name, boolean status) 
{
    this.name = name;
    this.status = status;
}

//returns gamer's name
public String getName() 
{
	return name;
}

//sets value of name
public void setName(String name)
{
	this.name = name;
}

}



