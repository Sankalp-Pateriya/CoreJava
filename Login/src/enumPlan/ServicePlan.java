package enumPlan;

public enum ServicePlan {
	SILVER(1000), GOLD(2000), DIAMOND(5000), PLATINUM(10000);

	private int service_plan;

	private ServicePlan(int service_plan) {
		this.service_plan = service_plan;
	}

	public int getService_plan() {
		return service_plan;
	}
	
	

}
