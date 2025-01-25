## Microservices

Microservice is an architectural design pattern.

It is a universal design pattern, and anyone can use this architecture to develop applications. Any technology like Java, Python, .NET can use this pattern and make their application a microservice architecture.

## Advantages of Microservices

1) **Loosely Coupled**

    Every API will be developed as a separate API. In our application, if there are several modules available, then every module is developed in a separate application. Every module will have its own DB. When we make changes to one API, it will not impact other APIs.

    **Ex:** MakeMyTrip application has several modules/functionalities like train ticket booking, hotel booking, flight ticket booking, cab booking, holiday packages, etc. So, if these modules are developed in different applications, each having its own database, then if any minor change in one module occurs, it will not impact the other modules.

2) **Burden Reduced on Server**

    As every module/functionality is developed in a separate project and deployed on a separate server, the burden on the server is reduced.

3) **Easy Maintenance**

    Maintenance becomes easy because of loose coupling. If one of the modules needs to be changed, we can easily change it without affecting other modules.

4) **No Single Point of Failure**

    When any of our modules fail, the other modules will still work without being affected. If one server goes down, the application will still work; only the failed server will not work. So, it will not affect other servers or modules.

5) **Technology Independent**

    Every functionality/module can be developed in a different technology.
    - One module can be developed using Java.
    - Another using Python.
    - Another using Node.js.
    
    This makes microservices technology independent.

## Challenges of Microservices

1) **Bounded Context**

    Bounded context means identifying how many microservices we need to deploy for one application and deciding which functionality we need to add in microservices. If there are 100 requirements, then deciding which requirement should be inside which microservice to define that boundary is challenging.

2) **Repeated Configuration**

    If we are working with microservices, we will need to configure each service. So, if there are 100 microservices, we need to do the same 100 repeated configurations for every microservice.

    **Ex:** If my application has Hotel Booking, Train Ticket Booking, and Cab Booking, then for every service, we will have repeated configurations like DB configurations, security configurations, Kafka configurations. So, repeated configurations are a significant disadvantage in microservices.

3) **Visibility**

    You may not get the chance to work with all the microservices within the application, so you will not get complete clarity on the project. So, if there are 100 microservices, you will only work with a few microservices, and the entire application flow and clarity will not be understood.
