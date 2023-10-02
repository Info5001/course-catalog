package model;

import model.Department;

public class Course {
    private String id;
    private String name;
    private String description;
    private Department department;
    private boolean isRequired; // if not its elective
    private int creditHours;
    private String prereq;

    public Course(String id, String name, String description, Department department, boolean isRequired, int creditHours) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.department = department;
        this.isRequired = isRequired;
        this.creditHours = creditHours;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public Department getDepartment() {
        return department;
    }
    public void setDepartment(Department department) {
        this.department = department;
    }
    public boolean isRequired() {
        return isRequired;
    }
    public void setRequired(boolean isRequired) {
        this.isRequired = isRequired;
    }
    public int getCreditHours() {
        return creditHours;
    }
    public void setCreditHours(int creditHours) {
        this.creditHours = creditHours;
    }
    public String getPrereq() {
        return prereq;
    }
    public void setPrereq(String prereq) {
        this.prereq = prereq;
    }

    public void printCourseInfo() {
        System.out.println(id + ". " + name + " (" + creditHours + " Hours)");
        System.out.println(description);
        System.out.println("This course is part of " + department.getName());
    }

}
