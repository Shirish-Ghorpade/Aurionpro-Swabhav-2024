package com.aurionpro.comparator.model;

import java.util.Comparator;

public class StudentComparator {

	public static class StudentNameComparator implements Comparator<Student> {
		public int compare(Student s1, Student s2) {
			return s1.getName().compareTo(s2.getName());
		}
	}

	public static class StudentPercentageComparator implements Comparator<Student> {
		public int compare(Student s1, Student s2) {
			if (s1.getPercentage() > s2.getPercentage()) {
				return 1;
			}
			if (s1.getPercentage() < s2.getPercentage()) {
				return -1;
			}
			return 0;
		}
	}

	public static class StudentRollNumberComparator implements Comparator<Student> {

		public int compare(Student s1, Student s2) {
			if (s1.getRollNo() > s2.getRollNo()) {
				return 1;
			}
			if (s1.getRollNo() < s2.getRollNo()) {
				return -1;
			}
			return 0;
		}

	}

}
