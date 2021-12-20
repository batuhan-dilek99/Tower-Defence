package lab4_pck;

public class Task {
	private DueDate date;
	private int cost;
	private boolean finished;
	
	Task(DueDate date, int cost, boolean finished){
		this.date = new DueDate(date.getDay(), date.getMonth(), date.getYear());
		this.cost = cost;
		this.finished = finished;
	}
	@Override 
	public String toString(){
		return "date : " + date.getDay() + "/" + date.getMonth() + "/" + date.getYear()
				+ " cost : " + cost + " finished : " + finished;
	}
	@Override 
	public boolean equals(Object obj){
		Task copy = (Task)obj;
		if (this.date.equals(copy.getDate()) && this.cost == copy.getCost() && this.finished == copy.isFinished()){
			return true;
		}
		else{
			return false;
		}
	}
	public DueDate getDate() {
		return date;
	}
	public void setDate(DueDate date) {
		this.date = date;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public boolean isFinished() {
		return finished;
	}
	public void setFinished(boolean finished) {
		this.finished = finished;
	}
	
}
