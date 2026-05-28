# Test Cases For Job Demand Classification Algorithm

Student ID: 24s25365  
Student Name: Zaafir Sajid  
Related Requirement: FR-02

## Test Case Table

| Test Case ID | Related Requirement | Preconditions | Test Instructions / Steps | Test Data | Expected Result | Actual Result | Status |
|---|---|---|---|---|---|---|---|
| TC-01 | FR-02 | Java is installed and program is compiled | 1. Run the program. 2. Enter sector number. 3. Enter job postings. | Sector = 1, Postings = 1200 | IT sector has High Demand. | IT sector has High Demand. | Pass |
| TC-02 | FR-02 | Java is installed and program is compiled | 1. Run the program. 2. Enter sector number. 3. Enter job postings. | Sector = 2, Postings = 750 | Healthcare sector has Medium Demand. | Healthcare sector has Medium Demand. | Pass |
| TC-03 | FR-02 | Java is installed and program is compiled | 1. Run the program. 2. Enter sector number. 3. Enter job postings. | Sector = 3, Postings = 300 | Engineering sector has Low Demand. | Engineering sector has Low Demand. | Pass |
| TC-04 | FR-02 | Java is installed and program is compiled | 1. Run the program. 2. Enter invalid sector number. | Sector = 9 | Error: Invalid sector selected. | Error: Invalid sector selected. | Pass |
| TC-05 | FR-02 | Java is installed and program is compiled | 1. Run the program. 2. Enter valid sector. 3. Enter negative postings. | Sector = 5, Postings = -10 | Error: Job postings cannot be negative. | Error: Job postings cannot be negative. | Pass |
| TC-06 | FR-02 | Java is installed and program is compiled | 1. Run the program. 2. Enter sector. 3. Enter boundary value. | Sector = 4, Postings = 1000 | Education sector has High Demand. | Education sector has High Demand. | Pass |
| TC-07 | FR-02 | Java is installed and program is compiled | 1. Run the program. 2. Enter text instead of sector number. | Sector = abc | Error: Please enter a numeric sector value. | Error: Please enter a numeric sector value. | Pass |

## Traceability

All test cases are related to FR-02 because they verify the demand classification algorithm and its input validation rules.