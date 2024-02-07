package exercise;

import java.util.ArrayList;
import java.util.List;

class Student {
  private String name;
  private int score;

  public Student(String name, int score) {
    this.name = name;
    this.score = score;
  }

  public String getName() {
    return name;
  }

  public int getScore() {
    return score;
  }

}

public class LambdasExercise {

  public static void main(String[] args) {

    List<Student> students = new ArrayList<>();
    students.add(new Student("Kamil", 76));
    students.add(new Student("Anya", 45));
    students.add(new Student("Kazim", 99));
    students.add(new Student("Maria", 89));
    students.add(new Student("Nasim", 67));
    students.add(new Student("Katrina", 55));

    students.forEach(OriginalList -> {
      System.out.println(OriginalList.getName() + ", " + OriginalList.getScore());
    });

    List<String> gOS = grades(students);
    gOS.forEach(showGrades -> {
      System.out.println("\n" + showGrades);
    });

  }

  public static List<String> grades(List<Student> students) {

    List<String> gradesOfStudent = new ArrayList<>();

    students.forEach(student -> {
      String grade;
      int score = student.getScore();
      if (score >= 90 && score <= 100) {
        grade = "A";
      } else if (score >= 80 && score < 90) {
        grade = "B";
      } else if (score >= 70 && score < 80) {
        grade = "C";
      } else if (score >= 60 && score < 70) {
        grade = "D";
      } else {
        grade = "F";
      }
      gradesOfStudent.add(student.getName() + ", " + grade);
    });
    return gradesOfStudent;
  }

}
