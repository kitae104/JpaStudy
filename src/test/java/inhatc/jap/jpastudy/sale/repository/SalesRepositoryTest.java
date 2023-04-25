package inhatc.jap.jpastudy.sale.repository;

import inhatc.jap.jpastudy.info.entity.ClassInfo;
import inhatc.jap.jpastudy.info.repository.ClassInfoRepository;
import inhatc.jap.jpastudy.sale.entity.Sales;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.*;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class SalesRepositoryTest {

    @Autowired
    private SalesRepository salesRepository;

    @Test
    @DisplayName("Sales 입력 테스트")
    public void insertSalesTest(){
        BufferedReader br = null;
        String line = null;
        try {
            br = new BufferedReader(new FileReader(new File("src/main/resources/data/sales.csv")));
            while((line = br.readLine()) != null){
                String[] datas = line.split(",");
                Arrays.stream(datas).forEach(System.out::println);

                Sales sales = Sales.builder()
                        .salesDate(datas[0])
                        .seqNo(Integer.parseInt(datas[1]))
                        .productName(datas[2])
                        .price(Integer.parseInt(datas[3]))
                        .salesCount(Integer.parseInt(datas[4].trim()))
                        .build();
                salesRepository.save(sales);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        salesRepository.findAll().forEach(System.out::println);

    }
}