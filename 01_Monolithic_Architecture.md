# Monolithic Architecture

Monolithic Architecture is an architecture whose all functionalities are developed in a single application.

**Ex:** If there is a banking application, then all different functionalities like net banking, mobile banking, debit card, credit card, etc., are available in a single application.

When we develop all these functionalities in one project, it is known as a Monolithic Architectural project.

## Problem/Challenges with Monolithic Architecture

1) **Tightly Coupling**

    As there are multiple functionalities in a single application (e.g., net banking, mobile banking, debit card, credit card functionalities), if one class gets modified, it may impact the other functionalities. So, when we go for Monolithic Architecture Development, the project functionalities are tightly coupled.

2) **Maintenance is Difficult**

    When we make a minor change in a monolithic architecture application, it can impact other functionalities, so maintaining it becomes difficult and challenging.

3) **Re-Deploy the Entire Application**

    When we make any minor change in the application, we need to redeploy the entire application. So, re-deployment risks are also present.

4) **Technology Dependent**

    With monolithic architecture, we need to develop the entire application using one technology. So, it is technology dependent.

5) **Burden on Server**

    When the entire application has so many functionalities like net banking, mobile banking, credit card, debit card, loans, etc., and these functionalities are accessed by multiple users, it can cause a burden on the server. This burden can lead to a server crash.

6) **Single Point of Failure**

    When one module fails for any reason, the entire application will fail. If our server goes down, the entire application will be down because all the functionalities are in a single unit of the application.

To overcome these problems, Microservices came into the picture.
