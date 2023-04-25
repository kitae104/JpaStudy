package inhatc.jap.jpastudy.info.repository;

import inhatc.jap.jpastudy.info.entity.ClassInfo;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.*;
import java.util.Arrays;

@SpringBootTest
class ClassInfoRepositoryTest {

    @Autowired
    private ClassInfoRepository classInfoRepository;

    @Test
    @DisplayName("ClassInfo 입력 테스트")
    public void insertClassInfoTest(){
        BufferedReader br = null;
        String line = null;
        try {
            br = new BufferedReader(new FileReader(new File("src/main/resources/data/class_info.csv")));
            while((line = br.readLine()) != null){
                String[] datas = line.split(",");
                Arrays.stream(datas).forEach(System.out::println);

                ClassInfo classInfo = ClassInfo.builder()
                        .classCode(datas[0])
                        .className(datas[1])
                        .build();
                classInfoRepository.save(classInfo);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        classInfoRepository.findAll().forEach(System.out::println);

    }
}