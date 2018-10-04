package org.wecancodeit.courses;

public class Course {
	private String id, name, desc;

	public Course(String id, String name, String desc) {
		this.id = id;
		this.name = name;
		this.desc = desc;
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getDesc() {
		return desc;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Course other = (Course) obj;
		if (this.id.equals(other.getId())) {
			return true;
		}
		return false;
	}

}
