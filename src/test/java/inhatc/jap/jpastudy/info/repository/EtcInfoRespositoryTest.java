package inhatc.jap.jpastudy.info.repository;

import inhatc.jap.jpastudy.info.entity.EtcInfo;
import inhatc.jap.jpastudy.point.entity.Point;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.*;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class EtcInfoRespositoryTest {

    @Autowired
    private EtcInfoRespository etcInfoRespository;

    @Test
    @DisplayName("EtcInfo 입력 테스트")
    public void insertEtcInfoTest(){
        BufferedReader br = null;
        String line = null;
        try {
            br = new BufferedReader(new FileReader(new File("src/main/resources/data/etc_info.csv")));
            while((line = br.readLine()) != null){
                String[] datas = line.split(",");
                Arrays.stream(datas).forEach(System.out::println);

                String strList = "";
                for (int i = 2; i < datas.length-1; i++) {
                    strList += datas[i]+ ",";
                }
                strList += datas[datas.length-1];

                EtcInfo point = EtcInfo.builder()
                        .customerCode(datas[0])
                        .customerEnglishName(datas[1])
                        .itemList(strList)
                        .build();
                etcInfoRespository.save(point);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        etcInfoRespository.findAll().forEach(System.out::println);

    }
}