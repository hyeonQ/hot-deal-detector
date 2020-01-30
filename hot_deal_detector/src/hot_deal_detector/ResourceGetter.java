package hot_deal_detector;

import java.util.Scanner;

public class ResourceGetter {
	String newResource;
	
	public String getNewResource() {
		return this.newResource;
	}
	
	public void setNewResource(String newResource) {
		this.newResource = newResource;
	}
	
}

class urlGetter extends ResourceGetter {
	public urlGetter() {
		String newUrl;
		Scanner sc = new Scanner(System.in);
		System.out.println("Insert new url : ");
		newUrl = sc.nextLine();
		sc.close();

		this.setNewResource(newUrl);
	}
}

class tagGetter extends ResourceGetter {
	public tagGetter() {
		String newTag;
		Scanner sc = new Scanner(System.in);
		System.out.println("Insert new tag : ");
		newTag = sc.nextLine();
		sc.close();

		this.setNewResource(newTag);
	}
}

