# SOFTWARE QUALITY ASSURANCE CW2 REPORT

## Title Page

Module Code: COMP 30010.1  
Module Name: Software Quality Assurance  
Assignment: CW2 Spring 2026  
Selected Topic: Job Market Trends Analysis System  
Student ID: 24s25365  
Student Name: Zaafir Sajid  
Repository Name: 24s25365_Zaafir_SQASpring26

## Table Of Contents

1. Introduction  
2. Task 1a: QA Team Structure  
3. Task 1b: Functional Requirements  
4. Task 1c: Algorithm, Flowgraph, Cyclomatic Complexity, and Independent Paths  
5. Task 1d: Test Case Recording  
6. Task 2a: GitHub Configuration Management  
7. Task 2b: GitHub Issue Tracking and Review  
8. Task 3a: Software Metrics and Defect Density  
9. Task 3b: Process Improvement from CMM Level 3 to Level 4  
10. Conclusion  
11. References

## 1. Introduction

The selected project is the Job Market Trends Analysis System. The purpose of this system is to analyze employment data and hiring trends so that users can understand job demand in different industry sectors. This can help in workforce planning and decision making.

For this assignment, Jira is used as the quality management tool for users, roles, requirements, and test cases. GitHub is used for version control, branches, review issues, corrective actions, and closing issues. Java is used to implement one of the functional requirements.

## 2. Task 1a: QA Team Structure

For this project, I selected a QA team of five members. This number is enough because the project is small, but the important QA work is still divided clearly.

| No. | QA Role | Main Responsibility |
|---|---|---|
| 1 | QA Manager | Plans QA work, checks progress, and makes sure quality activities are followed. |
| 2 | Requirement Analyst | Checks that requirements are clear, complete, and testable. |
| 3 | Test Lead | Prepares the test plan and assigns testing work. |
| 4 | Test Engineer | Writes and runs test cases and records actual results. |
| 5 | Automation Tester | Helps with repeated test execution and regression testing. |

Five members are suitable because each person has a specific QA duty. The Requirement Analyst helps avoid defects at the start. The Test Lead and Test Engineer check whether the system meets the requirements. The Automation Tester helps make repeated testing faster. The QA Manager controls the overall process.

## 3. Task 1b: Functional Requirements

Two functional requirements were selected because they match the main purpose of the Job Market Trends Analysis System.

| Requirement ID | Functional Requirement | Priority | Tool Evidence | Labels |
|---|---|---|---|---|
| FR-01 | The system shall allow users to search job demand trends by industry sector such as IT, Healthcare, Engineering, Education, and Tourism. | High | Jira requirement/story issue | requirement, SQA, job-market |
| FR-02 | The system shall classify job demand level as High, Medium, or Low based on the number of available job postings. | High | Jira requirement/story issue | requirement, SQA, job-market |

### Acceptance Criteria

| Requirement ID | Acceptance Criteria |
|---|---|
| FR-01 | 1. User can select or enter an industry sector. 2. System displays trend information for the selected sector. 3. If the sector is not available, the system shows a clear message. |
| FR-02 | 1. 1000 or more postings means High Demand. 2. 500 to 999 postings means Medium Demand. 3. Less than 500 postings means Low Demand. 4. Invalid and negative input values show error messages. |

FR-01 is important because users need to search job demand by sector. Without this, the system will not support its main objective. FR-02 is important because it changes raw job posting numbers into a simple demand level. This makes the output easier for users to understand.

These requirements support project quality because they are clear, measurable, and easy to test.

## 4. Task 1c: Algorithm, Flowgraph, Cyclomatic Complexity, and Independent Paths

The Java program implements FR-02. The program asks the user to select an industry sector and then enter the number of job postings. It uses a switch statement to identify the selected sector. It uses if-else statements to classify demand as High, Medium, or Low.

### Algorithm Explanation

1. Display the sector menu.
2. Check whether the sector input is numeric.
3. Use switch to match the sector number with the sector name.
4. If the sector is invalid, display an error message.
5. Ask for the number of job postings.
6. Check whether the job posting input is numeric.
7. If postings are negative, display an error message.
8. Use if-else to classify demand:
   - 1000 or more postings: High Demand
   - 500 to 999 postings: Medium Demand
   - Less than 500 postings: Low Demand

### Pseudocode

```text
Start
Display sector menu
Input sector choice

If sector choice is not numeric
    Display numeric sector error
    Stop

Switch sector choice
    Case 1: sector = IT
    Case 2: sector = Healthcare
    Case 3: sector = Engineering
    Case 4: sector = Education
    Case 5: sector = Tourism
    Default: display invalid sector error and stop

Input number of job postings

If job postings input is not numeric
    Display numeric postings error
    Stop

If job postings < 0
    Display negative postings error
Else if job postings >= 1000
    Display High Demand
Else if job postings >= 500
    Display Medium Demand
Else
    Display Low Demand

End
```

The full Mermaid flowgraph is provided in `flowgraph.md`.

### Cyclomatic Complexity

Formula used:

```text
V(G) = Number of decision points + 1
```

