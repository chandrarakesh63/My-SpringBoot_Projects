package FactoryProgram;

public class Factory {
	public static College getCollege(String departmentType) {
		
		if (departmentType == null || departmentType.isEmpty()) {
			return null;
		}

		departmentType = departmentType.toLowerCase();

		switch (departmentType) {
		case "student":
			return new Students();
		case "department":
			return new Department();
		case "nontechingstaff":
			return new NonTeachingStaff();
		case "teachingstaff":
			return new TeachingStaff();
		default:
			throw new NullPointerException("Not valid");
		}

	}
}
