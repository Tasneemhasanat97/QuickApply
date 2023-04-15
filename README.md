# QuickApply

QuickApply is an application that helps students apply for college programs based on their SAT scores and GPAs. It provides a simple and efficient way to manage student profiles, college information, and program applications.

![Demo Screenshot 1](./screenshots/demo1.png)
![Demo Screenshot 2](./screenshots/demo2.png)

## Features

- Create and manage student profiles
- Add and view college information
- Apply for college programs
- Search for colleges and programs based on student profiles
- Perform JUnit and component tests to ensure the robustness of the application

## Design Patterns

### Singleton Pattern (initial implementation)

Pros:
- Ensures a single instance of the QuickApply class
- Provides a global point of access to the instance

Cons:
- Inflexible and hard to extend or test
- Could introduce unnecessary dependencies between classes

### Factory Pattern (updated implementation)

Pros:
- Encapsulates object creation and makes it easier to manage
- Enables flexibility in choosing which concrete implementation to use at runtime
- Supports dependency injection for better testability

Cons:
- Adds complexity with additional classes and interfaces
- May require additional maintenance as new concrete implementations are added

## Testing

### JUnit Tests

JUnit tests are included to verify the functionality of the QuickApply application, including:

- Student profile creation and retrieval
- College information management
- Application submission and retrieval

### Component Tests

A component test is also included to test the integration between the QuickApply application and its components, such as the user interface and the data storage.

## Usage

1. Clone the repository and navigate to the project folder.
2. Compile and run the application.
3. Follow the prompts to create student profiles, add college information, and apply for programs.

## Contributing

Contributions are welcome! Please submit a pull request or create an issue to discuss any proposed changes.

## License

This project is licensed under the [MIT License](./LICENSE.md).
