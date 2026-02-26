# 🔞 AgeChecker: The "Are You Old Enough?" App

### **General Overview**
This is a straightforward Android application built using **Kotlin**. Its sole purpose in life is to take a user's name and age, then perform a bit of "bouncer logic" to determine if they are legally an adult (18+) or still in the "juice box" phase of life. 

It serves as a fundamental example of how to link XML UI elements to Kotlin code and, more importantly, how to handle **Conditional Logic** using `if-else` statements.

---

## 🧠 The Core Logic: Understanding `if-else`

In this app, the `if-else` statement is the star of the show. Think of it as a fork in the road. The code asks a question; if the answer is **True**, it takes the left path. If it's **False**, it takes the right.



[Image of an if-else statement flowchart in programming]


### 1. The Validation Step
First, we check the actual integer value of the age. We use the `>=` (greater than or equal to) operator.

```kotlin
if (age >= 18) {
    // This block runs if the condition is MET.
    isOver18 = true
} else {
    // This block runs if the condition IS NOT met.
    isOver18 = false
}
```
### 2. The Feedback Step
Secondly, we check whether the bool variable (isOver18) is true or false and display a message accordingly.

```kotlin
if (isOver18) {
    tvMainOutput.text = "Hello $name, you are 18 or more years old!"
} else {
    tvMainOutput.text = "Hello $name, you are not over 18 years old!"
}
```
