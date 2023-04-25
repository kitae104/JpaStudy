package inhatc.jap.jpastudy.info.repository;

import inhatc.jap.jpastudy.info.entity.ItemInfo;
import inhatc.jap.jpastudy.point.entity.Point;
import inhatc.jap.jpastudy.point.repository.PointRepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.*;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ItemInfoRepositoryTest {

    @Autowired
    private ItemInfoRepository itemInfoRepository;

    @Test
    @DisplayName("ItemInfo 입력 테스트")
    public void insertItemInfoTest(){
        BufferedReader br = null;
        String line = null;
        try {
            br = new BufferedReader(new FileReader(new File("src/main/resources/data/item_info.csv")));
            while((line = br.readLine()) != null){
                String[] datas = line.split(",");
                Arrays.stream(datas).forEach(System.out::println);

                ItemInfo itemInfo = ItemInfo.builder()
                        .itemCode(datas[0])
                        .itemName(datas[1])
                        .build();
                itemInfoRepository.save(itemInfo);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        itemInfoRepository.findAll().forEach(System.out::println);

    }
}