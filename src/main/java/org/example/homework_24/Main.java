package homework_24;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        Map<Integer, Customer> customers = new HashMap<>();
        List<CustomerWithId> customerList = new ArrayList<>();

        customerList.add(new CustomerWithId("Petro", "Petriv"));
        customerList.add(new CustomerWithId("Ivan", "Ivaniv"));
        customerList.add(new CustomerWithId("some name", "some surname"));
        customerList.add(new CustomerWithId("Stepan", "Stepaniv"));
        customerList.add(new CustomerWithId("Anna", "Annivna"));

        customers = customerList.stream()
                .collect(Collectors.toMap(
                        CustomerWithId::getId,
                        customerWithId -> new Customer(customerWithId.getName(), customerWithId.getSurname())
                ));


        System.out.println(customers.values());
        Set<Integer> keySet = customers.keySet();
        System.out.println(keySet);
        System.out.println(customers);

    }
}

