# Voting Application - Spring Core Demo

This simple Java application demonstrates key Spring Framework concepts: **Inversion of Control (IoC)**, **Dependency Injection (DI)**, **Bean Scopes**, and **Bean Life Cycle**.

---

## Key Concepts

### 1. Inversion of Control (IoC)  
Spring manages object creation and lifecycle, so you don't use `new` directly. The Spring container creates and injects beans.

### 2. Dependency Injection (DI)  
Spring injects required dependencies automatically. When multiple beans of the same type exist, manual injection is preferred to avoid conflicts.

### 3. Bean Scopes  
- **Singleton (default):** One shared instance per container.  
- **Prototype:** New instance every time requested (use `@Scope("prototype")`).

### 4. Bean Life Cycle  
Beans can define init and destroy methods using annotations (`@PostConstruct`, `@PreDestroy`).
