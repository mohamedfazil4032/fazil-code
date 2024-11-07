package in.sp.bean;

import java.util.List;

public class Subject {
	
	private List<String> subj;

	
	public Subject(List<String> subj) {
		this.subj = subj;
	}

	@Override
	public String toString() {
		return "Subject [subj=" + subj + "]";
	}
	
}
