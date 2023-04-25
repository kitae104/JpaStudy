package inhatc.jap.jpastudy.grade.repository;

import inhatc.jap.jpastudy.grade.entity.Grade;
import inhatc.jap.jpastudy.grade.entity.Grade07;
import inhatc.jap.jpastudy.grade.entity.Grade08;
import inhatc.jap.jpastudy.grade.entity.Grade09;
import inhatc.jap.jpastudy.info.entity.ItemInfo;
import inhatc.jap.jpastudy.info.repository.ItemInfoRepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.*;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class GradeRepositoryTest {

    @Autowired
    private GradeRepository gradeRepository;

    @Autowired
    private Grade07Repository grade07Repository;

    @Autowired
    private Grade08Repository grade08Repository;

    @Autowired
    private Grade09Repository grade09Repository;

    @Test
    @DisplayName("Grade 입력 테스트")
    public void insertGradeTest(){
        BufferedReader br = null;
        String line = null;
        try {
            br = new BufferedReader(new FileReader(new File("src/main/resources/data/grade.csv")));
            while((line = br.readLine()) != null){
                String[] datas = line.split(",");
                Arrays.stream(datas).forEach(System.out::println);

                Grade grade = Grade.builder()
                        .classCode(datas[0])
                        .studentNo(Integer.parseInt(datas[1]))
                        .studentName(datas[2])
                        .kor(Integer.parseInt(datas[3].trim()))
                        .eng(Integer.parseInt(datas[4].trim()))
                        .math(Integer.parseInt(datas[5].trim()))
                        .tot(Integer.parseInt(datas[6].trim()))
                        .avg(Double.parseDouble(datas[7].trim()))
                        .build();
                gradeRepository.save(grade);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        gradeRepository.findAll().forEach(System.out::println);
    }

    @Test
    @DisplayName("Grade07 입력 테스트")
    public void insertGrade07Test(){
        BufferedReader br = null;
        String line = null;
        try {
            br = new BufferedReader(new FileReader(new File("src/main/resources/data/grade_07.csv")));
            while((line = br.readLine()) != null){
                String[] datas = line.split(",");
                Arrays.stream(datas).forEach(System.out::println);

                Grade07 grade07 = Grade07.builder()
                        .testCode(datas[0])
                        .kor(Integer.parseInt(datas[1].trim()))
                        .eng(Integer.parseInt(datas[2].trim()))
                        .math(Integer.parseInt(datas[3].trim()))
                        .build();
                grade07Repository.save(grade07);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        grade07Repository.findAll().forEach(System.out::println);
    }

    @Test
    @DisplayName("Grade08 입력 테스트")
    public void insertGrade08Test(){
        BufferedReader br = null;
        String line = null;
        try {
            br = new BufferedReader(new FileReader(new File("src/main/resources/data/grade_08.csv")));
            while((line = br.readLine()) != null){
                String[] datas = line.split(",");
                Arrays.stream(datas).forEach(System.out::println);

                Grade08 grade08 = Grade08.builder()
                        .testCode(datas[0])
                        .kor(Integer.parseInt(datas[1].trim()))
                        .eng(Integer.parseInt(datas[2].trim()))
                        .math(Integer.parseInt(datas[3].trim()))
                        .build();
                grade08Repository.save(grade08);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        grade08Repository.findAll().forEach(System.out::println);
    }

    @Test
    @DisplayName("Grade09 입력 테스트")
    public void insertGrade09Test(){
        BufferedReader br = null;
        String line = null;
        try {
            br = new BufferedReader(new FileReader(new File("src/main/resources/data/grade_09.csv")));
            while((line = br.readLine()) != null){
                String[] datas = line.split(",");
                Arrays.stream(datas).forEach(System.out::println);

                Grade09 grade09 = Grade09.builder()
                        .testCode(datas[0])
                        .kor(Integer.parseInt(datas[1].trim()))
                        .eng(Integer.parseInt(datas[2].trim()))
                        .math(Integer.parseInt(datas[3].trim()))
                        .build();
                grade09Repository.save(grade09);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        grade09Repository.findAll().forEach(System.out::println);
    }
}