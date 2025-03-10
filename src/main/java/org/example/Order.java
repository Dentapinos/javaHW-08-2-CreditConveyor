package org.example;

public class Order {
    private int creditRatingAmendment = 0;

    String firstName;
    String secondName;
    String surname;
    int age;

    Country nationality;
    Bank bindingSalaryToTheBank;
    int workExperienceInLastPlace;
    int totalWorkExperience;

    double desiredLoanAmount;
    int LoanTermInMonths;
    int salary;

    public Order(String firstName, String secondName, String surname, int age, Country nationality, Bank bindingSalaryToTheBank, int workExperienceInLastPlace, int totalWorkExperience, double desiredLoanAmount, int loanTermInMonths, int salary) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.surname = surname;
        this.age = age;
        this.nationality = nationality;
        this.bindingSalaryToTheBank = bindingSalaryToTheBank;
        this.workExperienceInLastPlace = workExperienceInLastPlace;
        this.totalWorkExperience = totalWorkExperience;
        this.desiredLoanAmount = desiredLoanAmount;
        LoanTermInMonths = loanTermInMonths;
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getLoanTermInMonths() {
        return LoanTermInMonths;
    }

    public void setLoanTermInMonths(int loanTermInMonths) {
        LoanTermInMonths = loanTermInMonths;
    }

    public double getDesiredLoanAmount() {
        return desiredLoanAmount;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setNationality(Country nationality) {
        this.nationality = nationality;
    }

    public Bank getBindingSalaryToTheBank() {
        return bindingSalaryToTheBank;
    }

    public void setBindingSalaryToTheBank(Bank bindingSalaryToTheBank) {
        this.bindingSalaryToTheBank = bindingSalaryToTheBank;
    }

    public int getWorkExperienceInLastPlace() {
        return workExperienceInLastPlace;
    }

    public void setWorkExperienceInLastPlace(int workExperienceInLastPlace) {
        this.workExperienceInLastPlace = workExperienceInLastPlace;
    }

    public int getTotalWorkExperience() {
        return totalWorkExperience;
    }

    public void setTotalWorkExperience(int totalWorkExperience) {
        this.totalWorkExperience = totalWorkExperience;
    }

    public void setDesiredLoanAmount(double desiredLoanAmount) {
        this.desiredLoanAmount = desiredLoanAmount;
    }

    public int getCreditRatingAmendment() {
        return creditRatingAmendment;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setCreditRatingAmendment() {
        this.creditRatingAmendment += 1;
    }

    public Country getNationality() {
        return nationality;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getSurname() {
        return surname;
    }
}
