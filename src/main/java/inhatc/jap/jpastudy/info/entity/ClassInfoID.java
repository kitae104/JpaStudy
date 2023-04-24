package inhatc.jap.jpastudy.info.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

import java.io.Serializable;

@Data
public class ClassInfoID implements Serializable {

    private String classCode;

    private String className;
}
