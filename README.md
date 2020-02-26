# CleanArchitecture :heart_eyes: :v:

Here’s a brief definition of some terms from the images above to help you get more familiar with this approach::relaxed:

**Entities** are enterprise-wide business rules that encapsulate the most general business rules and also contain Data Transfer Objects (DTOs). When something external changes, these rules are the least likely to change.


**Use cases** are also called interactors and stand for application-specific business rules of the software. This layer is isolated from changes to the database, common frameworks, and the UI.


**Interface adapters** convert data from a convenient format for entities and use cases to a format applicable to databases and the web, for example. This layer includes Presenters from MVP, ViewModel from MVVM, and Gateways (also known as Repositories).


**Frameworks and drivers** are the outermost layer, which consists of the web framework, database, UI, HTTP client, and so on.




![clean-architecture-1x](https://user-images.githubusercontent.com/26750131/75090089-b6395780-5574-11ea-931a-c7e025cf99ca.png)

![Artboard_15587](https://user-images.githubusercontent.com/26750131/75090112-f993c600-5574-11ea-96f7-f8e4367d513f.png)


As you can see in the image, an Android application with Clean Architecture gathers the layers into three modules:

**Presentation**, which includes the UI, Presenter, and ViewModels

**Domain**, which includes Entities and Interactors

**Data**, which includes Databases and Rest clients

----

***Here’s a short list of technologies used in this example:*** :sunglasses:

**Kotlin** ‒ A statically typed programming language for modern multi-platform applications; Google rates Kotlin a first-class language for writing Android apps

**Dagger 2** ‒ A fully static, compile-time dependency injection framework for both Java and Android

**RxJava 2** ‒ Reactive Extensions for the Java Virtual Machine (JVM) – a library for composing asynchronous and event-based 
programs using observable sequences for the JVM

**Retrofit 2** ‒ A type-safe HTTP client for Android and Java

--
Along with the Clean Architecture approach, the following Android architecture components will also be used in the application:

**Room** ‒ Provides an abstraction layer over SQLite to allow for more robust database access while harnessing the full power of SQLite

**ViewModel** ‒ Designed to store and manage UI-related data in a life cycle-conscious way

**LiveData** ‒ An observable data holder class that, unlike a regular observable, is life cycle-aware, meaning it respects the lifecycle of other app components such as activities, fragments, and services

**Paging Library** ‒ Makes it easier for you to load data gradually and gracefully within your app’s RecyclerView

-----

[Resource](https://rubygarage.org/blog/clean-android-architecture)

[Resource1](https://caster.io/lessons/android-clean-architecture-android-and-clean-architecture) :muscle:


[Resource2](https://www.youtube.com/watch?v=G_UFfOO8E5s)

