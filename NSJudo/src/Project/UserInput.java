package Project;


import java.security.PublicKey;
import java.util.Scanner;




public class UserInput extends Entity{ 
	Scanner input= new Scanner(System.in);
	public void userName () {
		System.out.println("Welcome to North Sussex Judo");
		while(true){
			String regex="([A-Z][a-z]+)(\s[A-Z][a-z]+)*"; 
			System.out.println("Please, Enter Athlete name");
			setName(input.nextLine()); 

			if(getName().matches(regex)) {
				break; 
			}else {
				System.out.println("Entered name is invalid, please enter again");
			}
		}

	}

	public void trainingPlan() {
		System.out.println("           Training Plans          ");
		System.out.println("Beginner      (2 sessions per week\")-weekly fee----- $25.00");
		System.out.println("Intermediate  (3 sessions per week\")-weekly fee----- $30.00");
		System.out.println("Elite         (5 sessions per week\")-weekly fee----- $35.00");
		System.out.println("Please, select your training plan");

//while looping for condition
		while(true) {
			setTrainingPlan(input.nextLine());
			if (getTrainingPlan().equalsIgnoreCase("Beginner") || getTrainingPlan().equalsIgnoreCase("Intermediate")|| getTrainingPlan().equalsIgnoreCase("Elite"))
			{	
				break;

			}
			else {
				System.out.println("Your Training plan is invalid!!. Please select again!!");
			}

		}
	
	}

	public void currentWeight() {
		System.out.println("Please, Enter your current weight");

		while(true) {
			setCurrentWeight(input.nextDouble());

			if (getCurrentWeight()<=66.00) {
				System.out.println("**You are in Fly weight**");
			}
			else if (getCurrentWeight()<=73.00) {
				System.out.println("**You are in Light weight**");

			}
			else if (getCurrentWeight()<=81.00) {
				System.out.println("**You are in Light-middle weight**");

			}
			else if (getCurrentWeight()<=90.00) {
				System.out.println("**You are in Middle weight**");

			}
			else if (getCurrentWeight()<=100.00) {
				System.out.println("**You are in Light-heavy weight**");

			}
			else  {
				System.out.println("**You are in Heavy weight**");

			}
			break;
		}

	}

	public void weightCategory() {
		System.out.println("        Weight Category     ");
		System.out.println("1. 0  kg to 66kg------------Flyweight");
		System.out.println("2. 67 kg to 73kg------------Lightweight");
		System.out.println("3. 74 kg to 81kg------------Light-Middleweight");
		System.out.println("4. 82 kg to 90kg------------Middleweight");
		System.out.println("5. 91 kg to 100kg-----------Light-Heavyweight");
		System.out.println("6. over 100kg(unlimited)----Heavyweight");
		
		input.nextLine();
	System.out.println("Please, enter weight category for competition");
// checking weight categories condition according to users' inputs
while(true) {
			setWeightCategory(input.nextLine());
			if (getWeightCategory().equalsIgnoreCase("Flyweight") || getWeightCategory().equalsIgnoreCase("Lightweight") || getWeightCategory().equalsIgnoreCase("Light-middleweight")|| getWeightCategory().equalsIgnoreCase("Middleweight")
					||getWeightCategory().equalsIgnoreCase("Light-Heavy weight")||getWeightCategory().equalsIgnoreCase("Heavyweight"))
			{	
				break;

			}
			else {
					System.out.println("Your weight category is invalid!!. Please, enter again!!");
			}
			
		
		}
		
	}
	
	public void compareWeight() {
	double curweight= getCurrentWeight();
	String weightcategory= getWeightCategory();
	if(weightcategory.equalsIgnoreCase("flyweight")) {
		if(curweight<=66) {
			System.out.println("Your current weight is equal to the same with competition weight category");
		}
		else {
			System.out.println("You should lose"+ (curweight-66) + "kg.");
		}
	}
	
	if(weightcategory.equalsIgnoreCase("lightweight")){
		if(curweight>66 && curweight<=73) {
			System.out.println("Your current weight is equal to the same with competition weight category");
		}
		else {
			if(curweight<67) {
				System.out.println("You should gain "+ (67-curweight)+ "kg.");
			}
			else {
				System.out.println("You should lose "+ (curweight-73)+ "kg.");
			}
		}
	}
	
	if(weightcategory.equalsIgnoreCase("light-middleweight")){
		if(curweight>73 && curweight<=81) {
			System.out.println("Your current weight is equal to the same with competition weight category");
		}
		else {
			if(curweight<74) {
				System.out.println("You should gain "+ (74-curweight)+ "kg.");
			}
			else {
				System.out.println("You should lose "+ (curweight-81)+ "kg.");
			}
		}
	}
	
	
	if(weightcategory.equalsIgnoreCase("middleweight")) {
		if(curweight>81 && curweight<=90) {
			System.out.println("Your current weight is equal to the same with competition weight category");
		}
		else {
			if(curweight<82) {
				System.out.println("You should gain "+ (82-curweight)+ "kg.");
			}
			else {
				System.out.println("You should lose "+ (curweight-90)+ "kg.");
			}
		}
	}
	
	if(weightcategory.equalsIgnoreCase("light-heavyweight")) {
		if(curweight>90 && curweight<=100) {
			System.out.println("Your current weight is equal to the same with competition weight category");
		}
		else {
			if(curweight<91) {
				System.out.println("You should gain "+ (91-curweight)+ "kg.");
			}
			else {
				System.out.println("You should lose "+ (curweight-100)+ "kg.");
			}
		}
	}
	
	if(weightcategory.equalsIgnoreCase("heavyweight")) {
		if(curweight>100) {
			System.out.println("Your current weight is equal to the same with competition weight category");
		}
		else {
			System.out.println("You should gain"+ (101-curweight) + "kg.");
		}
	
		
	}
		
	}

	
	public void privateSessions(){
		System.out.println("Enter the number of hours of private coaching!!!");
		while(true){
		 setNumsofPrivateSession(input.nextInt());
		if(getNumsofPrivateSession()>5)
	{
		System.out.println("Can receive a maximum of five hours’ private coaching a week !"
				+ "Please enter again!");
		}
else {
	   break; }
 }
	}
	
	public void numsofCompetition(){
		if(getTrainingPlan().equalsIgnoreCase("Beginner")){
			System.out.println("There is no competition for beginner!!!");			
		}
		else {
			System.out.println("Enter the number of competition");
			 setNumsofCompetition(input.nextInt());
			
			}

		}

}
