package inhatc.jap.jpastudy.point.repository;

import inhatc.jap.jpastudy.customer.entity.Customer;
import inhatc.jap.jpastudy.point.entity.Point;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.*;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class PointRepositoryTest {

    @Autowired
    private PointRepository pointRepository;

    @Test
    @DisplayName("Point 입력 테스트")
    public void insertPointTest(){
        BufferedReader br = null;
        String line = null;
        try {
            br = new BufferedReader(new FileReader(new File("src/main/resources/data/point.csv")));
            while((line = br.readLine()) != null){
                String[] datas = line.split(",");
                Arrays.stream(datas).forEach(System.out::println);

                Point point = Point.builder()
                        .customerCode(datas[0])
                        .seqNo(Long.parseLong(datas[1]))
                        .pointMemo(datas[2])
                        .point(Integer.parseInt(datas[3]))
                        .regDate(datas[4].trim())
                        .build();
                pointRepository.save(point);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        pointRepository.findAll().forEach(System.out::println);

    }
}