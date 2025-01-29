# PostgreSQL Connection in Java using JDBC

## Overview
This guide provides step-by-step instructions to connect to a PostgreSQL database in Java using the JDBC driver.

## Tools
- **IntelliJ IDEA Ultimate (IDE)**
- **JDBC Driver:** Version 42.7.5  
- **Java Virtual Machine (JVM):** OpenJDK 23.0.1  
- **PostgreSQL:** Version 17.2 (Ubuntu 17.2-1.pgdg24.04+1)  

---

## Steps to Connect PostgreSQL with Java

### Step 1: Installing the PostgreSQL JDBC Driver
Download the latest JDBC driver from the official PostgreSQL website:  
[🔗 JDBC Driver Download](https://jdbc.postgresql.org/download/)

### Step 2: Adding JDBC to Libraries in IntelliJ
1. Open **IntelliJ IDEA Ultimate**.
2. Navigate to **File** → **Project Structure** → **Libraries**.
3. Click **Add New Library** and select the path to the downloaded JDBC driver.
4. Apply changes and close the settings.

### Step 3: Creating a Table in PostgreSQL


### Step 4: Connecting to PostgreSQL in Java
Use the `DriverManager` class to establish a connection to PostgreSQL:

```java
        String url = "jdbc:postgresql://host:port/database";
        String user = "your_username";
        String password = "your_password";
        Connection conn = DriverManager.getConnection(url, user, password);
```

Replace `host`, `port`, `database`, `your_username`, and `your_password` with actual values.

---
### Remarks
For security reasons, you should replace the values with environment variables


