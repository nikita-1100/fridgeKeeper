package com.example.fridgekeeper.entity;

import lombok.*;
import org.springframework.data.util.ProxyUtils;
import org.springframework.util.Assert;

import javax.persistence.*;

import lombok.*;
        import org.springframework.data.util.ProxyUtils;
        import org.springframework.util.Assert;

        import javax.persistence.*;
import java.util.Objects;

@MappedSuperclass
@Access(AccessType.FIELD)
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PROTECTED)
@ToString
public abstract class BaseEntityWithBarcode {

    @Id
    protected String id;

    public String id() {
        Assert.notNull(id, "Entity must have id");
        return id;
    }


    public boolean isNew() {
        return id == null;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BaseEntityWithBarcode that = (BaseEntityWithBarcode) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }


    //    @Override
//    public boolean equals(Object o) {
//        if (this == o) {
//            return true;
//        }
//        if (o == null || !getClass().equals(ProxyUtils.getUserClass(o))) {
//            return false;
//        }
//        BaseEntity that = (BaseEntity) o;
//        return id != null && id.equals(that.id);
//    }
//
//    @Override
//    public int hashCode() {
//        return id == null ? 0 : id;
//    }
}
