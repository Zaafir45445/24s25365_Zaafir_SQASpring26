# Job Market Trends Analysis System

Student ID: 24s25365  
Student Name: Zaafir Sajid  
Module: COMP 30010.1 Software Quality Assurance  
Assignment: CW2 Spring 2026

## Description

This is a simple Java program for the Job Market Trends Analysis System. It classifies job demand for a selected industry sector using the number of available job postings.

## Requirement Implemented

FR-02: The system shall classify job demand level as High, Medium, or Low based on the number of available job postings.

## Demand Classification Rules

- 1000 or more job postings: High Demand
- 500 to 999 job postings: Medium Demand
- Below 500 job postings: Low Demand
- Negative postings: Error message
- Invalid sector number: Error message
- Text input instead of number: Error message

## How To Compile

```bash
javac 24s25365_Zaafir.java
```

## How To Run

```bash
java JobDemandClassifier
```

## Sample Output

```text
Job Market Trends Analysis System
This program classifies job demand by sector and number of job postings.
Choose one sector by entering only the number from 1 to 5.
1. IT
2. Healthcare
3. Engineering
4. Education
5. Tourism
Enter sector number: 1
Enter number of job postings: 1200
IT sector has High Demand.
```

## Repository

Repository name: `24s25365_Zaafir_SQASpring26`

Main Java file: `24s25365_Zaafir.java`
