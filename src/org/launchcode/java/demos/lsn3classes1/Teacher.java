package org.launchcode.java.demos.lsn3classes1;

public class Teacher {

   private String firstName;
   private String lastName;
   private String subject;
   private Integer yearsTeaching;

   public void setName(String firstName) {
      this.firstName = firstName;
   }

   public void setLastName(String lastName) {
      this.lastName = lastName;
   }

   public void setSubject(String subject) {
      this.subject = subject;
   }

   public void setYearsTeaching(Integer yearsTeaching) {
      this.yearsTeaching = yearsTeaching;
   }

   public String getFirstName() {
      return firstName;
   }

   public String getLastName() {
      return lastName;
   }

   public String getSubject() {
      return subject;
   }

   public Integer getYearsTeaching() {
      return yearsTeaching;
   }

}