Decision points in the actual Java program:

| No. | Decision Point | Reason |
|---|---|---|
| 1 | `!scanner.hasNextInt()` for sector input | Checks if sector input is numeric |
| 2 | `switch (sectorChoice)` | Selects sector or invalid sector path |
| 3 | `!scanner.hasNextInt()` for postings input | Checks if postings input is numeric |
| 4 | `jobPostings < 0` | Checks negative value |
| 5 | `jobPostings >= HIGH_DEMAND_THRESHOLD` | Checks High Demand |
| 6 | `jobPostings >= MEDIUM_DEMAND_THRESHOLD` | Checks Medium Demand |

```text
V(G) = 6 + 1 = 7
```

The cyclomatic complexity is 7. The switch statement has multiple case options, but for this calculation it is counted as one decision point because it is one switch decision in the program.

### Independent Paths

| Path No. | Independent Path |
|---|---|
| 1 | Start -> sector input is text -> numeric sector error -> End |
| 2 | Start -> numeric sector input -> invalid sector -> invalid sector error -> End |
| 3 | Start -> valid sector IT -> postings input is text -> numeric postings error -> End |
| 4 | Start -> valid sector Tourism -> postings = -10 -> negative postings error -> End |
| 5 | Start -> valid sector IT -> postings = 1200 -> High Demand -> End |
| 6 | Start -> valid sector Healthcare -> postings = 750 -> Medium Demand -> End |
| 7 | Start -> valid sector Engineering -> postings = 300 -> Low Demand -> End |


## 5. Task 1d: Test Case Recording

The test cases are prepared for FR-02. The test cases include normal values, invalid sector input, negative postings, boundary value, and text input validation. This gives traceability between the requirement, algorithm, and testing.

| Test Case ID | Requirement | Test Data | Expected Result | Actual Result | Status |
|---|---|---|---|---|---|
| TC-01 | FR-02 | Sector = 1, Postings = 1200 | IT sector has High Demand. | IT sector has High Demand. | Pass |
| TC-02 | FR-02 | Sector = 2, Postings = 750 | Healthcare sector has Medium Demand. | Healthcare sector has Medium Demand. | Pass |
| TC-03 | FR-02 | Sector = 3, Postings = 300 | Engineering sector has Low Demand. | Engineering sector has Low Demand. | Pass |
| TC-04 | FR-02 | Sector = 9 | Error: Invalid sector selected. | Error: Invalid sector selected. | Pass |
| TC-05 | FR-02 | Sector = 5, Postings = -10 | Error: Job postings cannot be negative. | Error: Job postings cannot be negative. | Pass |
| TC-06 | FR-02 | Sector = 4, Postings = 1000 | Education sector has High Demand. | Education sector has High Demand. | Pass |
| TC-07 | FR-02 | Sector = abc | Error: Please enter a numeric sector value. | Error: Please enter a numeric sector value. | Pass |

The detailed test case file is provided in `test_cases.md`. 


## 6. Task 2a: GitHub Configuration Management

The GitHub repository for this assignment is:

```text
24s25365_Zaafir_SQASpring26
```

The main branch contains the original Java program:

```text
24s25365_Zaafir.java
```

The purpose of using GitHub is to show version management. The original working code is kept in the main branch. Two separate branches are created for two separate changes.

| Branch Name | Change Made | Commit Message |
|---|---|---|
| switch-update | Add Logistics sector inside the switch structure. | Added Logistics sector in switch structure |
| ifelse-update | Update High Demand threshold from 1000 to 1200. | Updated high demand threshold in if-else condition |

### switch-update Change

In the `switch-update` branch, the sector menu is updated with:

```java
System.out.println("6. Logistics");
```

The switch structure is updated with:

```java
case 6:
    sector = "Logistics";
    break;
```

### ifelse-update Change

In the `ifelse-update` branch, the high demand threshold is updated from:

```java
private static final int HIGH_DEMAND_THRESHOLD = 1000;
```

to:

```java
private static final int HIGH_DEMAND_THRESHOLD = 1200;
```

## 7. Task 2b: GitHub Issue Tracking and Review

For quality review, a collaborator or technical expert should review the Java code from a quality perspective. The review gaps are documented as GitHub issues. Feedback, corrective action, and closing comments are added before closing the issues.

### GitHub Issue 1

Title:

```text
Input validation for non-numeric values needed
```

Problem:

```text
The program validates negative numbers but does not handle text input safely.
```

Feedback comment:

```text
Good point. Text input can cause incorrect program behavior, so input should be checked before reading the number.
```

Corrective action comment:

```text
Added hasNextInt() validation for sector input and job posting input.
```

Closing comment:

```text
Issue resolved after adding numeric input validation and retesting the program.
```

### GitHub Issue 2

Title:

```text
Demand threshold values should be easier to maintain
```

Problem:

```text
Threshold values are directly written inside if-else conditions.
```

Feedback comment:

```text
The threshold values should be separated from the if-else conditions so future updates are easier.
```

Corrective action comment:

