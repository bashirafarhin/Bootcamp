package com.ttn.ck.dto;

import lombok.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@ToString
public class Employee implements Comparable<Employee>{
    @EqualsAndHashCode.Include
    Integer id;
    String name;
    String dept;

    @Override
    public int compareTo(Employee other) {
        // Sorting by 'id'. You can modify this to sort by 'name' or any other attribute.
        return Integer.compare(this.id, other.id);
    }

}
