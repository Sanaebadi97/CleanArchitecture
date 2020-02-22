# CleanArchitecture

Here’s a brief definition of some terms from the images above to help you get more familiar with this approach:

**Entities** are enterprise-wide business rules that encapsulate the most general business rules and also contain Data Transfer Objects (DTOs). When something external changes, these rules are the least likely to change.


**Use cases** are also called interactors and stand for application-specific business rules of the software. This layer is isolated from changes to the database, common frameworks, and the UI.


**Interface adapters** convert data from a convenient format for entities and use cases to a format applicable to databases and the web, for example. This layer includes Presenters from MVP, ViewModel from MVVM, and Gateways (also known as Repositories).


**Frameworks and drivers** are the outermost layer, which consists of the web framework, database, UI, HTTP client, and so on.




![clean-architecture-1x](https://user-images.githubusercontent.com/26750131/75090089-b6395780-5574-11ea-931a-c7e025cf99ca.png)

![Artboard_15587](https://user-images.githubusercontent.com/26750131/75090112-f993c600-5574-11ea-96f7-f8e4367d513f.png)


As you can see in the image, an Android application with Clean Architecture gathers the layers into three modules:

**Presentation**, which includes the UI, Presenter, and ViewModels

**Domain**, which includes Entities and Interactors

Data, which includes Databases and Rest clients
