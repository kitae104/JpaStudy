package inhatc.jap.jpastudy.customer.repository;

import inhatc.jap.jpastudy.customer.entity.AddCustomer;
import inhatc.jap.jpastudy.customer.entity.Customer;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.*;
import java.util.Arrays;
import java.util.List;

@SpringBootTest
class CustomerRepositoryTest {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private AddCustomerRepository addCustomerRepository;

    //@Transactional
    @Test
    @DisplayName("Customer 입력")
    public void insertData(){
        BufferedReader br = null;
        String line = null;
        try {
            br = new BufferedReader(new FileReader(new File("src/main/resources/data/customer.csv")));
            while((line = br.readLine()) != null){
                String[] datas = line.split(",");
                Arrays.stream(datas).forEach(System.out::println);

                Customer customer = Customer.builder()
                        .customerCode(datas[0])
                        .customerName(datas[1])
                        .flag(datas[2])
                        .birthDay(datas[3])
                        .phoneNumber(datas[4])
                        .email(datas[5])
                        .totalPoint(Integer.parseInt(datas[6]))
                        .regDate(datas[7].trim())
                        .build();
                customerRepository.save(customer);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        customerRepository.findAll().forEach(System.out::println);

    }

    @Test
    @DisplayName("AddCustomer 입력")
    public void insertAddCustomer(){
        BufferedReader br = null;
        String line = null;
        try {
            br = new BufferedReader(new FileReader(new File("src/main/resources/data/add_customer.csv")));
            while((line = br.readLine()) != null){
                String[] datas = line.split(",");
                Arrays.stream(datas).forEach(System.out::println);

                AddCustomer customer = AddCustomer.builder()
                        .customerCode(datas[0])
                        .customerName(datas[1])
                        .flag(datas[2])
                        .birthDay(datas[3])
                        .phoneNumber(datas[4])
                        .build();
                addCustomerRepository.save(customer);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        addCustomerRepository.findAll().forEach(System.out::println);
    }

    @Test
    @DisplayName("where 절 테스트")
    public void whereTest(){
        List<Customer> customers = customerRepository.findByCustomerName("나경숙");
        customers.forEach(System.out::println);
    }

    @Test
    @DisplayName("where 절 테스트2")
    public void whereTest2(){
        List<Customer> customers = customerRepository.findByFlag("M");
        customers.forEach(System.out::println);
    }

    @Test
    @DisplayName("AND 테스트")
    public void andTest(){
        List<Customer> customers = customerRepository.findByCustomerCodeAfterAndFlag("2019000", "W");
        customers.forEach(System.out::println);
    }

    @Test
    @DisplayName("AND2 테스트")
    public void andTest2(){
        List<Customer> customers = customerRepository.findByBirthDayBeforeAndFlag("1990101", "M");
        customers.forEach(System.out::println);
    }

    @Test
    @DisplayName("OR 테스트")
    public void orTest(){
        List<Customer> customers = customerRepository.findByBirthDayAfterOrTotalPointGreaterThan("19900101", 20000);
        customers.forEach(System.out::println);
    }

    @Test
    @DisplayName("OR 테스트2")
    public void orTest2(){
        List<Customer> customers = customerRepository.findByBirthDayBeforeOrTotalPointGreaterThan("19900101", 20000);
        customers.forEach(System.out::println);
    }

    @Test
    @DisplayName("BETWEEN AND 테스트")
    public void betweenTest(){
        List<Customer> customers = customerRepository.findByFlagAndTotalPointBetween("W", 10000, 20000);
        customers.forEach(System.out::println);
    }

    @Test
    @DisplayName("BETWEEN AND 테스트2")
    public void betweenTest2(){
        List<Customer> customers = customerRepository.findByBirthDayBetween("19800101", "19891231");
        customers.forEach(System.out::println);
    }

    @Test
    @DisplayName("BETWEEN AND 테스트3")
    public void betweenTest3(){
        List<Customer> customers = customerRepository.findByTotalPointBetween(10000, 30000);
        customers.forEach(System.out::println);
    }
}