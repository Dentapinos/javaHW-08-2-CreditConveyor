package org.example;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class Order {
    @Setter(AccessLevel.NONE)
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

    public void setCreditRatingAmendment() {
        this.creditRatingAmendment += 1;
    }
}
