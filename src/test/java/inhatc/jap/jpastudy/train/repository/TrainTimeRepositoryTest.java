package inhatc.jap.jpastudy.train.repository;

import inhatc.jap.jpastudy.train.entity.TrainTime;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.*;
import java.util.Arrays;

@SpringBootTest
class TrainTimeRepositoryTest {

    @Autowired
    private TrainTimeRepository trainTimeRepository;

    @Test
    @DisplayName("TrainTime 입력 테스트")
    public void insertSalesTest(){
        BufferedReader br = null;
        String line = null;
        try {
            br = new BufferedReader(new FileReader(new File("src/main/resources/data/train_time.csv")));
            while((line = br.readLine()) != null){
                String[] datas = line.split(",");
                Arrays.stream(datas).forEach(System.out::println);

                TrainTime trainTime = TrainTime.builder()
                        .trainNo(datas[0])
                        .runOrder(Integer.parseInt(datas[1]))
                        .stationName(datas[2])
                        .arrivalTime(datas[3])
                        .departureTime(datas[4].trim())
                        .build();
                trainTimeRepository.save(trainTime);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        trainTimeRepository.findAll().forEach(System.out::println);

    }
}