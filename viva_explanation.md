# Viva Explanation

## Project Idea

My project is a Job Market Trends Analysis System. It helps users understand job demand in different sectors such as IT, Healthcare, Engineering, Education, and Tourism.

## Requirement Implemented In Java

I implemented FR-02. The requirement says that the system should classify job demand as High, Medium, or Low based on the number of job postings.

## How The Program Works

The program first asks the user to select a sector from 1 to 5. It checks whether the input is a number. Then it uses a switch statement to select the sector name.

After that, the program asks for the number of job postings. It checks whether the input is numeric and whether the value is negative. Then it uses if-else statements:

- 1000 or more means High Demand
- 500 to 999 means Medium Demand
- Less than 500 means Low Demand

## Why Switch Is Used

Switch is used because the user selects from fixed sector numbers. Each number matches one sector.

## Why If-Else Is Used

If-else is used because the demand level depends on numeric conditions.

## Cyclomatic Complexity

The program has 6 decision points:

1. Check numeric sector input
2. Switch sector choice
3. Check numeric postings input
4. Check negative postings
5. Check High Demand threshold
6. Check Medium Demand threshold

Using the formula:

```text
V(G) = decision points + 1
V(G) = 6 + 1 = 7
```

So the cyclomatic complexity is 7.

## Defect Density

Before debugging, I recorded 3 defects:

1. Text input was not handled safely.
2. Threshold values were hard-coded.
3. Sector choices were not explained clearly.

The final Java file has 78 lines of code:

```text
KLOC = 78 / 1000 = 0.078
Defect Density = 3 / 0.078 = 38.46 defects per KLOC
```

The value is high because the program is small. After fixing the defects, the program passed the test cases.

## GitHub 

GitHub is used for version control. The main branch contains the original working code. The `switch-update` branch shows a change inside the switch structure. The `ifelse-update` branch shows a change inside the if-else threshold logic.

## Jira 

Jira is used to show QA roles, requirements, and test cases. The test cases are linked to FR-02 so that traceability is shown.
