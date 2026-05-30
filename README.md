# QuickChat - Part 2

## Student Details
* **Student Number:** ST10525768  * **Module:** Programming (Prog)
* **IDE:** Apache NetBeans

---

## About the Project
This is Part 2 of the QuickChat application. It builds on top of the Part 1 login system by adding the actual messaging core features. The program allows authenticated users to create messages, validates data format rules, and tracks system logs.

---

## New Features Implemented

1. **Auto-Generated IDs:** Generates a random, unique 10-digit ID for every new message.
2. **Custom Message Hash:** Creates a unique tracking hash using the ID, message count, and the first and last words of the text.
3. **Recipient Check:** Verifies that the receiver's number starts with `+` and is under 13 characters.
4. **Length Counter:** Enforces a maximum text limit of 250 characters and calculates the exact overflow amount if a message is too long.

---

## How to Run It
1. Open the project in **NetBeans**.
2. Open `Main.java`.
3. Right-click inside the file and click **Run File**.
4. Log in using your credentials to access the messaging menu options.
