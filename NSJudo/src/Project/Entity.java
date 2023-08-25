package Project;

public class Entity {
	// variable declaration
	private String name;
	private String trainingPlan;
	private double currentWeight;
	private String weightCategory;
	private int numsofCompetition;
	private int numsofPrivateSession;
	
	//getter and setter generate
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTrainingPlan() {
		return trainingPlan;
	}
	public void setTrainingPlan(String trainingPlan) {
		this.trainingPlan = trainingPlan;
	}
	public double getCurrentWeight() {
		return currentWeight;
	}
	public void setCurrentWeight(Double currentWeight) {
		this.currentWeight = currentWeight;
	}
	
	public String getWeightCategory() {
		return weightCategory;
	}
	public void setWeightCategory(String weightCategory) {
		this.weightCategory = weightCategory;
	}
	public int getNumsofCompetition() {
		return numsofCompetition;
	}
	public void setNumsofCompetition(int numsofCompetition) {
		this.numsofCompetition = numsofCompetition;
	}
	public int getNumsofPrivateSession() {
		return numsofPrivateSession;
	}
	public void setNumsofPrivateSession(int numsofPrivateSession) {
		this.numsofPrivateSession = numsofPrivateSession;
	}
	

}
