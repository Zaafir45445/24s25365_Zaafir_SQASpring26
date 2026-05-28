# GitHub Issue Text

## Repository Description

```text
COMP 30010.1 Software Quality Assurance CW2 Spring 2026 - Job Market Trends Analysis System
```

## Branches And Commits

| Branch | Change | Commit Message |
|---|---|---|
| `switch-update` | Add Logistics sector inside switch structure | `Added Logistics sector in switch structure` |
| `ifelse-update` | Update High Demand threshold from 1000 to 1200 | `Updated high demand threshold in if-else condition` |

## Issue 1

Title:

```text
Input validation for non-numeric values needed
```

Problem:

```text
The program validates negative numbers but does not handle text input safely.
```

Review comment:

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

## Issue 2

Title:

```text
Demand threshold values should be easier to maintain
```

Problem:

```text
Threshold values are directly written inside if-else conditions.
```

Review comment:

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
