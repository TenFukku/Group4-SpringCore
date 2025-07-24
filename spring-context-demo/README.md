# Spring Context Demo

**This project demonstrates core concepts of the Spring IoC Container through a simulated Student Support System.**

## Objectives

Showcase how Spring Context works using simple and relatable components:

- **Bean creation and lifecycle**
- **Dependency injection (@Autowired)**
- **Lazy loading (@Lazy)**
- **Bean ordering (@DependsOn)**
- **Application context awareness**

## How to Run

### Requirements

- **Java 8+**
- **Maven**

### Commands

```bash
mvn clean compile  
mvn exec:java -Dexec.mainClass="com.example.contextdemo.framework.App"
```

## Output

The system runs a series of simple demos such as:

- **Injecting and calling a student service**
- **Logging bean lifecycle events**
- **Demonstrating lazy initialization**
- **Accessing bean metadata from context**
