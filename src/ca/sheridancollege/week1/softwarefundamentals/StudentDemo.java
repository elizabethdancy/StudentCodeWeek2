/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week1.softwarefundamentals;

/**
 * A model class to model Student Objects
 * @author dancye, January 23rd 2019
 */
public class StudentDemo 
{
  private String studentID;
  private String name;
  private String program;
  private int maxCourses = 3;
  
  /**
   * A constructor to pass in the given ID and then name
   * @param givenID - the ID to assign
   * @param givenName- the name to assign 
   */
  public StudentDemo(String givenID, String givenName)
  {
      studentID = givenID;
      name = givenName;
  }
  
  /**
   * A method to set the student ID
   * @param givenID the ID to set
   */
  public void setStudentID(String givenID)
  {
      studentID=givenID;
  }
  /**
   * An accessor method for studentID
   * @return the student's ID 
   */
  public String getStudentID()
  {
      return studentID;
  }

    /**
     * A method to return the student's name
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * A method to set the student's name
     * @param givenName the name to set
     */
    public void setName(String givenName) {
        name = givenName;
    }

    /**
     * The accessor method for program
     * @return the program the student is in
     */
    public String getProgram() {
        return program;
    }

    /**
     * The mutator method for program
     * @param program the student's program
     */
    public void setProgram(String givenProgram) {
        program = givenProgram;
    }

    /**
     * Returns the maximum number of courses
     * @return the maxCourses
     */
    public int getMaxCourses() {
        return maxCourses;
    }

    /** sets the maximum number of courses
     * @param givenMaxCourses the maxCourses to set
     */
    public void setMaxCourses(int givenMaxCourses) {
        maxCourses = givenMaxCourses;
    }
    
}
