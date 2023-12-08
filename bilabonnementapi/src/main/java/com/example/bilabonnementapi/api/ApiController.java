package com.example.bilabonnementapi.api;

import com.example.bilabonnementapi.entity.Car;
import com.example.bilabonnementapi.entity.Customer;
import com.example.bilabonnementapi.entity.DamageReport;
import com.example.bilabonnementapi.entity.Subscription;
import com.example.bilabonnementapi.repository.ICarRepository;
import com.example.bilabonnementapi.repository.ICustomerRepository;
import com.example.bilabonnementapi.repository.IDamageReportRepository;
import com.example.bilabonnementapi.repository.ISubscriptionRepository;
import com.example.bilabonnementapi.service.CarService;
import com.example.bilabonnementapi.service.CustomerService;
import com.example.bilabonnementapi.service.DamageReportService;
import com.example.bilabonnementapi.service.SubscriptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ApiController {

    @Autowired
    private CarService carService;
    @Autowired
    private CustomerService customerService;
    @Autowired
    private DamageReportService damageReportService;
    @Autowired
    private SubscriptionService subscriptionService;

    @GetMapping("/")
    public String getAllEndpoints() {
        return "<!DOCTYPE html>\n" +
                "<html lang=\"en\">\n" +
                "\n" +
                "<head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
                "    <title>Bilabonnement API Documentation</title>\n" +
                "    <style>\n" +
                "        body {\n" +
                "            font-family: Arial, sans-serif;\n" +
                "            line-height: 1.6;\n" +
                "            margin: 20px;\n" +
                "        }\n" +
                "\n" +
                "        h1 {\n" +
                "            color: #333;\n" +
                "        }\n" +
                "\n" +
                "        h2 {\n" +
                "            color: #555;\n" +
                "        }\n" +
                "\n" +
                "        pre {\n" +
                "            white-space: pre-wrap; /* Preserve white space and wrap lines */\n" +
                "            font-family: Consolas, monospace;\n" +
                "            background-color: #f8f8f8;\n" +
                "            padding: 10px;\n" +
                "            border: 1px solid #ddd;\n" +
                "            border-radius: 5px;\n" +
                "            overflow-x: auto;\n" +
                "        }\n" +
                "    </style>\n" +
                "</head>\n" +
                "\n" +
                "<body>\n" +
                "\n" +
                "    <h1>Bilabonnement API Documentation</h1>\n" +
                "\n" +
                "    <pre>\n" +
                "        The Bilabonnement API provides endpoints to manage information related to cars, customers, damage reports, and subscriptions. It allows you to perform CRUD operations (Create, Read, Update, Delete) on these entities.\n" +
                "\n" +
                "        Car Endpoints\n" +
                "        1. Get All Cars\n" +
                "           Endpoint: GET /cars\n" +
                "           Description: Retrieve a list of all cars.\n" +
                "           Response: List of Car objects.\n" +
                "\n" +
                "        2. Get Car by ID\n" +
                "           Endpoint: GET /cars/{id}\n" +
                "           Description: Retrieve details of a specific car by providing its ID.\n" +
                "           Parameters: id (Path Variable): ID of the car.\n" +
                "           Response: Car object.\n" +
                "\n" +
                "        3. Create Car\n" +
                "           Endpoint: POST /cars\n" +
                "           Description: Create a new car.\n" +
                "           Request Body: Car object.\n" +
                "           Response: Created Car object.\n" +
                "\n" +
                "        4. Update Car\n" +
                "           Endpoint: PUT /cars/{id}\n" +
                "           Description: Update details of a specific car by providing its ID.\n" +
                "           Parameters: id (Path Variable): ID of the car.\n" +
                "           Request Body: Updated Car object.\n" +
                "           Response: Updated Car object.\n" +
                "\n" +
                "        5. Delete Car\n" +
                "           Endpoint: DELETE /cars/{id}\n" +
                "           Description: Delete a specific car by providing its ID.\n" +
                "           Parameters: id (Path Variable): ID of the car.\n" +
                "           Response: No content.\n" +
                "\n" +
                "        Customer Endpoints\n" +
                "        1. Get All Customers\n" +
                "           Endpoint: GET /customers\n" +
                "           Description: Retrieve a list of all customers.\n" +
                "           Response: List of Customer objects.\n" +
                "\n" +
                "        2. Get Customer by ID\n" +
                "           Endpoint: GET /customers/{id}\n" +
                "           Description: Retrieve details of a specific customer by providing their ID.\n" +
                "           Parameters: id (Path Variable): ID of the customer.\n" +
                "           Response: Customer object.\n" +
                "\n" +
                "        3. Create Customer\n" +
                "           Endpoint: POST /customers\n" +
                "           Description: Create a new customer.\n" +
                "           Request Body: Customer object.\n" +
                "           Response: Created Customer object.\n" +
                "\n" +
                "        4. Update Customer\n" +
                "           Endpoint: PUT /customers/{id}\n" +
                "           Description: Update details of a specific customer by providing their ID.\n" +
                "           Parameters: id (Path Variable): ID of the customer.\n" +
                "           Request Body: Updated Customer object.\n" +
                "           Response: Updated Customer object.\n" +
                "\n" +
                "        5. Delete Customer\n" +
                "           Endpoint: DELETE /customers/{id}\n" +
                "           Description: Delete a specific customer by providing their ID.\n" +
                "           Parameters: id (Path Variable): ID of the customer.\n" +
                "           Response: No content.\n" +
                "\n" +
                "        Damage Report Endpoints\n" +
                "        1. Get All Damage Reports\n" +
                "           Endpoint: GET /damagereports\n" +
                "           Description: Retrieve a list of all damage reports.\n" +
                "           Response: List of DamageReport objects.\n" +
                "\n" +
                "        2. Get Damage Report by ID\n" +
                "           Endpoint: GET /damagereports/{id}\n" +
                "           Description: Retrieve details of a specific damage report by providing its ID.\n" +
                "           Parameters: id (Path Variable): ID of the damage report.\n" +
                "           Response: DamageReport object.\n" +
                "\n" +
                "        3. Create Damage Report\n" +
                "           Endpoint: POST /damagereports\n" +
                "           Description: Create a new damage report.\n" +
                "           Request Body: DamageReport object.\n" +
                "           Response: Created DamageReport object.\n" +
                "\n" +
                "        4. Update Damage Report\n" +
                "           Endpoint: PUT /damagereports/{id}\n" +
                "           Description: Update details of a specific damage report by providing its ID.\n" +
                "           Parameters: id (Path Variable): ID of the damage report.\n" +
                "           Request Body: Updated DamageReport object.\n" +
                "           Response: Updated DamageReport object.\n" +
                "\n" +
                "        5. Delete Damage Report\n" +
                "           Endpoint: DELETE /damagereports/{id}\n" +
                "           Description: Delete a specific damage report by providing its ID.\n" +
                "           Parameters: id (Path Variable): ID of the damage report.\n" +
                "           Response: No content.\n" +
                "\n" +
                "        Subscription Endpoints\n" +
                "        1. Get All Subscriptions\n" +
                "           Endpoint: GET /subscriptions\n" +
                "           Description: Retrieve a list of all subscriptions.\n" +
                "           Response: List of Subscription objects.\n" +
                "\n" +
                "        2. Get Subscription by ID\n" +
                "           Endpoint: GET /subscriptions/{id}\n" +
                "           Description: Retrieve details of a specific subscription by providing its ID.\n" +
                "           Parameters: id (Path Variable): ID of the subscription.\n" +
                "           Response: Subscription object.\n" +
                "\n" +
                "        3. Create Subscription\n" +
                "           Endpoint: POST /subscriptions\n" +
                "           Description: Create a new subscription.\n" +
                "           Request Body: Subscription object.\n" +
                "           Response: Created Subscription object.\n" +
                "\n" +
                "        4. Update Subscription\n" +
                "           Endpoint: PUT /subscriptions/{id}\n" +
                "           Description: Update details of a specific subscription by providing its ID.\n" +
                "           Parameters: id (Path Variable): ID of the subscription.\n" +
                "           Request Body: Updated Subscription object.\n" +
                "           Response: Updated Subscription object.\n" +
                "\n" +
                "        5. Delete Subscription\n" +
                "           Endpoint: DELETE /subscriptions/{id}\n" +
                "           Description: Delete a specific subscription by providing its ID.\n" +
                "           Parameters: id (Path Variable): ID of the subscription.\n" +
                "           Response: No content.\n" +
                "\n" +
                "        ####Error Handling\n" +
                "        In case of an error, the API will return an appropriate HTTP status code along with a JSON response containing details about the error.\n" +
                "    </pre>\n" +
                "</body>\n" +
                "\n" +
                "</html>\n";
    }



    //Carcontrollers

    @GetMapping("/cars")
    public ResponseEntity<List<Car>> getAllCars() {
        List<Car> cars = carService.getAllCars();
        return ResponseEntity.ok().body(cars);
    }

    @GetMapping("/cars/{id}")
    public Car getCarById(@PathVariable String id) {
        return carService.getCarById(id);
    }
    @PostMapping("/cars")
    public ResponseEntity<Car> createCar(@RequestBody Car car) {
        Car newCar = carService.createCar(car);
        return new ResponseEntity<>(newCar, HttpStatus.CREATED);
    }

    @PutMapping("/cars/{id}")
    public Car updateCar(@PathVariable String id, @RequestBody Car car) {
        return carService.updateCar(id, car);
    }

    @DeleteMapping("/cars/{id}")
    public void deleteCar(@PathVariable String id) {
        carService.deleteCar(id);
    }

    //Customer controllers

    @GetMapping("/customers")
    public ResponseEntity<List<Customer>> getAllCustomers() {
        List<Customer> customers = customerService.getAllCustomers();
        return ResponseEntity.ok().body(customers);
    }

    @GetMapping("/customers/{id}")
    public ResponseEntity<Customer> getCustomerById(@PathVariable String id) {
        Customer customer = customerService.getCustomerById(id);
        return ResponseEntity.ok().body(customer);
    }

    @PostMapping("/customers")
    public ResponseEntity<Customer> createCustomer(@RequestBody Customer customer) {
        Customer newCustomer = customerService.createCustomer(customer);
        return new ResponseEntity<>(newCustomer, HttpStatus.CREATED);
    }

    @PutMapping("/customers/{id}")
    public ResponseEntity<Customer> updateCustomer(@PathVariable String id, @RequestBody Customer customer) {
        Customer updatedCustomer = customerService.updateCustomer(id, customer);
        return ResponseEntity.ok().body(updatedCustomer);
    }

    @DeleteMapping("/customers/{id}")
    public ResponseEntity<Void> deleteCustomer(@PathVariable String id) {
        customerService.deleteCustomer(id);
        return ResponseEntity.noContent().build();
    }
    // Damage Report Controllers
    @GetMapping("/damagereports")
    public ResponseEntity<List<DamageReport>> getAllDamageReports() {
        List<DamageReport> damageReports = damageReportService.getAllDamageReports();
        return ResponseEntity.ok().body(damageReports);
    }

    @GetMapping("/damagereports/{id}")
    public ResponseEntity<DamageReport> getDamageReportById(@PathVariable String id) {
        DamageReport damageReport = damageReportService.getDamageReportById(id);
        return ResponseEntity.ok().body(damageReport);
    }

    @PostMapping("/damagereports")
    public ResponseEntity<DamageReport> createDamageReport(@RequestBody DamageReport damageReport) {
        DamageReport newDamageReport = damageReportService.createDamageReport(damageReport);
        return new ResponseEntity<>(newDamageReport, HttpStatus.CREATED);
    }

    @PutMapping("/damagereports/{id}")
    public ResponseEntity<DamageReport> updateDamageReport(@PathVariable String id, @RequestBody DamageReport damageReport) {
        DamageReport updatedDamageReport = damageReportService.updateDamageReport(id, damageReport);
        return ResponseEntity.ok().body(updatedDamageReport);
    }

    @DeleteMapping("/damagereports/{id}")
    public ResponseEntity<Void> deleteDamageReport(@PathVariable String id) {
        damageReportService.deleteDamageReport(id);
        return ResponseEntity.noContent().build();
    }


    // Subscription Controllers
    @GetMapping("/subscriptions")
    public ResponseEntity<List<Subscription>> getAllSubscriptions() {
        List<Subscription> subscriptions = subscriptionService.getAllSubscriptions();
        return ResponseEntity.ok().body(subscriptions);
    }

    @GetMapping("/subscriptions/{id}")
    public ResponseEntity<Subscription> getSubscriptionById(@PathVariable String id) {
        Subscription subscription = subscriptionService.getSubscriptionById(id);
        return ResponseEntity.ok().body(subscription);
    }

    @PostMapping("/subscriptions")
    public ResponseEntity<Subscription> createSubscription(@RequestBody Subscription subscription) {
        Subscription newSubscription = subscriptionService.createSubscription(subscription);
        return new ResponseEntity<>(newSubscription, HttpStatus.CREATED);
    }

    @PutMapping("/subscriptions/{id}")
    public ResponseEntity<Subscription> updateSubscription(@PathVariable String id, @RequestBody Subscription subscription) {
        Subscription updatedSubscription = subscriptionService.updateSubscription(id, subscription);
        return ResponseEntity.ok().body(updatedSubscription);
    }

    @DeleteMapping("/subscriptions/{id}")
    public ResponseEntity<Void> deleteSubscription(@PathVariable String id) {
        subscriptionService.deleteSubscription(id);
        return ResponseEntity.noContent().build();
    }
}
