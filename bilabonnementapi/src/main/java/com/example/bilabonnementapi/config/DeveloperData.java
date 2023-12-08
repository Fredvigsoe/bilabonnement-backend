package com.example.bilabonnementapi.config;

import com.example.bilabonnementapi.entity.Car;
import com.example.bilabonnementapi.entity.Customer;
import com.example.bilabonnementapi.entity.DamageReport;
import com.example.bilabonnementapi.entity.Subscription;
import com.example.bilabonnementapi.repository.ICarRepository;
import com.example.bilabonnementapi.repository.ICustomerRepository;
import com.example.bilabonnementapi.repository.IDamageReportRepository;
import com.example.bilabonnementapi.repository.ISubscriptionRepository;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.Date;

@Configuration
public class DeveloperData implements ApplicationRunner{

    ICarRepository carRepo;
    ISubscriptionRepository subRepo;
    ICustomerRepository customerRepo;
    IDamageReportRepository dmgRepo;

    public DeveloperData(ICarRepository carRepo, ISubscriptionRepository subRepo, ICustomerRepository customerRepo, IDamageReportRepository dmgRepo) {
        this.carRepo = carRepo;
        this.subRepo = subRepo;
        this.customerRepo = customerRepo;
        this.dmgRepo = dmgRepo;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        Car car1 = new Car("","Chevrolet", "c5", 190000, "benz", "reg51z", "aa238f1",false);
        Car car2 = new Car("","Kia ID1", "k44", 330000, "el", "reg52z", "bb238f1",false);
        Car car3 = new Car("","Volvo", "v40", 680000, "el", "reg53z", "cc238f1",false);
        Car car4 = new Car("","Land Rover", "lr1", 1400000, "diesel", "reg54z", "dd238f1",false);
        Car car5 = new Car("","Porsche Panamera", "PP32", 1609000, "hybrid", "reg55z", "ee238f1",false);
        Car car6 = new Car("","Mitsubishi", "M2", 350000, "benz", "reg56z", "ff238f1",false);
        Car car7 = new Car("","Volkswagen ID3", "V23", 400000, "el", "reg57z", "gg238f1",false);
        Car car8 = new Car("","Renault", "R1", 540000, "benz", "reg58z", "hh238f1",false);
        Car car9 = new Car("","Land Rover", "lr10", 6579000, "diesel", "reg59z", "ll238f1",false);
        Car car10 = new Car("","Smart", "S120", 680000, "benz", "reg61z", "mm238f1",false);
        Car car11 = new Car("https://i.imgur.com/2Q4QCiy.png","BMW ID3", "BC2", 790000, "el", "reg62z", "nn238f1",true);
        Car car12 = new Car("","BMW ID4", "BC4", 799000, "el", "reg63z", "oo238f1",true);
        Car car13 = new Car("https://i.imgur.com/TKzxmrz.png","Porsche Taycan", "pt112", 1690000, "el", "reg64z", "pp238f1",true);
        Car car14 = new Car("https://i.imgur.com/ckf5tBk.png","Volkswagen", "V12", 250000, "diesel", "reg65z", "aa308f1",true);
        Car car15 = new Car("https://i.imgur.com/TukSeEi.png","Ford", "fturbo", 356454, "hybrid", "reg66z", "bb308f1",true);
        Car car16 = new Car("https://i.imgur.com/OBp2v1a.png","Volvo", "V123", 357000, "hybrid", "reg67z", "cc308f1",true);
        Car car17 = new Car("https://i.imgur.com/BGb4NES.png","Kia ID2", "k12", 860000, "benz", "reg68z", "dd338f1",true);
        Car car18 = new Car("https://i.imgur.com/RIMCl3G.png","Jaguar", "j82", 780000, "diesel", "reg69z", "ee2218f1",true);
        Car car19 = new Car("https://i.imgur.com/3GD2omN.png","Tesla", "T22", 1203433, "el", "reg70z", "ff238f5",true);

        carRepo.save(car1);
        carRepo.save(car2);
        carRepo.save(car3);
        carRepo.save(car4);
        carRepo.save(car5);
        carRepo.save(car6);
        carRepo.save(car7);
        carRepo.save(car8);
        carRepo.save(car9);
        carRepo.save(car10);
        carRepo.save(car11);
        carRepo.save(car12);
        carRepo.save(car13);
        carRepo.save(car14);
        carRepo.save(car15);
        carRepo.save(car16);
        carRepo.save(car17);
        carRepo.save(car18);
        carRepo.save(car19);

        Customer customer1 = new Customer("Emma", "Smith", "Address6", 6000, "City6", 6000000, "emma.smith@test.com", 6000000000l);
        Customer customer2 = new Customer("Liam", "Johnson", "Address7", 7000, "City7", 7000000, "liam.johnson@test.com", 7000000000l);
        Customer customer3 = new Customer("Olivia", "Williams", "Address8", 8000, "City8", 8000000, "olivia.williams@test.com", 8000000000l);
        Customer customer4 = new Customer("Noah", "Jones", "Address9", 9000, "City9", 9000000, "noah.jones@test.com", 9000000000l);
        Customer customer5 = new Customer("Ava", "Brown", "Address10", 10000, "City10", 10000000, "ava.brown@test.com", 10000000000l);
        Customer customer6 = new Customer("Ethan", "Davis", "Address11", 11000, "City11", 11000000, "ethan.davis@test.com", 11000000000l);
        Customer customer7 = new Customer("Isabella", "Miller", "Address12", 12000, "City12", 12000000, "isabella.miller@test.com", 12000000000l);
        Customer customer8 = new Customer("Lucas", "Wilson", "Address13", 13000, "City13", 13000000, "lucas.wilson@test.com", 13000000000l);
        Customer customer9 = new Customer("Mia", "Moore", "Address14", 14000, "City14", 14000000, "mia.moore@test.com", 14000000000l);
        Customer customer10 = new Customer("Mason", "Taylor", "Address15", 15000, "City15", 15000000, "mason.taylor@test.com", 15000000000l);

        customerRepo.save(customer1);
        customerRepo.save(customer2);
        customerRepo.save(customer3);
        customerRepo.save(customer4);
        customerRepo.save(customer5);
        customerRepo.save(customer6);
        customerRepo.save(customer7);
        customerRepo.save(customer8);
        customerRepo.save(customer9);
        customerRepo.save(customer10);

        Subscription sub1 = new Subscription("10-06-2020", "25-12-2021", "25-12-2023", 14815, 19400, 18000,12, car1, customer1);
        Subscription sub2 = new Subscription("23-07-2021", "14-09-2021", "14-09-2022", 21532, 16566, 18000,12, car2, customer2);
        Subscription sub3 = new Subscription("29-07-2021", "18-06-2022", "18-06-2023", 19755, 17599, 18000,12, car3, customer3);
        Subscription sub4 = new Subscription("24-01-2022", "21-12-2022", "21-12-2023", 15899, 19469, 18000,12, car4, customer4);
        Subscription sub5 = new Subscription("07-06-2021", "19-08-2021", "19-08-2022", 19404, 22861, 18000,24, car5, customer5);
        Subscription sub6 = new Subscription("06-06-2021", "29-12-2021", "29-12-2023", 16912, 29169, 36000,24, car6, customer6);
        Subscription sub7 = new Subscription("19-04-2021", "30-07-2021", "30-07-2023", 15530, 27355, 36000,24, car7, customer7);
        Subscription sub8 = new Subscription("10-06-2019", "06-02-2021", "06-02-2023", 19817, 26689, 36000,24, car8, customer8);
        Subscription sub9 = new Subscription("03-04-2020", "03-02-2021", "03-02-2023", 20967, 26017, 36000,24, car9, customer9);
        Subscription sub10 = new Subscription("19-06-2021", "03-12-2021", "03-12-2023", 24170, 27765, 36000,24, car10, customer10);

        subRepo.save(sub1);
        subRepo.save(sub2);
        subRepo.save(sub3);
        subRepo.save(sub4);
        subRepo.save(sub5);
        subRepo.save(sub6);
        subRepo.save(sub7);
        subRepo.save(sub8);
        subRepo.save(sub9);
        subRepo.save(sub10);

        ArrayList list = new ArrayList();

        list.add(sub1);
        list.add(sub2);
        list.add(sub3);
        list.add(sub4);
        list.add(sub5);
        list.add(sub6);
        list.add(sub7);
        list.add(sub8);
        list.add(sub9);
        list.add(sub10);

        DamageReport dmgrep1 = new DamageReport("flækket sidespejl, ødelagt forrude", 800, 2000, sub2);
        DamageReport dmgrep2 = new DamageReport("halvdelen er ikke kommet tilbage", 12000, 0, sub7);

        dmgRepo.save(dmgrep1);
        dmgRepo.save(dmgrep2);

        ArrayList carlist = new ArrayList();
        carlist.add(car1);
        carlist.add(car2);
        carlist.add(car3);
        carlist.add(car4);
        carlist.add(car5);
        carlist.add(car6);
        carlist.add(car7);
        carlist.add(car8);
        carlist.add(car9);
        carlist.add(car10);
        carlist.add(car11);
        carlist.add(car12);
        carlist.add(car13);
        carlist.add(car14);
        carlist.add(car15);
        carlist.add(car16);
        carlist.add(car17);
        carlist.add(car18);
        carlist.add(car19);

    }
}
