package Project;

public class NorthSussexJudo extends CalculatePrice{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NorthSussexJudo obj = new NorthSussexJudo();
		obj.userName();
		obj.trainingPlan();
		obj.calTrainingcost();
		obj.currentWeight();
		obj.weightCategory();
		obj.compareWeight();
		obj.privateSessions();
		obj.calSessionCost();
		obj.numsofCompetition();
		obj.calCompeteCost();
		
		
		System.out.println("       ***Monthly Training Total Costs***        ");
		System.out.println("Name: "+ obj.getName());
		obj.calTrainingcost();
		obj.calSessionCost();
		obj.calCompeteCost();
		obj.totalCost();
		
	}

	

}