## Bilabonnement API Documentation 

The Bilabonnement API provides endpoints to manage information related to cars, customers, damage reports, and subscriptions. It allows you to perform CRUD operations (Create, Read, Update, Delete) on these entities.


### Car Endpoints

##### 1. Get All Cars
Endpoint: GET /cars <br>
Description: Retrieve a list of all cars. <br>
Response: List of Car objects.

##### 2. Get Car by ID
Endpoint: GET /cars/{id} <br>
Description: Retrieve details of a specific car by providing its ID. <br>
Parameters: id (Path Variable): ID of the car. <br>
Response: Car object.

##### 3. Create Car
Endpoint: POST /cars <br>
Description: Create a new car. <br>
Request Body: Car object. <br>
Response: Created Car object.

##### 4. Update Car
Endpoint: PUT /cars/{id} <br>
Description: Update details of a specific car by providing its ID. <br>
Parameters: id (Path Variable): ID of the car. <br>
Request Body: Updated Car object. <br>
Response: Updated Car object.

##### 5. Delete Car
Endpoint: DELETE /cars/{id} <br>
Description: Delete a specific car by providing its ID. <br>
Parameters: id (Path Variable): ID of the car. <br>
Response: No content. <br>

### Customer Endpoints

##### 1. Get All Customers
Endpoint: GET /customers <br>
Description: Retrieve a list of all customers. <br>
Response: List of Customer objects.

##### 2. Get Customer by ID
Endpoint: GET /customers/{id} <br>
Description: Retrieve details of a specific customer by providing their ID. <br>
Parameters: id (Path Variable): ID of the customer. <br>
Response: Customer object.

##### 3. Create Customer
Endpoint: POST /customers <br>
Description: Create a new customer. <br>
Request Body: Customer object. <br>
Response: Created Customer object.

##### 4. Update Customer
Endpoint: PUT /customers/{id} <br>
Description: Update details of a specific customer by providing their ID. <br>
Parameters: id (Path Variable): ID of the customer. <br>
Request Body: Updated Customer object. <br>
Response: Updated Customer object.

##### 5. Delete Customer
Endpoint: DELETE /customers/{id} <br>
Description: Delete a specific customer by providing their ID. <br>
Parameters: id (Path Variable): ID of the customer. <br>
Response: No content.

### Damage Report Endpoints

##### 1. Get All Damage Reports
Endpoint: GET /damagereports <br>
Description: Retrieve a list of all damage reports. <br>
Response: List of DamageReport objects. <br>

##### 2. Get Damage Report by ID
Endpoint: GET /damagereports/{id} <br>
Description: Retrieve details of a specific damage report by providing its ID. <br>
Parameters: id (Path Variable): ID of the damage report. <br>
Response: DamageReport object.

##### 3. Create Damage Report
Endpoint: POST /damagereports <br>
Description: Create a new damage report. <br>
Request Body: DamageReport object. <br>
Response: Created DamageReport object.

##### 4. Update Damage Report
Endpoint: PUT /damagereports/{id} <br>
Description: Update details of a specific damage report by providing its ID. <br>
Parameters: id (Path Variable): ID of the damage report. <br>
Request Body: Updated DamageReport object. <br>
Response: Updated DamageReport object.

##### 5. Delete Damage Report
Endpoint: DELETE /damagereports/{id} <br>
Description: Delete a specific damage report by providing its ID. <br>
Parameters: id (Path Variable): ID of the damage report. <br>
Response: No content.

### Subscription Endpoints

##### 1. Get All Subscriptions
Endpoint: GET /subscriptions <br>
Description: Retrieve a list of all subscriptions. <br>
Response: List of Subscription objects. 

##### 2. Get Subscription by ID
Endpoint: GET /subscriptions/{id} <br>
Description: Retrieve details of a specific subscription by providing its ID. <br>
Parameters: id (Path Variable): ID of the subscription. <br>
Response: Subscription object.

##### 3. Create Subscription
Endpoint: POST /subscriptions <br>
Description: Create a new subscription. <br>
Request Body: Subscription object. <br>
Response: Created Subscription object.

##### 4. Update Subscription
Endpoint: PUT /subscriptions/{id} <br>
Description: Update details of a specific subscription by providing its ID. <br>
Parameters: id (Path Variable): ID of the subscription. <br>
Request Body: Updated Subscription object. <br>
Response: Updated Subscription object.

##### 5. Delete Subscription
Endpoint: DELETE /subscriptions/{id} <br>
Description: Delete a specific subscription by providing its ID. <br>
Parameters: id (Path Variable): ID of the subscription. <br>
Response: No content.

#### Error Handling 
In case of an error, the API will return an appropriate HTTP status code along with a JSON response containing details about the error.

WilliELM, JeppNeu123, Fredvigsoe
