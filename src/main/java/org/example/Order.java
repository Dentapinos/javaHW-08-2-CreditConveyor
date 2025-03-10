package org.example;

import lombok.*;

@Setter
@Getter
@RequiredArgsConstructor
public class Order {
    @Setter(AccessLevel.NONE)
    private int creditRatingAmendment = 0;

    private final String firstName;
    private final String secondName;
    private final String surname;
    private final int age;

    private final Country nationality;
    private final Bank bindingSalaryToTheBank;
    private final int workExperienceInLastPlace;
    private final int totalWorkExperience;

    private final double desiredLoanAmount;
    private final int LoanTermInMonths;
    private final int salary;

    public void setCreditRatingAmendment() {
        this.creditRatingAmendment += 1;
    }
}