```text
Added constants HIGH_DEMAND_THRESHOLD and MEDIUM_DEMAND_THRESHOLD.
```

Closing comment:

```text
Issue resolved after replacing direct threshold values with constants.
```

## 8. Task 3a: Software Metrics and Defect Density

The algorithm was converted into executable Java code. The program was compiled and tested using the test cases in `test_cases.md`.

Compile command:

```text
javac 24s25365_Zaafir.java
```

Run command:

```text
java JobDemandClassifier
```

### Defects Recorded Before Debugging

| Defect ID | Defect Before Debugging | Severity | Corrective Action |
|---|---|---|---|
| D1 | Invalid text input causes `InputMismatchException`. | Medium | Added `hasNextInt()` validation before reading numeric input. |
| D2 | Threshold values are hard-coded inside if-else conditions. | Low | Added `HIGH_DEMAND_THRESHOLD` and `MEDIUM_DEMAND_THRESHOLD` constants. |
| D3 | Sector choices are not fully explained to the user. | Low | Added a clear instruction telling the user to enter only numbers from 1 to 5. |

### Defect Density Calculation

Formula:

```text
Defect Density = Number of Defects / KLOC
```

Actual Java source code size:

```text
Lines of code = 78
KLOC = 78 / 1000 = 0.078
Number of defects before debugging = 3
Defect Density = 3 / 0.078 = 38.46 defects per KLOC
```

The defect density value looks high because the program is very small. In a small Java program, even three defects make the defect density look large. From a QA point of view, the defects were not major functional failures, but they still affected input safety, maintainability, and usability.

After corrective action, the program passed the prepared test cases. The quality is acceptable for this assignment because the requirements are documented, test cases are linked to the requirement, boundary testing is included, and code review issues are corrected.

QA practices used:

- Requirements were written before testing.
- Test cases were prepared for normal, invalid, negative, boundary, and text input.
- Defects were recorded before debugging.
- Corrective actions were applied.
- GitHub branches were used for version control.
- GitHub issues were used for review gaps.

## 9. Task 3b: Process Improvement from CMM Level 3 to Level 4

CMM Level 3 is called Defined. At this level, the organization has standard processes and follows documented procedures. CMM Level 4 is called Quantitatively Managed. At this level, the organization uses measurements and data to control process performance. The CMMI Institute explains that maturity levels support process improvement, and Level 4 focuses on quantitative management of performance.

For the Job Market Trends Analysis System, the proposed framework is a Quantitative QA Process Framework. The aim is to keep the defined process from Level 3 and add measurement practices for Level 4.

### Four Practices Across Project Phases

| Project Phase | Practice | Measurement Example | How It Improves Control and Quality |
|---|---|---|---|
| Requirements | Requirement stability measurement | Number of changed requirements per week | Helps control scope and shows whether requirements are stable. |
| Coding | Defect density tracking | Defects per KLOC | Shows whether the code is improving or becoming risky. |
| Testing | Test coverage and pass rate monitoring | Passed tests / total tests | Shows whether testing is strong enough and whether requirements are covered. |
| Review and Management | Process performance baseline and quantitative review | Average defect rate, average pass rate, and rework rate | Helps compare current performance with past project data. |

### Literature Review and Industry Examples

The ISO/IEC/IEEE 29119 software testing series provides internationally agreed software testing standards. This supports the idea that testing should be planned, managed, and measured. IEEE also provides ISO/IEC/IEEE 29119-2 for test processes, which supports structured testing activities.

In industry, Microsoft uses practices such as code review, testing, build checks, and defect tracking to improve software quality. High-reliability projects, such as NASA-style safety-critical projects, depend strongly on metrics, reviews, and defect prevention because failures can be expensive and dangerous. CMMI-based organizations use quantitative process management to make project results more predictable.

For this project, Level 4 improvement means the QA team should not only follow a defined process, but also measure the process. For example, the team can measure defect density, test pass rate, requirement changes, and review issues. This gives better control because project decisions are based on data instead of only opinion.


## 10. Conclusion

This assignment applied software quality assurance activities to the Job Market Trends Analysis System. A QA team structure was prepared, two functional requirements were written, and one requirement was implemented using Java. The Java program includes a switch statement and if-else statements. A flowgraph, cyclomatic complexity calculation, and independent paths were prepared.

Jira is used for QA roles, requirements, test cases, and traceability. GitHub is used for version management, branches, code review issues, corrective actions, and issue closure. Defect density was calculated, and a CMM Level 3 to Level 4 improvement framework was proposed.

## 11. References

CMMI Institute. (2026). *CMMI levels of capability and performance*. https://dev.cmmiinstitute.com/learning/appraisals/levels

IEEE Standards Association. (2021). *ISO/IEC/IEEE 29119-2-2021: Software and systems engineering - Software testing - Part 2: Test processes*. https://standards.ieee.org/standard/29119-2-2021.html

ISO/IEC JTC 1/SC 7. (n.d.). *ISO/IEC/IEEE 29119 series*. https://committee.iso.org/sites/jtc1sc7/home/projects/flagship-standards/isoiecieee-29119-series.html
