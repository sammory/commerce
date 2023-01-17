package com.zero.cms.domain.model;

import lombok.Getter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@Getter
@MappedSuperclass  // 부모 클래스를 상속받는 자식 클래스에 매핑 정보만 제공하며 속성을 같이 쓰고 싶을 때 적용
@EntityListeners(value = {AuditingEntityListener.class}) //엔티티의 변화를 감지하고 데이블의 데이터를 조작하는 일을 한다.
public class BaseEntity {

    @CreatedDate
    private LocalDateTime createdAt; // Entity가 생성되어 저장될 때 시간이 자동 저장
    @LastModifiedDate
    private LocalDateTime modifiedAt; // 조회한 Entity의 값을 변경할 때 시간이 자동 저장
}
