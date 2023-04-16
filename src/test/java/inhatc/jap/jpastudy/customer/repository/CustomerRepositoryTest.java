package inhatc.jap.jpastudy.customer.repository;

import inhatc.jap.jpastudy.customer.entity.Customer;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.*;
import java.util.Arrays;

@SpringBootTest
class CustomerRepositoryTest {

    @Autowired
    private CustomerRepository customerRepository;

    //@Transactional
    @Test
    @DisplayName("데이터 입력")
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
}