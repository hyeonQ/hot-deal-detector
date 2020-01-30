package hot_deal_detector;
import java.util.ArrayList;

public class Container<T> {
	final int MAX_NUMBER = 10;
	public ArrayList<T> resources;
	
	public int getResourcesNumber() {
		return this.resources.size();
	}
	
	public void setResources(T resource) {
		if(getResourcesNumber() < this.MAX_NUMBER) {
			this.resources.add(resource);
		} else {
			System.out.println("error : RESOURCE IS FULL!!\n");
		}
	}
}
