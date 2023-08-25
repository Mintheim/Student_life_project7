package Project;

public class CalculatePrice extends UserInput {
	double trainCost;
	double comCost;
	double privateCost;
	public void calTrainingcost() {
		
		if(getTrainingPlan().equalsIgnoreCase("Beginner")) {
			trainCost=25.00*4;
			System.out.println("Your monthly training cost: $"+ (trainCost));
		}
		if(getTrainingPlan().equalsIgnoreCase("Intermediate")) {
			trainCost=30.00*4;
			System.out.println("Your monthly training cost: $"+ (trainCost));
		}
		if(getTrainingPlan().equalsIgnoreCase("Elite")) {
			trainCost=35.00*4;
			System.out.println("Your monthly training cost: $"+ (trainCost));
		}
		
	}
	
	public void calCompeteCost() {
		comCost=getNumsofCompetition()*22.00;
		System.out.println("Your competition cost: $"+ (comCost));
	}
	
	public void calSessionCost(){
		privateCost=getNumsofPrivateSession()*4*9.00;
		System.out.println("Your monthly private session cost: $"+ (privateCost));
	}
	
	
	public void totalCost(){
		System.out.println("Your monthly total cost: $"+ (trainCost+comCost+privateCost));
	}
}